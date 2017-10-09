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
package org.eclipse.winery.yaml.converter.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.eclipse.winery.repository.backend.IRepository;
import org.eclipse.winery.repository.backend.RepositoryFactory;
import org.eclipse.winery.repository.importing.CsarImporter;
import org.eclipse.winery.yaml.common.Utils;
import org.eclipse.winery.yaml.converter.Converter;
import org.eclipse.winery.yaml.converter.xml.support.AbstractTestX2Y;

import org.junit.Test;

public class Showcase extends AbstractTestX2Y {
	public Showcase() {
		super("src/test/resources/xml/Showcase/");
	}

	@Test
	public void zipTypeTest() throws Exception {
		String name = "MyTinyToDo_Bare_Docker";
		String path = PATH + File.separator + name + ".csar";
		InputStream fis = new FileInputStream(path);
		IRepository repository = RepositoryFactory.getRepository(Utils.getTmpDir("repository").toPath());
		CsarImporter csarImporter = new CsarImporter();
		csarImporter.readCSAR(fis, true, true);
		Converter converter = new Converter(repository);
		fis = new FileInputStream(path);
		InputStream zip = converter.convertX2Y(fis);
		Utils.getTmpDir("repository").delete();
		File zipFile = new File(OUT_PATH + File.separator + name + ".csar");
		if (!zipFile.getParentFile().exists()) {
			zipFile.getParentFile().mkdirs();
		}
		Files.copy(zip, zipFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
}
