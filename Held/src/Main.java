import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        Held player1 = new Held(1,100,50,10,7,5,10,5);
        Bartok bartok = new Bartok(45,2000,750,110,50,75,150,50);
        Scherge npc = new Scherge(1,65,70,5,12,7,5,8);


        int auswahl;
        String eingabe;
        System.out.println("\nGeben sie ihren Namen ein:");
        eingabe=scanner.nextLine();
        player1.setName(eingabe);
        System.out.println("***Der Zorn im Goldhain!***\n");
        System.out.println("Dein Name: "+player1.getName());
        System.out.println("Lebenspunkte: "+player1.getLebenspunkte());
        System.out.println("Mana: " +player1.getMana());
        System.out.println("Stärke: "+player1.getStr());
        System.out.println("Beweglichkeit: "+ player1.getDex());
        System.out.println("Intelligenz: "+ player1.getKnow());
        System.out.println("Verteidigung: "+ player1.getDef());
        System.out.println("Weißheißt:  "+player1.getWis());
        System.out.println("\n \n");
        //Kapitel 1 -Ein Bier zu viel!
        System.out.println("Erzähler: Der Duft nach Braten, Rauch und billigem Ale hängt in der Luft. Die Taverne ist überfüllt – Tagelöhner, Abenteurer und Bauern feiern.\n" +
                "Ein Streit eskaliert – zwei Söldner prügeln sich, ein Stuhl fliegt, und der Wirt Bartok, ein stämmiger Mensch mit goldverziertem Gürtel, brüllt:");
        System.out.println("\nBartok: Nicht schon wieder! Ich dulde sowas nicht, verlasst sofort meine Taverne!");
        System.out.println("\nSöldner 1:,,Seht ihr das nicht Bartok? Er ist eindeutig Mitglied der Defias, er plant deine Taverne zu sabotieren!´´");
        System.out.println("\nSöldner 2:,,Typisch für Einwohner von Gilneas, hinterhältig und feige zugleich! Ihr versteckt euch seit Jahrzehnten hinter euer Mauer, anstatt gegen die Verlassenen zu kämpfen.....´´");
        System.out.println("\nBartok ,,Ruhe jetzt bevor ich mich vergesse! Jetzt verlasst meine Taverne!´´");
        //Aktion 1
        System.out.println("\nErzähler: Der Gilneer scheint eingeschüchtert von Bartok zu sein, er wendet sich vom anderen Söldner ab, du siehst aber, dass der Söldner plötzlich ein Messer zückt und den Gilneer anscheinend angreifen möchte.");
        System.out.println("\nWie Reagierst du?");
        System.out.println("\n1. Ich werde den Wirt drauf aufmerksam machen.");
        System.out.println("\n2. Ich werfe meinen Hammer auf den Söldner.");
        System.out.println("\n3. Ich setze einen Zauber ein.");
        auswahl=scanner.nextInt();
        casting(auswahl,player1,npc);

    }

    public static void casting(int auswahl,Held player1, Scherge npc)
    {
        Scanner scanner = new Scanner(System.in);

        if (auswahl == 3) {
            System.out.println("Wähle deinen Zauber:");
            System.out.println("\n1. Heilige Flamme");
            System.out.println("\n2. Hammer des Urteils");
            auswahl = scanner.nextInt();
            if (auswahl == 1) {
                player1.heiligeFlamme(npc);
                System.out.println("Leben vom Gegner: " + npc.getLebenspunkte());
            }
        }
    }


}
