import java.util.Random;

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
        int[] array2=new int[3];
        int[] arrayGemischt= new int[array.length+array2.length];
        array[0]=x;
        array[1]=y;
        array[2]=z;
        array2[0]=rand.nextInt(100);
        array2[1]=rand.nextInt(100);
        array2[2]=rand.nextInt(100);


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
        shuffleArray(array,array2,arrayGemischt);
        for(int j=0; j<arrayGemischt.length; j++)
        {
            System.out.println(j+1 +". Wert des Gemischten Array "+arrayGemischt[j]);
        }

    }

    //Aufgabe 4 Arrays Mischen

    public static int shuffleArray(int[] array, int[] array2,int[] arrayGemischt)
    {
        int catcher=0;
        int catcher2=0;

        for(int i=0; i<(arrayGemischt.length); i++)
        {

            if(i%2==0)
            {
                arrayGemischt[i]=array[catcher];
                catcher++;
                continue;
            }
            else
            {
                arrayGemischt[i]=array2[catcher2];
                catcher2++;
            }

        }
        return 0;
    }
}
