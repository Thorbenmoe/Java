public class Computer
{
    //Eigenschaften
    String cpu;
    Mainboard mainboard;
    int preis;

    //Konstruktor
    public Computer(String cpu, Mainboard mainBoard, int preis)
    {
        this.cpu = cpu;
        this.mainboard = mainBoard; // wichtig!
        this.preis = preis;
    }

    public Computer(int ramSlots, int kartenSlots, int usbPorts,String cpu)
    {
        mainboard = new Mainboard(ramSlots, kartenSlots, usbPorts);
        this.cpu = cpu;
    }


    //Methoden
}
