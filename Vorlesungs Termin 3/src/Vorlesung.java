public class Vorlesung
{
    public static void main(String[] args)
    {
        int[] feld= new int[4];
        int[] feld2 = feld;
        feld2=feld;

        feld[1]=10;
        feld2[0]=feld2[1]+5;
        System.out.println(feld[1]);
        System.out.println(feld2[0]);
    }
}
