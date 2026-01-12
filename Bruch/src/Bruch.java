package Bruch.src;

public class Bruch {
    int zaehler;
    int nenner;
    int summand;
    int bruchID;

    public Bruch(int zaehler, int nenner, int summand, int bruchID) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.summand = summand;
    }


    int getBruchID() {
        return bruchID;
    }


    int getZaehler() {
        return this.zaehler;
    }


    int getNenner() {
        return this.nenner;
    }


    int getSummand() {
        return this.summand;
    }


    void setBruchID(int bruchID) {
        this.bruchID = bruchID;
    }


    void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }


    void setNenner(int nenner) {
        this.nenner = nenner;
    }


    void setSummand(int summand) {
        this.summand = summand;
    }
}
