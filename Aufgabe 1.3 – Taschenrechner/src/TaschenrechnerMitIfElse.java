import Prog1Tools.IOTools;
public class TaschenrechnerMitIfElse {
	public static void main(String[] args) {
		int ergebnis = 0;
		int local = 0;
		System.out.println("Willkommen im Taschenrechner!");
		int Zahl = IOTools.readInteger("Bitte eine Zahl eingeben:");
		int zZahl = IOTools.readInteger("Bitte eine zweite Zahl eingeben:");
		char operator = IOTools.readChar("Bitte den Operator (+,-,*,/, %) eingeben:");

		if (operator == '+'||operator == '-'){
			if (operator == '+'){
				ergebnis = Zahl + zZahl;
			}
			else ergebnis = Zahl - zZahl;
		}
		else if (operator == '*'||operator == '%'||operator == '/'){
			if(operator == '*') ergebnis= Zahl * zZahl;
			else if (operator == '/') ergebnis= Zahl / zZahl;
			else ergebnis=Zahl % zZahl;
		}
		else System.out.println("une erreur est survenue");

	System.out.print(Zahl);
	System.out.print (operator);
	System.out.println( zZahl +"="+ ergebnis);
}}
