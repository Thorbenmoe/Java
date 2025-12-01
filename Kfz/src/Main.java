import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String eingabeKennzeichen;
        String eingabeModell;
        int eingabe;
        int gemietet=0;
        Scanner scanner = new Scanner(System.in);
        String[] mietArray= new String[10];
        String[] jemalsVermietet= new String[50];
        while(true)
        {
            System.out.println("Möchten sie ein Auto zurückgeben oder Mieten?");
            System.out.println("\n 1. Mieten | 2. Zurückgeben\n");
            eingabe=scanner.nextInt();
            scanner.nextLine(); // Leert den Puffer
            if(eingabe==1)
            {
                System.out.println("Erstellung eines KfZ.");
                System.out.println("\nKennzeichen:");
                eingabeKennzeichen= scanner.nextLine();
                scanner.nextLine(); // Leert den Puffer
                System.out.println("\nErstellung des Modells:");
                eingabeModell=scanner.nextLine();
                scanner.nextLine(); // Leert den Puffer
                Kfz kfz = new Kfz(eingabeKennzeichen, eingabeModell);
                System.out.println("Ausgabe: " + kfz.getKennzeichen()+" "+ kfz.GetModell());
                kfz.getAnzahlKfz();
                if(kfz.getAnzahlKfz()==0)
                {
                    System.out.println("Keine Mietwagen mehr vorhanden!");
                    break;

                }
                if(kfz.getAnzahlKfz()>=1)
                {
                    kfz.setAnzahlKfz(-1);
                    ++gemietet;
                    mietArray[gemietet-1]=eingabeKennzeichen;
                    jemalsVermietet[gemietet-1]=eingabeKennzeichen;
                    System.out.println("\n*****Jemals vermietet*****\n");
                    for(int j=0; j<jemalsVermietet.length; j++)
                    {
                        if(jemalsVermietet[j]==null)
                        {
                            continue;
                        }
                        System.out.println(jemalsVermietet[j]);
                        System.out.println("\n");
                    }
                }
            }
            if(eingabe==2)
            {
                System.out.println("Welches KFZ wollen sie zurückgeben?");
                for (int i = 0; i < mietArray.length; i++)
                {
                    if(mietArray[i]==null)
                    {
                        continue;
                    }
                    System.out.println(mietArray[i]);
                }
                System.out.println("Eingabe: ");
                eingabe=scanner.nextInt();
                System.out.println("KFZ wurde zurückgegeben!\n");
                for (int i = 0; i < mietArray.length; i++)
                {
                    if(i==eingabe-1)
                    {
                        mietArray[i]=null;
                    }
                    if(mietArray[i]==null)
                    {
                        continue;
                    }
                    System.out.println(mietArray[i]);
                }


            }
        }
    }
}
