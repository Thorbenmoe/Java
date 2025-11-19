public class Main
{
    public static void main(String[] args)
    {
        //OOP Übung


        Mainboard mainBoardAsus = new Mainboard(4,2,4);
        Computer computerPeter = new Computer("Peter", mainBoardAsus, 400);
        System.out.println("Peter: "+ computerPeter.mainboard.kartenSlots);

        //Hier wird ein Objekt in einem Objekt erzeugt, sprich das was in Zeile 8 und 9 passiert, passiert hier in einer Zeile.
        Computer computerOlga =  new Computer(2,1,2,"AMD");
        System.out.println(computerOlga.mainboard.ramSlots);
    }
}
