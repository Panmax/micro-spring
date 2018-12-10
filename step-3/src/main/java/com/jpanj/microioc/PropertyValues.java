package com.jpanj.microioc;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv) {
        // FIXME check property name repeat
        propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
