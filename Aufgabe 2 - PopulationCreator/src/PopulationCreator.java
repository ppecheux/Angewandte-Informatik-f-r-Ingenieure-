import generator.NameAndBirthYearGenerator;


public class PopulationCreator {
	String[]array;
	NameAndBirthYearGenerator myGenerator = new NameAndBirthYearGenerator(10);
	
	
	public static void main(String[]args){
		PopulationCreator myPopulation = new PopulationCreator();
		myPopulation.populate(10);
		for(String d: myPopulation.array){
			System.out.println(d);
		}
	}
	
	void populate(long n){
		array = new String[(int)n];
		for(int i=0;i<n;i++){
			array[i]=myGenerator.generateNameAndBirthYearString();
		}
	}

}
