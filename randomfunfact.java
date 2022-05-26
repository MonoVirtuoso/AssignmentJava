package AssignmentJava;

import java.util.Random;

//10 Options, using RNGesus to determine

public class randomfunfact
{
    public static void main(String[] args) 
    {
        Random dice = new Random();
        int diceres = 0;

        for (int counter = 1; counter <=10; counter++)
        {
            diceres = dice.nextInt(10)+1;
        }
        switch (diceres)
        {
            case 1:
                System.out.println("Not so fun fact, The global temperature on an average has increased by 0.6 to 1 degree Celsius till the 20th century every single year. \n");
            case 2:
                System.out.println("Not so fun fact, The United States constitutes 5% of the world population and contributes to 22% of the world’s carbon emission whereas China constitutes 18.5% of the world population and contributes 27% of the world's carbon emissions.\n");
            case 3:
                System.out.println("Not so fun fact, Around 15% of the carbon released in the environment is due to deforestation and change in the use of land.\n");
            case 4:
                System.out.println("Not so fun fact, The golden Toad is the first species to go extinct due to climate change.\n");
            case 5:
                System.out.println("Not so fun fact, The use of air conditioners and electric fans already accounts for about a fifth of the total electricity in buildings around the world – or 10% of all global electricity consumption.\n");
            case 6:
                System.out.println("Not so fun fact, Hurricanes, droughts and coral deaths are a few of the natural disasters caused due to climate change.\n");
            case 7:
                System.out.println("Not so fun fact, Climate change enhances the spread of pests that causes life-threatening diseases like dengue, malaria, Lyme disease etc.\n");
            case 8:
                System.out.println("Not so fun fact, 20 of the warmest years on record have occurred in the last 22 years, as stated by The World Meteorological Organization (WMO), compounding the research released in the 2018 IPCC report.\n");
            case 9:
                System.out.println("Not so fun fact, The number of climate change-related incidents has increased fourfold between 1980 and 2010.\n");
            case 10:
                System.out.println("Not so fun fact, Due to the greenhouse effect, the average temperature of the earth is 15 degrees rather than -18 degrees without the greenhouse effect.\n");
        }
    }
}