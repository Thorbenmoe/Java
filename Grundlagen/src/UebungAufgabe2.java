<<<<<<<< HEAD:Baiscs/UebungAufgabe2.java
package Baiscs;//Ersetzen Sie in folgender Java-Prozedur die While-Schleifen durch geeignet formulierte For-Schleifen (vgl. auch LE 3, S. 39-41
========
//Ersetzen Sie in folgender Java-Prozedur die While-Schleifen durch geeignet formulierte For-Schleifen (vgl. auch LE 3, S. 39-41
>>>>>>>> 231b9a0a7f1570d19c9fc021eeb5cce225f4dae1:Grundlagen/src/UebungAufgabe2.java



public class UebungAufgabe2 
{
	public static void main(String[] args)
	{
		int i =1;
		for( i=1; i <=10; i++)
		{
			int j=1;
			for( j=1; j<=10; j++)
			{
				System.out.println("\t"+(i*j));
				
			}
			
			System.out.println();
		}
		
	}
	
}
