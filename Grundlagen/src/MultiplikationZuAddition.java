<<<<<<<< HEAD:Baiscs/MultiplikationZuAddition.java
package Baiscs;

========
>>>>>>>> 231b9a0a7f1570d19c9fc021eeb5cce225f4dae1:Grundlagen/src/MultiplikationZuAddition.java
import java.util.Scanner;


public class MultiplikationZuAddition {

	
	
	static int mulitplikation(int faktor, int basis, int temp)
	{

		for(int i=1; i<=faktor ; i++)
		{
			temp=temp+basis;
		}
		
		return temp;
	}
	
	
	//quadratwurzel ermittlung nur mit addition
	static int summenermittlung(int faktor,int temp, int schleifenzähler)
	{
		temp=0;
		for(int i=1; i<=schleifenzähler; i++)
		{
			temp=temp+schleifenzähler;
		}
		return temp; 
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int basis=0;
		int faktor=0;
		int produkt=0;
		int temp=0;
		int schleifenzähler=1;
		System.out.println("Geben sie ihre Werte ein die sie multiplizieren möchten. (Basis) (Faktor) \n");
		basis= scan.nextInt(); 
		faktor = scan.nextInt(); 
		//addition
		temp=mulitplikation(faktor,basis,temp);
		System.out.println("Ergebnis: " + temp);
		
		
		//ermittlung der quadratwurzel von 1 -> n
		for(int l=1; l<=faktor; l++)
		{
			
			for(int k=1; k<=faktor;k++) 
			{
				temp=summenermittlung(faktor,temp,schleifenzähler);
				if(k==faktor)
				{
					System.out.println("\n Ergebnis: " + temp);
					schleifenzähler++;
				}

			}
			
		}
	
		// TODO Auto-generated method stub

	}

}
