public class Laptop {

    String marke;
    int ram;
    String cpu;
    double preis;


    public Laptop(String marke, int ram, String cpu, double preis) {
        this.marke = marke;
        this.ram = ram;
        this.cpu = cpu;
        this.preis = preis;
    }

    public void starten()
    {
        System.out.println(marke + " Fährt hoch.");
        System.out.println("\n" +marke+ " besitzt " + ram +" GB RAM und einen " +cpu+ " Prozessor");
        System.out.println("Der Preis beträgt: "+ preis);
    }
}
