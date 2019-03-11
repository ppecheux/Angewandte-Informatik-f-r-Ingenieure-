
public class Farm {
	


	public static void main(String[] args) {
		
		Cow cow1=new Cow("cow1");
		Cow cow2=new Cow("cow2");
		Cow cow3=new Cow("cow2");
		
		cow2.setName("super"); 
		
		System.out.println(cow2.getName()+" wir zahlen "+ Cow.getCowCounter());
		System.out.println(cow1.getHungry());
		Farmer farmer1= new Farmer();
		farmer1.feedCow(cow1);
		System.out.println(cow1.getHungry());
		cow3.giveBirth("Calf1");

	}

}
