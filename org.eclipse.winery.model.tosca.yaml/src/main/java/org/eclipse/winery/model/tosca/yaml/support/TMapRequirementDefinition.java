/********************************************************************************
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
package org.eclipse.winery.model.tosca.yaml.support;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.winery.model.tosca.yaml.TRequirementDefinition;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMapRequirementDefinition", namespace = " http://docs.oasis-open.org/tosca/ns/simple/yaml/1.0", propOrder = {
    "map"
})
public class TMapRequirementDefinition implements Map<String, TRequirementDefinition> {
    private Map<String, TRequirementDefinition> map;

    public TMapRequirementDefinition() {
        this.map = new LinkedHashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TMapRequirementDefinition)) return false;
        TMapRequirementDefinition that = (TMapRequirementDefinition) o;
        return Objects.equals(getMap(), that.getMap());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMap());
    }

    public Map<String, TRequirementDefinition> getMap() {
        return map;
    }

    public TMapRequirementDefinition setMap(Map<String, TRequirementDefinition> map) {
        this.map = new LinkedHashMap<>(map);
        return this;
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return this.map.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return this.map.containsValue(o);
    }

    @Override
    public TRequirementDefinition get(Object o) {
        return this.map.get(o);
    }

    @Override
    public TRequirementDefinition put(String s, TRequirementDefinition requirementDefinition) {
        return this.map.put(s, requirementDefinition);
    }

    @Override
    public TRequirementDefinition remove(Object o) {
        return this.map.remove(o);
    }

    @Override
    public void putAll(Map<? extends String, ? extends TRequirementDefinition> map) {
        this.map.putAll(map);
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override
    public Collection<TRequirementDefinition> values() {
        return this.map.values();
    }

    @Override
    public Set<Entry<String, TRequirementDefinition>> entrySet() {
        return this.map.entrySet();
    }
}
