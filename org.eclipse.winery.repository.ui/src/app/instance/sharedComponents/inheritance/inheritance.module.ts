/**
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Lukas Harzenetter - initial API and implementation
 */
import { NgModule } from '@angular/core';

import { InheritanceComponent } from './inheritance.component';
import { CommonModule } from '@angular/common';
import { WineryModalModule } from '../../../wineryModalModule/winery.modal.module';
import { WineryLoaderModule } from '../../../wineryLoader/wineryLoader.module';
import { FormsModule } from '@angular/forms';
import { WineryQNameSelectorModule } from '../../../wineryQNameSelector/wineryQNameSelector.module';
import { SelectModule } from 'ng2-select';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { WineryAddModule } from '../../../wineryAddComponentModule/addComponent.moudle';

@NgModule({
    imports: [
        CommonModule,
        BrowserModule,
        SelectModule,
        FormsModule,
        CommonModule,
        RouterModule,
        WineryModalModule,
        WineryLoaderModule,
        WineryQNameSelectorModule,
        WineryAddModule,
    ],
    exports: [InheritanceComponent],
    declarations: [InheritanceComponent],
    providers: [],
})
export class InheritanceModule {
}
