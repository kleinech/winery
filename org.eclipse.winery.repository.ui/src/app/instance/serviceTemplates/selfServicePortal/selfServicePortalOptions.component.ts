/*******************************************************************************
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
import { Component } from '@angular/core';
import { ApplicationOption } from './selfServicePortal.service';

@Component({
    selector: 'winery-self-service-portal-options',
    templateUrl: 'selfServicePortalOptions.component.html'
})
export class SelfServicePortalOptionsComponent {

    options: ApplicationOption[] = [];
    columns = [
        { title: 'Name', name: 'name' },
        { title: 'Icon', name: 'icon' },
        { title: 'Plan Service Name', name: 'planServiceName' }
    ];

    onRemoveClick(event: any) {
    }

    onAddClick() {
    }
}
