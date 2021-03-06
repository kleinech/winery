/**
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 */
import { NgModule } from '@angular/core';

import { CommonModule } from '@angular/common';
import { WineryLoaderModule } from '../../../wineryLoader/wineryLoader.module';
import { FormsModule } from '@angular/forms';
import { WineryModalModule } from '../../../wineryModalModule/winery.modal.module';
import { WineryUploaderModule } from '../../../wineryUploader/wineryUploader.module';
import { SourceComponent } from './source.component';
import { WineryEditorModule } from '../../../wineryEditorModule/wineryEditor.module';
import { WineryDuplicateValidatorModule } from '../../../wineryValidators/wineryDuplicateValidator.module';

@NgModule({
    imports: [
        CommonModule,
        FormsModule,
        WineryLoaderModule,
        WineryModalModule,
        WineryUploaderModule,
        WineryEditorModule,
        WineryDuplicateValidatorModule,
    ],
    exports: [
        SourceComponent
    ],
    declarations: [
        SourceComponent
    ],
    providers: [],
})
export class WinerySourceModule { }
