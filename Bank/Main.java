package Bank;
import java.util.Scanner;
//TODO Überweisung von das eine auf das andere Konto durchführen!

public class Main
{

	public static double sicheresAuszahlen(Bank konto, int eingabe, boolean karteAngenommen) 
	{
		if (konto.kontoStand <= -1000) {
			System.out.println("Eingabe ungülitg, Dispolimit wird sonst überzogen.");
			konto.getKarteAngenommen();
			konto.karteAngenommen = false;
			konto.setKarteAngenommen(konto.karteAngenommen);
			System.out.println("Karte wird ausgegeben.\n");
			System.out.println("Programm wird beendet.");
			konto.setKarteAngenommen(konto.karteAngenommen);
			return konto.kontoStand;
		} else {
			System.out.println("\n Kontostand: " + konto.kontoStand);
			konto.getKarteAngenommen();
			konto.karteAngenommen = false;
			konto.setKarteAngenommen(konto.karteAngenommen);
			System.out.println("Karte wird ausgegeben.\n");
			System.out.println("Programm wird beendet.");
			konto.setKarteAngenommen(konto.karteAngenommen);
			return konto.kontoStand;
		}
	}

	public static void main(String[] args)
	{
		Bank konto = new Bank(0, 0, 0, false);
		Scanner scanner = new Scanner(System.in);
		int eingabe = 0;
		String auswahl = null;
		System.out.println("*****Spaßkasse Haltern am See*****\\n");
		System.out.println("Wollen sie ein Konto erstellen oder auf ihr bestehendes zugreifen?\n");
		System.out.println("1. erstellen  |   2. zugreifen\n");
		eingabe = scanner.nextInt();
		if(eingabe ==1)
		{
			System.out.println("***Konto wird erstelt***");
			System.out.println("\n erstellen sie eine Kontonummer");
			eingabe=scanner.nextInt();
			KontoTest kontoTest = new KontoTest(eingabe,0,1000,false);
			System.out.println("\n***Konto erstellt***\n");
			System.out.println("Kontonummer: "+kontoTest.kontoNummer);
			System.out.println("\nKontostand: "+ kontoTest.kontoStand);
		}
		if (eingabe == 2) 
		{
			System.out.println("*****Spaßkasse Haltern am See*****\n");
			System.out.println("Geben sie ihre Kontnonummer ein: ");
			eingabe = scanner.nextInt();
			konto.setKontoNummer(eingabe);
			System.out.println("Eingabe:" + eingabe);
			konto.setKontoNummer(eingabe);
		}
			scanner.nextLine(); // Puffer leeren
			konto.karteAngenommen = true;
			konto.setKarteAngenommen(konto.karteAngenommen);
			konto.getKarteAngenommen();
			while (konto.karteAngenommen == true)
			{
				System.out.println("Möchten sie Geld abheben oder einzahlen?\n");
				System.out.println("Geben sie auszahlen oder einzahlen ein:");
				auswahl = scanner.nextLine();

				if (auswahl.equals("einzahlen") || auswahl.equals("Einzahlen")) 
				{
					System.out.println("\nWie viel möchten sie einzahlen?: ");
					eingabe = scanner.nextInt();
					konto.getKontostand();
					konto.setKontostand(konto.kontoStand + eingabe);
					System.out.println("Kontostand: " + konto.kontoStand);
					scanner.nextLine(); // Puffer leeren
					continue;
				}

				if (auswahl.equals("auszahlen") || auswahl.equals("Auszahlen"))
				{
					System.out.println("Wie viel Geld möchten sie abheben?: ");
					eingabe = scanner.nextInt();
					konto.getKontostand();
					konto.setKontostand(konto.kontoStand - eingabe);
					sicheresAuszahlen(konto, eingabe, konto.karteAngenommen);
					scanner.nextLine(); // Puffer leeren
					continue;
				}
			}
		

	}
}
