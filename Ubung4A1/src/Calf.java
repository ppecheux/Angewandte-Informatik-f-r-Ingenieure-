
public class Calf extends Cow {
	
	private Cow mutter;
	
	Calf(String id,Cow mutter){
		super(id);
		this.setMutter(mutter);
	}

	public Cow getMutter() {
		return mutter;
	}

	public void setMutter(Cow mutter) {
		this.mutter = mutter;
	}
	
	@Override// dit au compiler que la methode getName est utilisé à la pplace d'une auttre
	// au cas ou on fait une erreur de saisie.
	public String getName(){
		return (super.getName() + mutter.getName());
	}

}
