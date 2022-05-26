
package assignmentwork;

import java.util.Random;

//10 Options, using RNGesus to determine

public class FunFact
{
    public void ffact(String [] args)
    {
        Random dice = new Random();
        int diceres;

        for (int counter = 1; counter <=10; counter++)
        {
            diceres = dice.nextInt(10);
            System.out.println("diceres\n");
        }
    }
}