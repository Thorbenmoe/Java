class Bruch
{
    int zaehler;
    int nenner = 1;

    // Konstruktoren der Klasse Bruch()
    Bruch()
    {
        this(1);
    }

    Bruch(int zaehler)
    {
        this(zaehler, 1);
    }

    Bruch(int zaehler, int nenner)
    {
        if (nenner ==0)
        {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
        }
        this.zaehler = zaehler;
        this.nenner = nenner;


    }

    public int getZaehler()
    {
        return zaehler;
    }

    public int getNenner()
    {
        return nenner;
    }

    public void setZaehler(int zaehler)
    {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner)
    {
        this.nenner = nenner;
    }
}