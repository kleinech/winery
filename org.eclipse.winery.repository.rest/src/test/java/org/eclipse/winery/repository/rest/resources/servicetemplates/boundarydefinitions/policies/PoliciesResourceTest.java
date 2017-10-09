/**
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 * Lukas Harzenetter - initial API and implementation
 */

package org.eclipse.winery.repository.rest.resources.servicetemplates.boundarydefinitions.policies;

import org.eclipse.winery.repository.rest.resources.AbstractResourceTest;

import org.junit.Test;

public class PoliciesResourceTest extends AbstractResourceTest {

	@Test
	public void addPolicyTest() throws Exception {
		this.setRevisionTo("34adf7aba86ff05ce34741bb5c5cb50e468ba7ff");
		this.assertPost("servicetemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fservicetemplates%252Ffruits/baobab_serviceTemplate/boundarydefinitions/policies/", "entitytypes/servicetemplates/boundarydefinitions/policies/addPolicy.xml");
		this.assertGet("servicetemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fservicetemplates%252Ffruits/baobab_serviceTemplate/boundarydefinitions/policies/", "entitytypes/servicetemplates/boundarydefinitions/policies/initialPolicy.json");
	}

	@Test
	public void getPoliciesTest() throws Exception {
		this.setRevisionTo("3cad4e459a8af6082097eab8f978c80b4f5a512e");
		this.assertGet("servicetemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fservicetemplates%252Ffruits/baobab_serviceTemplate/boundarydefinitions/policies/", "entitytypes/servicetemplates/boundarydefinitions/policies/initialPolicy.json");
	}

	@Test
	public void deletePolicies() throws Exception {
		this.setRevisionTo("3cad4e459a8af6082097eab8f978c80b4f5a512e");
		this.assertDelete("servicetemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fservicetemplates%252Ffruits/baobab_serviceTemplate/boundarydefinitions/policies/1400281569/");
		this.assertGet("servicetemplates/http%253A%252F%252Fwinery.opentosca.org%252Ftest%252Fservicetemplates%252Ffruits/baobab_serviceTemplate/boundarydefinitions/policies/", "entitytypes/empty_array.json");
	}
}
