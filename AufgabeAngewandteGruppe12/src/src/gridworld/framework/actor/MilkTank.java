package gridworld.framework.actor;

public class MilkTank extends Actor {
	
	public int MilkMenge;
	
	public MilkTank(){
		MilkMenge=0;
	}
	
	public String toString(){
		return "MilkTank erf�hlt mit : " + this.MilkMenge + " Litern.";
	}

}
