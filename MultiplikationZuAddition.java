import java.util.Scanner;


public class MultiplikationZuAddition {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int basis=0;
		int faktor=0;
		int produkt=0;
		int temp=0;
		System.out.println("Geben sie ihre Werte ein die sie multiplizieren möchten. (Basis) (Faktor) \n");
		basis= scan.nextInt(); 
		faktor = scan.nextInt(); 
		for(int i=1; i<=faktor ; i++)
		{
			temp=temp+basis;
		}
		
		System.out.println("Ergebnis: " + temp);
		
		// TODO Auto-generated method stub

	}

}
