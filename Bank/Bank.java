package Bank;



public class Bank
{

    int kontoNummer;
    double kontoStand;
    double dispoLimit=1000;
    boolean karteAngenommen=false;
    boolean gesperrt=false;


    public Bank(int kontoNummer, double kontoStand, double dispoLimit,boolean karteAngenommen,boolean gesperrt)
    {
        this.kontoNummer=kontoNummer;
        this.kontoStand=kontoStand;
        this.dispoLimit=dispoLimit;
        this.karteAngenommen=karteAngenommen;
        this.gesperrt=gesperrt;
    }


    void setKarteAngenommen(boolean karteAngenommen)
    {
        this.karteAngenommen=karteAngenommen;
    }


    void setKontoNummer(int kontoNummer)
    {
        this.kontoNummer=kontoNummer;
    }


    void setDispoLimit(double dispoLimit)
    {
        this.dispoLimit=dispoLimit;
    }


    void setKontostand(double kontoStand)
    {
        this.kontoStand=kontoStand;
    }


    void setGesperrt(boolean gesperrt)
    {
        this.gesperrt=gesperrt;
    }


    int getKontoNummer()
    {
        return this.kontoNummer;
    }


    boolean getKarteAngenommen()
    {
        return this.karteAngenommen;
    }


    double getKontostand()
    {
        return this.kontoStand;
    }


    boolean getGesperrt()
    {
        return gesperrt;
    }


}
