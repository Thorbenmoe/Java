public class Schiggy extends Pokemon
{
     //Eigenschaften / Attribute
    int entwicklung=16;
    private boolean entEntwickelt=false;



    public Schiggy(String name, String typ, int gewicht, int groeße, String faehigkeit, String attacke, int entwicklung,boolean entEntwickelt)
    {
        super("Schiggy", "Wasser", 50, 5, "Sturzbach", "Aquaknarre");

    }

    //Überschreibung einer MEthode aus der Elternklasse
    @Override
    public void entwickeln(String name,boolean entEntwickelt)
    {

        if(!entEntwickelt)
        {
            System.out.println(" Schiggy entwickelt sich zu Schillok!");
            entEntwickelt = true;
        }
        else
        {
            System.out.println(" Schiggy ist bereits entwickelt.");
        }


    }
}
