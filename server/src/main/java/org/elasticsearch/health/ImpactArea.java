/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.health;

public enum ImpactArea {
    SEARCH("search"),
    INGEST("ingest");

    private final String displayValue;

    ImpactArea(String displayValue) {
        this.displayValue = displayValue;
    }

    public String displayValue() {
        return displayValue;
    }
}
