public class Main
{
    public static void main(String[] args)
    {
        Auto auto = new Auto("Peugot","Michelin","Winter");
        Auto bmw = new Auto("BMW", "Goodyear", "Winter");
        Auto VW = new Auto("VW", "Michelin", "Sommer");


        bmw.ausgabeDaten();
        VW.ausgabeDaten();

    }
}
