/**
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 */
import { NgModule } from '@angular/core';

import { DocumentationComponent } from './documentation.component';
import { CommonModule } from '@angular/common';
import { WineryLoaderModule } from '../../../wineryLoader/wineryLoader.module';
import { FormsModule } from '@angular/forms';

@NgModule({
 imports: [
     CommonModule,
     FormsModule,
     WineryLoaderModule,
 ],
 exports: [DocumentationComponent],
 declarations: [DocumentationComponent],
 providers: [],
})
export class DocumentationModule { }
