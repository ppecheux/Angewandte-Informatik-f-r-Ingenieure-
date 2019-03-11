import java.util.Scanner;
public class Fakultät {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("entrer le nombre pour appliquer le factoriel");
		//int num = sc.nextInt();
		//System.out.println("fakultat von "+ num + " ist "+fakultat(num));	
		int i = 1;
		while (fakultat(i)<1000000000){
			i++;
		}
		System.out.println(i);
	}
	
	public static int fakultat(int n){
		if (n == 1) return 1;
			
		else
			return (n*fakultat(n-1)); 	
	}
}
