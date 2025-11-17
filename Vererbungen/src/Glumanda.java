
public class Glumanda extends Pokemon {
    //Eigenschaften / Attribute
    int entwicklung = 16;
    private boolean entEntwickelt = false;


    public Glumanda(String name, String typ, int gewicht, int groeße, String faehigkeit, String attacke, int entwicklung, boolean entEntwickelt) {
        //Schlüsselwort, leitet die Parameter an die Superklasse weiter von der wir erben.
        super("Glumanda", "Feuer", 60, 5, "Großbrand", "Glut");

    }

    @Override
    public void entwickeln(String name, boolean entEntwickelt) {
        if (!entEntwickelt) {
            System.out.println(" Glumanda entwickelt sich zu Glutexo!");
            entEntwickelt = true;
        } else {
            System.out.println(" Glumanda ist bereits entwickelt.");
        }

    }
}
