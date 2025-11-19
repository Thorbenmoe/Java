public class Auto
{
    String autoMarke;
    Reifen reifen;


    public Auto(String autoMarke,String reifenMarke, String reifenTyp)
    {
        this.autoMarke = autoMarke;
        reifen = new Reifen(reifenMarke,reifenTyp);
    }

    public void ausgabeDaten()
    {
        System.out.println("Reifenmarke: "+ this.reifen.reifenMarke);
        System.out.println("ReifenTyp: "+ this.reifen.reifenTyp);
        System.out.println("AutoMarke: "+ this.autoMarke);
    }
}
