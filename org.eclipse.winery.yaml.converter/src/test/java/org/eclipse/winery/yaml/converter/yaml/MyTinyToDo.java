/*******************************************************************************
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Christoph Kleine - initial API and implementation
 *******************************************************************************/
package org.eclipse.winery.yaml.converter.yaml;

import org.eclipse.winery.common.ids.Namespace;
import org.eclipse.winery.common.ids.XmlId;
import org.eclipse.winery.common.ids.definitions.ArtifactTypeId;
import org.eclipse.winery.common.ids.definitions.NodeTypeId;
import org.eclipse.winery.common.ids.definitions.ServiceTemplateId;
import org.eclipse.winery.model.tosca.Definitions;
import org.eclipse.winery.model.tosca.TArtifactType;
import org.eclipse.winery.model.tosca.TNodeType;
import org.eclipse.winery.model.tosca.yaml.TServiceTemplate;
import org.eclipse.winery.repository.backend.RepositoryFactory;
import org.eclipse.winery.yaml.common.Namespaces;
import org.eclipse.winery.yaml.converter.yaml.support.AbstractTestY2X;

import org.junit.Assert;
import org.junit.Test;

public class MyTinyToDo extends AbstractTestY2X {
	public MyTinyToDo() {
		super("src/test/resources/yaml/MyTinyToDo/");
	}

	@Test
	public void testArtifactTypes() throws Exception {
		String name = "artifact_types";
		String namespace = "http://www.example.com/MyTinyToDo/ArtifactTypes";

		TServiceTemplate serviceTemplate = readServiceTemplate(name);
		Definitions definitions = convert(serviceTemplate, name, namespace);
		writeXml(definitions, name, namespace);

		TArtifactType artifactType = RepositoryFactory.getRepository().getElement(
			new ArtifactTypeId(
				new Namespace(Namespaces.DEFAULT_NS, false),
				new XmlId("DockerContainerArtifact", false)
			)
		);

		Assert.assertNotNull(artifactType);
	}

	@Test
	public void testNodeTypes() throws Exception {
		String name = "node_types";
		String namespace = "http://www.example.com/MyTinyToDo/NodeTypes";

		TServiceTemplate serviceTemplate = readServiceTemplate(name);
		Definitions definitions = convert(serviceTemplate, name, namespace);
		writeXml(definitions, name, namespace);

		TNodeType nodeType = RepositoryFactory.getRepository().getElement(
			new NodeTypeId(
				new Namespace(Namespaces.DEFAULT_NS, false),
				new XmlId("DockerEngine", false)
			)
		);

		Assert.assertNotNull(nodeType);
	}

	@Test
	public void testServiceTemplate() throws Exception {
		String name = "service_template";
		String namespace = "http://www.example.com/MyTinyToDo/ServiceTemplate";

		TServiceTemplate serviceTemplate = readServiceTemplate(name);
		Definitions definitions = convert(serviceTemplate, name, namespace);
		writeXml(definitions, name, namespace);

		org.eclipse.winery.model.tosca.TServiceTemplate serviceTemplateXml = RepositoryFactory.getRepository().getElement(
			new ServiceTemplateId(
				new Namespace(Namespaces.DEFAULT_NS, false),
				new XmlId("MyTinyToDo_Bare_Docker", false)
			)
		);

		Assert.assertNotNull(serviceTemplateXml);
	}
}
