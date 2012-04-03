package de.thorzten.fantasyroleplay;
import java.util.List;

class PropertyList extends List<Property> {
    public PropertyList() {
	add(PropertyStrength());
    }
}