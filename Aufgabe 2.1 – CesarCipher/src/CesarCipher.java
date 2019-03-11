import Prog1Tools.IOTools;
public class CesarCipher {
	public static void main(String[] args) {
		System.out.println("Enter the number of characters which shall be read: ");//Hier soll zunächst von der Konsole eingelesen werden, welche Länge die zu verschlüsselnde Zeichenkette haben soll.
		int length = IOTools.readInteger();//enter the length of the string
		char[] linie = readChar(length);//mit Hilfe der Methode readChars ein entsprechendes char-Array eingelesen werden.
		int command = getCommand();
		//System.out.println(command);
		//do{
		//command = getCommand();
		//}while (command!=1 );
		while(command==0 && command !=1){
			if(command == 0){
				System.out.println("Enter the shift offset: ");
				int jump = IOTools.readInt();
				System.out.print("Message before shifting: ");
				printMessage(linie);
				System.out.print("Message after shifting: ");
				shift(linie, jump);
				printMessage(linie);
			}
			command = getCommand();
		}
		System.out.print("Bye Bye");
	}
	public static void printMessage(char[] tab ){
		if(tab==null)return;
		System.out.println(" ");
		for(char c : tab){
			System.out.print(c);
			}
		System.out.println(" ");
		}
	
	public static char[] readChar (int lastchar){
		char[]read = new char[lastchar];
		for(int i =0; i< lastchar; i++){
			System.out.println("enter the "+i+"st char");
			read[i]=IOTools.readChar();
		}
		return read;	
	}
	
	public static void shift (char[] tab, int n){
		if (tab == null)return;
		int i=0;
		for (char c : tab){
			//System.out.print((char)((int)c+n));
			//n = (n>0) ? n%26 : -(n%26);
			
			tab[i]=((char)((int)c+n));
			
			/*while ((int)tab[i]>(int)('z')){
				tab[i]=(char)((int)tab[i]-26);
			}
			while ((int)tab[i]<(int)('a')){
				tab[i]=(char)((int)tab[i]+26);
			}*/
			
			// This was to have only char as letters (sorry)
			
			i++;
		}
	}
	
	public static int getCommand(){//in einer Schleife die folgenden Schritte durchgeführt werden, solange der Nutzer als Kommanda „shift“ und nicht „exit“ eingibt 
		String command;
		do{
			System.out.println("do you want to exit ot shift?: ") ;
			command = IOTools.readString();
		}while ( command.compareTo("exit")!=0 && command.compareTo("shift") != 0);
		return (command.equals("exit"))? 1:0;
	}
}

