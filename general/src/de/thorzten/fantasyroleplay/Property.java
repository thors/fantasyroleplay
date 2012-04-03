package de.thorzten.fantasyroleplay;

public class Property {
    public class ModifyResult {
	public float iCost;
	public boolean  iSuccess;
    }
    private static String iName;
    protected Character iOwner;
    protected int iMax;
    protected int iMin;
    protected int iValue;

    protected int modifierCost( int newValue ) {
	return 0;
    }


    public int setFactor(int newValue) {
	return 0;
    }
    public Property(Character aOwner) {
	iName = "";
	
	iOwner = aOwner;
    }
}