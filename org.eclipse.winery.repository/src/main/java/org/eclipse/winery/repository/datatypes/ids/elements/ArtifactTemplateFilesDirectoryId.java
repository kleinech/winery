/*******************************************************************************
 * Copyright (c) 2017 University of Stuttgart
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *    Philipp Meyer - initial API and implementation
 *******************************************************************************/
package org.eclipse.winery.repository.datatypes.ids.elements;

import org.eclipse.winery.common.ids.IdNames;
import org.eclipse.winery.common.ids.definitions.ArtifactTemplateId;

public class ArtifactTemplateFilesDirectoryId extends DirectoryId {

	public ArtifactTemplateFilesDirectoryId(ArtifactTemplateId id) {
		super(id, IdNames.FILES_DIRECTORY);
	}
}
