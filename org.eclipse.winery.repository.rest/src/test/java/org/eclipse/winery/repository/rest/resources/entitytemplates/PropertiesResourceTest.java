/**
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 */

package org.eclipse.winery.repository.rest.resources.entitytemplates;

import org.eclipse.winery.repository.rest.resources.AbstractResourceTest;

import org.junit.Test;

public class PropertiesResourceTest extends AbstractResourceTest {

	@Test
	public void getOfNonExistingProperties() throws Exception {
		this.setRevisionTo("1374c8c13ec64899360511dbe0414223b88d3b01");
		this.assertGet("artifacttemplates/http%253A%252F%252Fopentosca.org%252Fartifacttemplates/MyTinyTest/properties/", "entitytemplates/emptyProperties.json");
	}

	@Test
	public void getPropertiesJsonList() throws Exception {
		this.setRevisionTo("2fb90960edfb32e337a440c115976ff4bd7a5634");
		this.assertGet("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates%252Ffruits/baobab-ArtifactTemplate-Peel/properties/",
			"entitytemplates/initialProperties.json");
	}

	@Test
	public void getPropertiesXml() throws Exception {
		this.setRevisionTo("284616083dc75f1c67e0c27e7ab2e8ecada236cf");
		this.assertGet("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates/ShipOrderTemplate/properties/",
			"entitytemplates/ShipOrderTemplate_Properties.xml");
	}

	@Test
	public void postJsonProperties() throws Exception {
		this.setRevisionTo("2fb90960edfb32e337a440c115976ff4bd7a5634");
		this.assertPut("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates%252Ffruits/baobab-ArtifactTemplate-Peel/properties/",
			"entitytemplates/updatedProperties.json");
		this.assertGet("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates%252Ffruits/baobab-ArtifactTemplate-Peel/properties/",
			"entitytemplates/updatedProperties.json");
	}

	@Test
	public void postXMLProperties() throws Exception {
		this.setRevisionTo("2fb90960edfb32e337a440c115976ff4bd7a5634");
		this.assertPut("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates%252Ffruits/baobab-ArtifactTemplate-Peel/properties/",
			"entitytemplates/updateProperty.xml");
		this.assertGet("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates%252Ffruits/baobab-ArtifactTemplate-Peel/properties/",
			"entitytemplates/updatedProperties.json");
	}
	
	@Test
	public void postXMLPropertiesToArtifact() throws Exception {
		this.setRevisionTo("2025ac44d12f5814cc441ba2f8425cdc78c47bb4");
		this.assertPut("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates/ShipOrderTemplate/properties/", "entitytemplates/artifacttemplates/updatedProperties.xml");
		this.assertGet("artifacttemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fartifacttemplates/ShipOrderTemplate/properties/", "entitytemplates/artifacttemplates/updatedPropertiesAfterPut.xml");
	}
}
