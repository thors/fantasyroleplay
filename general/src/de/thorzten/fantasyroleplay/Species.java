package de.thorzten.fantasyroleplay;

abstract class Species {
    private String iName;

    public float calculatePropertyModificationCost(Property aProperty, float aNewValue) {
	float modifierCosts = 0;
	return aProperty.modifierCost(aNewValue);
    }
}