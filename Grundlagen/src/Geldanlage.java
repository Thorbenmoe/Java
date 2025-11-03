import java.util.Scanner;
import java.text.DecimalFormat;


public class Geldanlage {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kapital= 10000.00;
		float verzinsung=0.0f;
		int laufzeit=0;
		int i=0;
		int bonus;
		
		 Scanner scan = new Scanner(System.in);
		 DecimalFormat df= new DecimalFormat("0.00");
		while(true)
		 { 
			 System.out.println("Geldanlage, wählen sie ihre Laufzeit.");
			 System.out.println("\n---Menü------\n");
			 System.out.println("1 Jahr: 1,5% Verzinsung ohne Bonuszahlung. \n 2 Jahre 0,7% Verzinsung 15€ Bonuszahlung. \n 3 Jahre: 0,4% Verzinsung 20€ Bonuszahlung. \n 4 Jahre 0,1% Verzinsung mit 50€ Bonuszahlung. \n  5 Programm schließen.");
			 laufzeit = scan.nextInt();
		 
		 
			 if(laufzeit== 5 || laufzeit > 5 || laufzeit < 1)
			 {
				 System.out.println("ungültige eingabe.");
				 continue;
			 }
			 switch (laufzeit)
			 {
			 case 1:
				 kapital=berechneKapital(kapital,1.5f,0,1);
				 System.out.println("Kontostand: " + df.format(kapital));
				 break;
				 
			 case 2:
				 kapital=berechneKapital(kapital,0.7f,15,2);
				 System.out.println("Kontostand: " + df.format(kapital));
				 break;
				 
			 case 3:
				
				 kapital=berechneKapital(kapital,0.4f,20,3);
				 System.out.println("Kontostand: " + df.format(kapital));
				 break;
				 
			 case 4:
				
				 kapital=berechneKapital(kapital,0.1f,50,4);
				 System.out.println("Kontostand: " + df.format(kapital));
				 break;
				 
			 case 5:
				 System.out.println("Programm beendet.");
				 break;
			 }
			 
			 break;
		 }
		 
		
	}
	
	public static double berechneKapital(double kapital,float verzinsung,int bonus,int laufzeit)
	{	
		
		for(int j =0; j< laufzeit; j++)
		{
			kapital =kapital*(1+verzinsung/100f)+bonus;
		}
		
		return kapital;
		
	}
	

}
