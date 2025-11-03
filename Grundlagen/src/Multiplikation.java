import java.util.Scanner;

public class Multiplikation
{
    public static void main(String[] args)
    {
        int eingabe1, eingabe2;
        int ergebnis;
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie 2 Werte ein: \n");
        System.out.println("Wert1: ");
        eingabe1= scan.nextInt();
        System.out.println("\n Wert2: ");
        eingabe2= scan.nextInt();
        ergebnis=eingabe1 * eingabe2;
        System.out.println("\n Ergebnis: "+ergebnis);
        
        
    }
}