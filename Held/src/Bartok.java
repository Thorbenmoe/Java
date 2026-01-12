public class Bartok
{
    //Eigenschaften
    public int level;
    public String name="Bartok";
    private int lebenspunkte;
    private int mana;
    private int str;
    private int dex;
    private int know;
    private int def;
    private int wis;
    boolean enemy=false;

    //Konstruktor
    public Bartok(int level,int lebenspunkte, int mana, int str, int dex, int know, int def, int wis)
    {
        this.level=level;
        if(lebenspunkte <= 100 && lebenspunkte > 0)
        {
            this.lebenspunkte = lebenspunkte;
        }
        if(mana <= 100 && mana > 0)
        {
            this.mana = mana;
        }
        this .str = str;
        this.dex = dex;
        this.know = know;
        this.def = def;
        this.wis = wis;

    }

    //Methoden Attributabfrage
    public int getLebenspunkte()
    {
        return this.lebenspunkte;
    }


    public void setLebenspunkte(int schaden)
    {
        this.lebenspunkte -= schaden;
    }


    public String getName()
    {
        return this.name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public int getMana()
    {
        return this.mana;
    }


    public void  setMana(int mana)
    {
        this.mana = mana;
    }


    public int getStr()
    {
        return this.str;
    }


    public void setStr(int str)
    {
        this.str = str;
    }


    public int getDex()
    {
        return this.dex;
    }


    public void setDex(int dex)
    {
        this.dex = dex;
    }


    public int getKnow()
    {
        return this.know;
    }


    public void setKnow(int know)
    {
        this.know = know;
    }


    public int getDef()
    {
        return this.def;
    }


    public void setDef(int def)
    {
        this.def = def;
    }


    public int getWis()
    {
        return this.wis;
    }


    public void setWis(int wis)
    {
        this.wis = wis;
    }

}
