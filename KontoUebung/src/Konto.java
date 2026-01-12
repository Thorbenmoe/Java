class Konto
{
    //Objektattribute
    private long ktoNr;
    private double ktoStand;
    final long basisKtoNR =0L;

    //Klassenattribute
    private static int anzahlKonten=0;
    //Klassenmethoden
    public static int getAnzahlKonten()
    {
        return anzahlKonten;
    }

    //Konstruktoren
    Konto(long basisKtoNR)
    {
        setKtoNr(basisKtoNR);
        getKtoNr(this.ktoNr);
        System.out.println("Kontonummer: " + Konto.this.ktoNr);
    }

    //Objektmethoden
    public long  getKtoNr(long ktoNr)
    {

        return ktoNr;
    }

    public void setKtoNr(long basisKtoNR)
    {
        anzahlKonten = anzahlKonten+1;
        this.ktoNr = basisKtoNR+anzahlKonten;
    }

}