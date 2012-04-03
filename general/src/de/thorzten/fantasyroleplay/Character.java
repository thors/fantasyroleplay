package de.thorzten.fantasyroleplay;

import java.util.List;

class Character {
    String iName;
    protected List<Property> iProperties;
    protected List<Possessions> iPossessions;
    protected List<Species> iSpecies; /* List of species in the ancestry of this Character (e.g. Human + Dwarf) */
    protected List<ArcheType> iArcheTypes; /* List of archetypes this Character represents (e.g. Thief + Warrior) */

    protected void addSpecies( Species aSpecies ) {
    }
    /**
     * Default function to calculate the cost of a modification to a property.
     */
    public float calculatePropertyModificationCost(Property aProperty, float aNewValue) {
	float modifierCosts = 0;
	for (List<Species> s : iSpecies ) {
	    
	}
	float modifierCosts = 0;
	return aProperty.modifierCost(aNewValue);
    }
    public Character(String aName) {
    }
    
}