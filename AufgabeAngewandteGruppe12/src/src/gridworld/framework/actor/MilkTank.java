package gridworld.framework.actor;

public class MilkTank extends Actor {
	
	public int MilkMenge;
	
	public MilkTank(){
		MilkMenge=0;
	}
	
	public String toString(){
		return "MilkTank erfühlt mit : " + this.MilkMenge + " Litern.";
	}

}
