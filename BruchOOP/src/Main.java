import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int zaehler;
        int nenner;
        int eingabe;
        boolean ungleichNull=false;
        while(true)
        {
            System.out.println("Ungleich 0 erlauben ?\n");
            System.out.println("1. Ja | 2. Nein\n");
            eingabe = scanner.nextInt();
            if(eingabe==1)
            {
                ungleichNull=true;
            }
            if(eingabe==2)
            {
                ungleichNull=false;
            }
            System.out.println("Geben sie Zähler ein: ");
            zaehler = scanner.nextInt();
            if(zaehler==0 && ungleichNull==false)
            {
                System.out.println("Fehlerhafte Eingabe!");
                break;

            }
            System.out.println("\nGeben sie Nenner ein: ");
            nenner = scanner.nextInt();
            if(nenner==0 && ungleichNull==false)
            {
                System.out.println("Fehlerhafte Eingabe!");
                break;

            }
                Bruch bruch = new Bruch(zaehler,nenner);
                bruch.setNenner(nenner);
                bruch.setZaehler(zaehler);
                System.out.println("Bruch: " + bruch.zaehler +"/"+bruch.nenner);
                break;

        }

        //Wie kann man verhindern, dass der Konstruktor, mit dem Brüche mit Nenner gleich 0 erzeugt werden können,
        // von außerhalb der Klasse Bruch aufgerufen werden kann?
        // Gleichzeitig soll die-ser Konstruktor von der Generatormethode neuerBruch genutzt werden können.
        //Antwort: eine exception werfen throw new IllegalArgumentException("Nenner darf nicht 0 sein!");

    }
}
