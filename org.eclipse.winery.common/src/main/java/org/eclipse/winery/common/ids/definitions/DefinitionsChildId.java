/*******************************************************************************
 * Copyright (c) 2013-2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Oliver Kopp - initial API and implementation
 *******************************************************************************/
package org.eclipse.winery.common.ids.definitions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.xml.namespace.QName;

import org.eclipse.winery.common.Util;
import org.eclipse.winery.common.ids.GenericId;
import org.eclipse.winery.common.ids.Namespace;
import org.eclipse.winery.common.ids.XmlId;

/**
 * Identifies a definitions child. Each component is required to be identified
 * subclasses this class
 *
 * A DefinitionsChildId has a namespace and an id within that namespace. In XML,
 * the ID might be serialized as NCName (in the case of EntityTypes and
 * EntityTemplates) and as xs:id (in the case of EntityTypeImplementations)
 *
 * Components are elements, which may appear directly nested in TDefinitions:
 * <ul>
 * <li>ServiceTemplates,</li>
 * <li>EntityTypes,</li
 * <li>EntityTypeImplementations,</li>
 * <li>EntityTemplates</li>
 * </ul>
 */
public abstract class DefinitionsChildId extends GenericId {

	public static final List<Class<? extends DefinitionsChildId>> ALL_TOSCA_COMPONENT_ID_CLASSES = Arrays.asList(
		ArtifactTemplateId.class,
		ArtifactTypeId.class,
		CapabilityTypeId.class,
		NodeTypeId.class,
		NodeTypeImplementationId.class,
		PolicyTemplateId.class,
		PolicyTypeId.class,
		RelationshipTypeId.class,
		RelationshipTypeImplementationId.class,
		RequirementTypeId.class,
		ServiceTemplateId.class
	);

	private final Namespace namespace;


	public DefinitionsChildId(Namespace namespace, XmlId xmlId) {
		super(xmlId);
		this.namespace = Objects.requireNonNull(namespace);
	}

	/**
	 * Creates a new id based on strings. This constructor is required for {@link org.eclipse.winery.repository.resources.AbstractComponentsResource}
	 *
	 * @param ns         the namespace to be used
	 * @param id         the id to be used
	 * @param URLencoded true: both Strings are URLencoded, false: both Strings are not URLencoded
	 */
	public DefinitionsChildId(String ns, String id, boolean URLencoded) {
		this(new Namespace(ns, URLencoded), new XmlId(id, URLencoded));
	}

	public DefinitionsChildId(QName qname) {
		this(qname.getNamespaceURI(), qname.getLocalPart(), false);
	}

	public QName getQName() {
		return new QName(this.getNamespace().getDecoded(), this.getXmlId().getDecoded());
	}

	public Namespace getNamespace() {
		return this.namespace;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof DefinitionsChildId)) return false;

		// only the same component instances might be equal
		if (!o.getClass().equals(this.getClass())) {
			return false;
		}

		if (!super.equals(o)) return false;

		DefinitionsChildId that = (DefinitionsChildId) o;

		return namespace.equals(that.namespace);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + namespace.hashCode();
		return result;
	}

	@Override
	public String toString() {
		QName qn = this.getQName();
		return this.getClass().toString() + " / " + qn.toString();
	}

	public String toReadableString() {
		QName qn = this.getQName();
		String name = Util.getEverythingBetweenTheLastDotAndBeforeId(this.getClass());
		return String.format("%1$s %3$s in namespace %2$s", name, qn.getNamespaceURI(), qn.getLocalPart());
	}

	@Override
	public GenericId getParent() {
		return null;
	}

	@Override
	public int compareTo(GenericId o1) {
		if (o1 instanceof DefinitionsChildId) {
			int res = this.getClass().getName().compareTo(o1.getClass().toString());
			if (res == 0) {
				DefinitionsChildId o = (DefinitionsChildId) o1;
				res = this.getXmlId().compareTo(o.getXmlId());
				if (res == 0) {
					res = this.getNamespace().compareTo(o.getNamespace());
				}
			}
			return res;
		} else {
			// comparing TOSCAcomponentIDs with non-TOSCAcomponentIDs is not
			// possible
			throw new IllegalStateException();
		}
	}

	public abstract String getGroup();
}
