package Bruch.src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    //Bruch erstellen
    public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int zaheler;
            int nenner;
            int summand;
            int eingabe;
            int bruchID=1;
            int bruchMenge;
            double ergebnis=0;
            ArrayList<Bruch> brueche = new ArrayList<>();

            while(true)
            {
                System.out.println("Eingabe von der Gemischten Zahl \n");
                System.out.println("Eingabe: \n");
                summand = scanner.nextInt();
                System.out.println("Eingabe vom Nenner \n");
                System.out.println("Eingabe: \n");
                nenner = scanner.nextInt();
                System.out.println("Eingabe vom zähler \n");
                System.out.println("Eingabe: \n");
                zaheler = scanner.nextInt();
                Bruch bruch = new Bruch(zaheler, nenner, summand, bruchID);
                erstelleBruch(bruch, zaheler, nenner, summand);
                brueche.add(bruch);
                System.out.println(bruch.summand +" " +bruch.zaehler + "/" + bruch.nenner);
                System.out.println("\n\n\nMöchten sie zu dem Bruch einen weiteren Bruch addieren?\n");
                System.out.println("1. ja \t | \t 2. Nein\n");
                System.out.println("Eingabe: \n");
                eingabe = scanner.nextInt();
                if (eingabe == 1)
                {

                    System.out.println("Eingabe von der Gemischten Zahl \n");
                    System.out.println("Eingabe: \n");
                    summand = scanner.nextInt();
                    System.out.println("Eingabe vom Nenner \n");
                    System.out.println("Eingabe: \n");
                    nenner = scanner.nextInt();
                    System.out.println("Eingabe vom zähler \n");
                    System.out.println("Eingabe: \n");
                    zaheler = scanner.nextInt();
                    Bruch bruch2 = new Bruch(zaheler, nenner, summand, bruchID);
                    erstelleBruch(bruch2, zaheler, nenner, summand);
                    System.out.println(bruch.summand +" " +bruch.zaehler + "/" + bruch.nenner);
                    ergebnis=addiereBruch(bruch,bruch2, zaheler, nenner, summand, bruchID);
                    System.out.printf("****Ergebnis: %.2f%n", ergebnis);

                }
                if (eingabe == 2)
                {
                    break;
                }
            }
        }


        public static double addiereBruch(Bruch bruch,Bruch bruch2,int zaheler,int nenner, int summand,double ergebnis)
        {
            bruch.getNenner();
            bruch.getSummand();
            bruch.getZaehler();
            bruch.setNenner(bruch.nenner+bruch2.nenner);
            bruch.setSummand(bruch.summand+bruch2.summand);
            bruch.setZaehler(summand+bruch2.zaehler);
            ergebnis = bruch.summand + ((double) bruch.zaehler / bruch.nenner);
            ergebnis = Math.round(ergebnis * 100.0) / 100.0;
            return ergebnis;
        }


        public static void erstelleBruch(Bruch bruch,int zaheler,int nenner, int summand)
        {
            bruch.getNenner();
            bruch.getSummand();
            bruch.getZaehler();
            bruch.setNenner(nenner);
            bruch.setSummand(summand);
            bruch.setZaehler(zaheler);
        }




//ARRAY LISTE kommt in Zukunft noch
}
