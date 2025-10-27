package Person;
import java.util.Scanner;

public class Main
{
	
	// -------------------------------------------------------------
	// Aufgabe 1 U T4 
	// -------------------------------------------------------------

	public static void main(String[] args)
	{
		int wahl = 0;
		Person personal = new Person(null, wahl, wahl, wahl, wahl);
		Scanner scanner = new Scanner(System.in);

	
		while(true)
		{
			System.out.println("**Personalname Eingabe:");
			personal.name=scanner.nextLine();
			System.out.println("Personalnummer:");
			personal.personalNummer=scanner.nextInt();
			System.out.println("Lohngruppe:");
			personal.lohnGruppe=scanner.nextInt();
			System.out.println("Jahresbrutto");
			personal.jahresBrutto=scanner.nextFloat();
			System.out.println("Steuerklasse:");
			personal.Steuerklasse=scanner.nextInt();
			
			Person personal1 = new Person(personal.name,personal.personalNummer,personal.lohnGruppe,personal.jahresBrutto,personal.Steuerklasse);
			//ausgabe
			System.out.println("\nPersonal: ");
			System.out.println("\n Name:"+personal1.name);
			System.out.println("\n Personalnummer:"+personal1.personalNummer);
			System.out.println("\n Lohngruppe:"+personal1.lohnGruppe);
			System.out.println("\n Jahresbrutto:"+personal1.jahresBrutto);
			System.out.println("\n Steuerklasse:"+personal1.Steuerklasse);	
			scanner.nextLine(); // ← hier Puffer leeren!
			//
		
			continue;

		}

	}
}
