public class Kfz
{

    private String kennzeichen, modell;
    int kmStand;
    private long vermietetAn = -1; // Kundennummer des Kunden, an den das // Kfz vermietet ist; -1 = unvermietet
    int anzahlKfz=10;


   public Kfz(String kennzeichen, String modell)
    {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
    }

    boolean vermietenAn (long eineKundenNummer,int anzahlKfz)
    { if (vermietetAn == -1)
    {
        vermietetAn = eineKundenNummer; return true;
    }
    else return false;
    }
    void zurueckgeben()
    { vermietetAn = -1;
    }

    public String getKennzeichen()
    {
        return this.kennzeichen;
    }

    public String GetModell()
    {
        return this.modell;
    }

    public int getAnzahlKfz()
    {
        return this.anzahlKfz;
    }

    public int setAnzahlKfz(int anzahlKfz)
    {
         return this.anzahlKfz=anzahlKfz+anzahlKfz;
    }
}
