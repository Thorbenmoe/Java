import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        long eingabe;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Geben sie ihre Wunsch Kontonummer ein:");
        eingabe = scanner.nextLong();
        Konto konto = new Konto(eingabe);

    }
}
