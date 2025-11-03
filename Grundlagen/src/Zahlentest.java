import java.util.Scanner;

public class Zahlentest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testGerade;
		int testGroesse;
		testGerade=scan.nextInt();
		if(testGerade%2 == 0)
		{
			System.out.println("Eingabe :" + testGerade + "ist gerade\n");	
		}
		if(testGerade%2 == 1)
		{
			System.out.println("Eingabe :" + testGerade + "ist ungerade\n");	
		}
		testGroesse=scan.nextInt();
		if(testGroesse < 0)
		{
			System.out.println("Eingabe :" + testGroesse + "ist kleiner als 0\n");	
		}
		if(testGroesse > 0)
		{
			System.out.println("Eingabe :" + testGroesse + "ist größer als 0\n");	
		}

		
		scan.close();
		
	}

}
