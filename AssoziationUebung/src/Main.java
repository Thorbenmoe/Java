public class Main
{
    public static void main(String[] args)
    {
        Auto auto = new Auto("Peugot","Michelin","Winter");
        System.out.println(auto.reifen.reifenMarke);
        auto.ausgabeDaten();
    }
}
