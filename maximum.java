import java.util.Scanner;
import java.util.Random;

//aufgabe 5 U T3
public class maximum
{

	static Random random = new Random();
	static Scanner scanner= new Scanner(System.in);
	
	
	
	
	public static int sortiertAufsteigend(int[] array)
	{	
		//aufgabe 4 P T3
		int maximum=0;
		int temp;
		for(int i=0; i<array.length-1;i++)
		{
			for(int j=0; j<array.length-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return maximum=array[array.length-1];
	}
	
	
	
	
	public static int shuffle(int[] array, int[] arrayZwei)
	{
		int[] arrayMischung = {};
		arrayMischung = new int[array.length +arrayZwei.length];
		//beide arrays Mischen
		sortiertAufsteigend(array);
		sortiertAufsteigend(arrayZwei);
		System.out.println("******");
		for(int j=0; j<(array.length+arrayZwei.length); j++)
		{
			arrayMischung[j]=copyArray(array,arrayZwei,j);
		}
		System.out.println("\n*******");
		sortiertAufsteigend(arrayMischung);
		minMaxAusgabe(arrayMischung);
		//funktionen noch umnennenS
		return 0;
	}
	
	
	
	public static int copyArray(int[] array, int[] arrayZwei, int counter)
	{	
		
		if(counter<array.length)
		{
			return array[counter];
		}
		if(counter>=array.length)
		{
			return arrayZwei[counter-array.length];
		}
		return 0;
		
	}
	
	
	
	public static void minMaxAusgabe(int[] array)
	{
		for(int j=0; j<=array.length-1; j++)
		{
			System.out.println(" Wert "+ j + ": " + array[j]+"\n");
			if(j==array.length-1)
			{	
				System.out.println("\n Maximum: "+ array[array.length-1]+"\n");
				System.out.println("\n Minimum: "+ array[0]+"\n");	
			}
		}
	}	
	
	
	
	public static int[] createArray(int leange, int[] array)
	{ 
		
		for(int i=0; i<leange;i++)
		{	
			 array[i]=random.nextInt(leange);	 
		}
		return array;
		
	}
	
	
	
	//aufgabe 1 P T3
	public static void main(String[] args)
	{	
		int[] array;
		int[] arrayZwei= {};
		int maxWert=0;		
		int reichWeite=0;
		int reichWeiteArrayZwei=0;
		//Arrays erstellen
		System.out.println("***Array 2 Zufallszahlen mit Zufallsgröße, geben sie Spannweite der Zahlen ein?***\n");
		reichWeite=scanner.nextInt();
		array =new int[reichWeite];
		array=createArray(reichWeite,array);
		System.out.println("\n***Array 2 Zufallszahlen mit Zufallsgröße, geben sie Spannweite der Zahlen ein***\n");
		reichWeite=scanner.nextInt();
		arrayZwei = new int[reichWeite];
		arrayZwei= createArray(reichWeite,arrayZwei);
		//
		//arrays sortieren und ausgeben
		maxWert=sortiertAufsteigend(array);
		System.out.println("\n*****Array 1 Sortiert*****\n");
		minMaxAusgabe(array);	
		System.out.println("*****");
		System.out.println("\n*****Array 2 Sortiert*****\n");
		minMaxAusgabe(arrayZwei);	
		System.out.println("*****");
		//
		//aufge4 4 P T3
		shuffle(array,arrayZwei);
		}
}
