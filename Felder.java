import java.util.Scanner;
import java.util.Random;

public class Felder {
	
	static Random random = new Random();
	
	
	
	public static boolean testFeld(int[] feld)
	{

		for (int i = 0; i < feld.length; i++) 
		{
			if (i == 4 && (feld[0] == feld[feld.length - 1]) && (feld[1] == feld[feld.length - 2]))
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	public static int haeufigkeit(int[] feld, int suchWert)
	{
		int zaehler =0;
		
		for (int i = 0; i < feld.length; i++)
		{
			if(feld[i]==suchWert)
			{
				zaehler++;
			}
		}

		return zaehler;
	}

	
	
	public static int summe(int[] feld, int feldSumme)
	{
		for (int i = 0; i < feld.length; i++) {
			feldSumme = feldSumme + feld[i];
		}
		return feldSumme;
	}

	
	
	public static int feldZwei(int[] feldZwei)
	{
		//Array feldZwei eingabe
				for(int k=0; k<feldZwei.length; k++)
				{
					feldZwei[k]=random.nextInt(20);
				}
				//
				feldZwei[0]=feldZwei[feldZwei.length-1];
				feldZwei[(feldZwei.length-1)/2]=feldZwei[feldZwei.length-1];
				for(int l=0; l<feldZwei.length; l++)
				{
					System.out.println("Wert für feldZwei:"+ feldZwei[l]);
				}
				return 0;		
	}
	
	
	// -------------------------------------------------------------
	// Aufgabe 5 U T3
	// -------------------------------------------------------------
	public static void main(String[] args)
	{
		//Deklaration
		int[] feld = {};
		feld = new int[5];
		int[] feldZwei= {};
		feldZwei = new int[9];
		Scanner scan = new Scanner(System.in);
		boolean feldGroesseMinVier = false;
		int feldSumme = 0;
		int suchwert = 0;
		int stapel = 0;
		System.out.println("Eingabewert um Feld zu Scannen:");
		int eingabe;
		//
		//Array feld eingabe
		for (int j = 0; j < feld.length; j++)
		{
			eingabe = scan.nextInt();
			feld[j] = eingabe;
		}
		//
		
		feldZwei(feldZwei);
		System.out.println("\nGeben sie ihren Suchwert ein: ");
		suchwert = scan.nextInt();
		stapel = haeufigkeit(feld, suchwert);
		System.out.println("Doppelte Werte: "+stapel);
		feldGroesseMinVier = testFeld(feld);
		feldSumme = summe(feld, feldSumme);
		System.out.println("Summe: " + feldSumme);
		if (feldGroesseMinVier == true) 
		{
			System.out.println("\nFeld hat mindestens eine Länge von 4.\n");
			System.out.println("\nDas erste und das letzte Feldelement sind gleich: \n" + feld[0] + " " + feld[feld.length - 1]);
			System.out.println("\nDas zweite und das vorletzte Feldelement sind gleich: \n" + feld[0 + 1] + " "+ feld[feld.length - 2]);
		}

		if (feldGroesseMinVier == false)
		{
			for (int i = 0; i < feld.length; i++)
			{
				System.out.println("*****Wert:" + feld[i] + "*****");
			}
		}
	}
}
