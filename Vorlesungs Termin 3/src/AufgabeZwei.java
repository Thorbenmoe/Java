import java.util.Scanner;

public class AufgabeZwei
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int eingabe;
        int fakultät=0;
        System.out.println("******Fakultätsbestimmtung******\n");
        System.out.println("Eingabe: \n");
        eingabe=scanner.nextInt();
        fakultät=rekursiv(eingabe);
        System.out.println(fakultät);
    }


    public static int rekursiv(int eingabe)
    {
        if(eingabe==1)
        {
            return eingabe;
        }
        return rekursiv(eingabe-1)*eingabe;

    }
}
