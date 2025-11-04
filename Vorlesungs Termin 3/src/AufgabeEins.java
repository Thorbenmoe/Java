import java.util.Random;
import java.util.Scanner;

public class AufgabeEins
{
    public static  void main(String[] args)
    {
        int x,y,z;
        Random rand = new Random();
        x=rand.nextInt(100);
        y=rand.nextInt(100);
        z=rand.nextInt(100);
        int temp;
        int[] array=new int[3];
        array[0]=x;
        array[1]=y;
        array[2]=z;


        for(int i=0; i<array.length-1; i++)
        {

            if(array[i]<array[i+1])
            {
                temp=array[i+1];
                array[i+1]=array[i];
                array[i]=temp;
            }

        }
        System.out.println("Maximum: "+array[0]);
        System.out.println("Mittel: "+array[1]);
        System.out.println("Minimum: "+array[2]);

    }
}
