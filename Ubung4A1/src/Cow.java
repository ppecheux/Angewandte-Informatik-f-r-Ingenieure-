
public class Cow {
	private String name;
	private static int cowCounter = 0;
	private boolean hungry = false;
	
	Cow(String str){
		this.setName(str);
		this.moo();
		setCowCounter(getCowCounter() + 1);
	}
	
	Calf giveBirth(String name){	
		return new Calf(name, this);
	}
	
	
	void toggle(){
		if (this.hungry==true)this.hungry=false;
		else this.hungry=true;
	}
	
	
	void moo(){
		System.out.println("MOOOOOH");
	}
	
	public boolean getHungry(){
		return this.hungry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCowCounter() {
		return cowCounter;
	}

	public static void setCowCounter(int cowCounter) {
		Cow.cowCounter = cowCounter;
	}

}
