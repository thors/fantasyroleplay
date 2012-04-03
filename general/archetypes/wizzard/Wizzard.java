package general.archetypes.wizzard;
import general.archetypes.*;

class Wizzard extends Archetype  {
    public final double iCreativityMin=250.0, iCreativityMax = 1000.0;
    static public void main( String args[] ) {
	Wizzard w = new Wizzard();
	w.printValues();
    }
}
