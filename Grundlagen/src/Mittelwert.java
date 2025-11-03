import java.util.Scanner;

public class Mittelwert 
{

	static double mittelwertRechnung(int a, int b, int c)
	{
		return (a + b + c)/3.0;
	}
	
	public static void main(String[] args) 
	{
		
		int ergebnis;
		Scanner myScanner = new Scanner(System.in);
		while(true)
		{	
			byte auswahl;
			System.out.println("Mittelwertberechnung");
			System.out.println("\n ---Menü---\n");
			System.out.println("1. Mittelwertberechnen \n 2. Programm beenden");
			auswahl = myScanner.nextByte();
			if(auswahl ==1)
			{
				System.out.println("\nErste ganze Zahl eingeben:");
				int a = myScanner.nextInt();
				System.out.println("Zweite ganze Zahl eingeben:");
				int b = myScanner.nextInt();
				System.out.println("Dritte ganze Zahl eingeben:");
				int c = myScanner.nextInt();
				double m=mittelwertRechnung(a,b,c);
				System.out.println("\nDer Mittelwert ist: " + m);
			}
			if(auswahl ==2)
			{
				System.out.println("Programm wird beendet!");
				break;
			}
			else
			{
				System.out.println("ungültige Eingabe!");
				
			}
			
			continue;
		}
	}
}
