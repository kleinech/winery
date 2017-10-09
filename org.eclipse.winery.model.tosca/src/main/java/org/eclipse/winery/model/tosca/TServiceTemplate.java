/*******************************************************************************
 * Copyright (c) 2013-2017 University of Stuttgart
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *    Oliver Kopp - initial code generation using vhudson-jaxb-ri-2.1-2
 *    Christoph Kleine - hashcode, equals, builder pattern, Nullable and NonNull annotations
 *******************************************************************************/

package org.eclipse.winery.model.tosca;

import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;


/**
 * <p>Java class for tServiceTemplate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tServiceTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTags" minOccurs="0"/>
 *         &lt;element name="BoundaryDefinitions" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoundaryDefinitions"
 * minOccurs="0"/>
 *         &lt;element name="TopologyTemplate" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTopologyTemplate"/>
 *         &lt;element name="Plans" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tPlans" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="substitutableNodeType" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServiceTemplate", propOrder = {
        "tags",
        "boundaryDefinitions",
        "topologyTemplate",
        "plans"
})
public class TServiceTemplate extends HasId implements HasName, HasTargetNamespace {

    @XmlElement(name = "Tags")
    protected TTags tags;

    @XmlElement(name = "BoundaryDefinitions")
    protected TBoundaryDefinitions boundaryDefinitions;

    @XmlElement(name = "TopologyTemplate", required = true)
    protected TTopologyTemplate topologyTemplate;

    @XmlElement(name = "Plans")
    protected TPlans plans;

    @XmlAttribute(name = "name")
    protected String name;

    @XmlAttribute(name = "targetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;

    @XmlAttribute(name = "substitutableNodeType")
    protected QName substitutableNodeType;

    public TServiceTemplate() {

    }

    public TServiceTemplate(Builder builder) {
        super(builder);
        this.tags = builder.tags;
        this.boundaryDefinitions = builder.boundaryDefinitions;
        this.topologyTemplate = builder.topologyTemplate;
        this.plans = builder.plans;
        this.name = builder.name;
        this.targetNamespace = builder.targetNamespace;
        this.substitutableNodeType = builder.substitutableNodeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TServiceTemplate)) return false;
        if (!super.equals(o)) return false;
        TServiceTemplate that = (TServiceTemplate) o;
        return Objects.equals(tags, that.tags) &&
                Objects.equals(boundaryDefinitions, that.boundaryDefinitions) &&
                Objects.equals(topologyTemplate, that.topologyTemplate) &&
                Objects.equals(plans, that.plans) &&
                Objects.equals(name, that.name) &&
                Objects.equals(targetNamespace, that.targetNamespace) &&
                Objects.equals(substitutableNodeType, that.substitutableNodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tags, boundaryDefinitions, topologyTemplate, plans, name, targetNamespace, substitutableNodeType);
    }

    /**
     * Gets the value of the tags property.
     *
     * @return possible object is {@link TTags }
     */
    @Nullable
    public TTags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     *
     * @param value allowed object is {@link TTags }
     */
    public void setTags(TTags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the boundaryDefinitions property.
     *
     * @return possible object is {@link TBoundaryDefinitions }
     */
    @Nullable
    public TBoundaryDefinitions getBoundaryDefinitions() {
        return boundaryDefinitions;
    }

    /**
     * Sets the value of the boundaryDefinitions property.
     *
     * @param value allowed object is {@link TBoundaryDefinitions }
     */
    public void setBoundaryDefinitions(TBoundaryDefinitions value) {
        this.boundaryDefinitions = value;
    }

    /**
     * Gets the value of the topologyTemplate property.
     *
     * @return possible object is {@link TTopologyTemplate }
     */
    @NonNull
    public TTopologyTemplate getTopologyTemplate() {
        return topologyTemplate;
    }

    /**
     * Sets the value of the topologyTemplate property.
     *
     * @param value allowed object is {@link TTopologyTemplate }
     */
    public void setTopologyTemplate(TTopologyTemplate value) {
        this.topologyTemplate = value;
    }

    @Nullable
    public TPlans getPlans() {
        return plans;
    }

    public void setPlans(TPlans value) {
        this.plans = value;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @Nullable
    public String getTargetNamespace() {
        return targetNamespace;
    }

    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    @Nullable
    public QName getSubstitutableNodeType() {
        return substitutableNodeType;
    }

    public void setSubstitutableNodeType(QName value) {
        this.substitutableNodeType = value;
    }

    public static class Builder extends HasId.Builder<Builder> {
        private final TTopologyTemplate topologyTemplate;

        private TTags tags;
        private TBoundaryDefinitions boundaryDefinitions;
        private TPlans plans;
        private String name;
        private String targetNamespace;
        private QName substitutableNodeType;

        public Builder(String id, TTopologyTemplate topologyTemplate) {
            super(id);
            this.topologyTemplate = topologyTemplate;
        }

        public Builder setTags(TTags tags) {
            this.tags = tags;
            return this;
        }

        public Builder setBoundaryDefinitions(TBoundaryDefinitions boundaryDefinitions) {
            this.boundaryDefinitions = boundaryDefinitions;
            return this;
        }

        public Builder setPlans(TPlans plans) {
            this.plans = plans;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTargetNamespace(String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }

        public Builder setSubstitutableNodeType(QName substitutableNodeType) {
            this.substitutableNodeType = substitutableNodeType;
            return this;
        }

        public Builder addTags(TTags tags) {
            if (tags == null || tags.getTag().isEmpty()) {
                return this;
            }

            if (this.tags == null) {
                this.tags = tags;
            } else {
                this.tags.getTag().addAll(tags.getTag());
            }
            return this;
        }

        public Builder addTags(List<TTag> tags) {
            if (tags == null) {
                return this;
            }

            TTags tmp = new TTags();
            tmp.getTag().addAll(tags);
            return addTags(tmp);
        }

        public Builder addTags(TTag tags) {
            if (tags == null) {
                return this;
            }

            TTags tmp = new TTags();
            tmp.getTag().add(tags);
            return addTags(tmp);
        }

        @Override
        public Builder self() {
            return this;
        }

        public TServiceTemplate build() {
            return new TServiceTemplate(this);
        }
    }
}
