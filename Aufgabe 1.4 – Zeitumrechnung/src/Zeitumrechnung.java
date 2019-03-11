import Prog1Tools.IOTools;
public class Zeitumrechnung {
	public static void main(String[] args) {
		long sekunde = IOTools.readLong("Bitte Sekunde eingeben:");
		long modulo = sekunde%(60*60*24*365);
		long diff= sekunde - modulo;
		long Jahr = (long)diff/(60*60*24*365);
		long Tag = (long)((sekunde-(Jahr*(60*60*24*365)))-((sekunde-(Jahr*(60*60*24*365)))%(60*60*24)))/(60*60*24);
		long Stunde = (long)((sekunde-(Jahr*(60*60*24*365))-(Tag*(60*60*24)))-((sekunde-(Jahr*(60*60*24*365))-(Tag*(60*60*24)))%(60*60)))/(60*60);
		long Minute = (long)((sekunde-(Jahr*(60*60*24*365))-(Tag*(60*60*24))-(Stunde*(60*60)))-((sekunde-(Jahr*(60*60*24*365))-(Tag*(60*60*24))-(Stunde*(60*60)))%(60)))/(60);
		long rest = (long)((sekunde-(Jahr*(60*60*24*365))-(Tag*(60*60*24))-(Stunde*(60*60))-(Minute*(60))));
		System.out.print ((Jahr)+ " Jahr(e) , " + Tag +" Tag(e), "+ Stunde +" Stunde(n) " +Minute+ " Minute(n) " +rest+ " sekunde(n)");
	}
}
