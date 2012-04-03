package de.thorzten.fantasyroleplay;


class PropertyStrength extends Property {
    private static String iName;
    protected int modifierCost( int newValue ) {
	return 0;
    }

    final public int setFactor(int newValue) {
	return 0;
    }
    public PropertyStrength(Character aOwner) {
	super(aOwner);
	iName = "strength";
    }
}