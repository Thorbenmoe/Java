public class Pokemon {
    //Eigenschaften / Attribute
    String name;
    String typ;
    int groeße;
    int gewicht;
    String faehigkeit;
    String attacke;
    int entwicklung;


    //Konstruktor
    public Pokemon(String name, String typ, int groeße, int gewicht, String faehigkeit, String attacke) {
        super();
        this.name = name;
        this.typ = typ;
        this.groeße = groeße;
        this.gewicht = gewicht;
        this.faehigkeit = faehigkeit;
        this.attacke = attacke;
    }


    public void faehigkeiten() {
        System.out.println("\n" + name + " \nFähigkeit ist: " + faehigkeit);
        System.out.println("\nSeine Attacke " + attacke + " Wird dadurch verstärkt wenn die Lebenspunkte unter 20% sind");
    }


    public void entwickeln(String name, boolean entEntwickelt) {
        if (!entEntwickelt) {
            System.out.println(name + "entwickelt sich zu Glutexo");
            System.out.println("\n" + name + " entwickelt sich auf Level: " + entwicklung);
        }
    }
}
