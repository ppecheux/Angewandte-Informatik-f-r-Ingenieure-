import Prog1Tools.IOTools;
public class TaschenrechnerMitSwitchCase {
	public static void main(String[] args) {
	int ergebnis = 0;
	System.out.println("Willkommen im Taschenrechner!");
	int Zahl = IOTools.readInteger("Bitte eine Zahl eingeben:");
	int zZahl = IOTools.readInteger("Bitte eine zweite Zahl eingeben:");
	char Operator = IOTools.readChar("Bitte den Operator (+,-,*,/, %) eingeben:");

  switch (Operator){
    case '+':
      ergebnis= Zahl + zZahl;
      break;
    case '-':
    ergebnis= Zahl - zZahl;
    break;
    case '*':
    ergebnis= Zahl * zZahl;
    break;
    case '%':
    ergebnis= Zahl % zZahl;
    break;
    case '/':
    ergebnis= Zahl / zZahl;
    break;
  }
  System.out.print(Zahl);
  System.out.print (Operator);
  System.out.println( zZahl +"="+ ergebnis);
}
}