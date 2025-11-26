public class Held
{
    //Eigenschaften
    public String name;
    private int lebenspunkte;

    //Konstruktor
    public Held(int lebenspunkte)
    {
        if(lebenspunkte <= 100 && lebenspunkte > 0)
        {
            this.lebenspunkte = lebenspunkte;
        }
    }

    //Methoden
    public void getLebenspunkte()
    {
        System.out.println("Lebenspunkte: " + this.lebenspunkte);
    }

    public void setLebenspunkte(int schaden)
        {
            this.lebenspunkte -= schaden;
        }
}
