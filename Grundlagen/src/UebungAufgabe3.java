import java.util.Scanner;



public class UebungAufgabe3 {
	
	//Auswahl 1
	static void forschleife(int eingabe,int schleifenzähler)
	{
		for(int i=eingabe; i>=0; i--)
		{ 
			
			if(schleifenzähler == 3)
			{
				System.out.println("\n "+ i);
				schleifenzähler=0;
			}
			schleifenzähler++;
		}
	}
	
	//Auswahl 2
	static void whileschleife(int eingabe, int schleifenzähler)
	{	
		int i=eingabe;
		while(eingabe>=0)
		{
			if(schleifenzähler==3)
			{
				System.out.println("\n "+ eingabe);
				schleifenzähler=0;
			}
			schleifenzähler++;
			eingabe--;
		}
	}
	
	
	//auswahl 3
	static void dowhileschleife(int eingabe, int schleifenzähler)
	{	
		int i=eingabe;
		do 
		{
			if(schleifenzähler==3)
			{
				System.out.println("\n "+ eingabe);
				schleifenzähler=0;
			}
			schleifenzähler++;
			eingabe--;
		}while(eingabe>=0);
	}
	
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int i=0;
		int schleifenzähler=3;
		System.out.println("For oder While Schleife? \n 1. For     2. While     3.Do-While\n");
		int auswahl= scanner.nextInt();
		if(auswahl ==1)
		{
			System.out.println("Geben sie eine Vorzeichenlose Ganzzahl ein. (Negative werden automatisch positiv umgewandelt)");
			int eingabe = scanner.nextInt();
			forschleife(eingabe,schleifenzähler);
		}
		if(auswahl ==2)
		{
			System.out.println("Geben sie eine Vorzeichenlose Ganzzahl ein. (Negative werden automatisch positiv umgewandelt)");
			int eingabe = scanner.nextInt();
			whileschleife(eingabe,schleifenzähler);
		}
		if(auswahl ==3)
		{
			System.out.println("Geben sie eine Vorzeichenlose Ganzzahl ein. (Negative werden automatisch positiv umgewandelt)");
			int eingabe = scanner.nextInt();
			dowhileschleife(eingabe,schleifenzähler);
		}
			
		
	}

}
