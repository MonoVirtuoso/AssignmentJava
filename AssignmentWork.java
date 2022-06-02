
package AssignmentJava;

import java.util.Scanner;



public class AssignmentWork {

    private int verifyInput()
	{
        int usrInput = -1;
        Scanner kb = new Scanner(System.in);

		while(usrInput < 1 || usrInput > 4)
		{
			try
			{
				System.out.print("\nEnter your selection : ");
				usrInput = Integer.parseInt(kb.nextLine()); 
                if (usrInput < 1 || usrInput > 4)
                    {
                        System.out.println("Invalid Selection. Please Try again.");
                    }
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Selection. Please Try again.");
			}
		}

        return (usrInput);

    }

    public String verifyStringInput()
    {
        Boolean checker = false;
        String[] allowedEntries = {"INTJ", "INTP", "ENTJ", "ENTP", "INJF", "INFP", "ENFJ", "ENFP", "ISTJ", "ISFJ", "ESTJ", "ESFJ", "ISTP", "ISFP", "ESTP", "ESFP"};
        String usrMBTI = "";
        while (checker == false)  {  
            Scanner userInput = new Scanner(System.in);
            usrMBTI = userInput.next();
            for (int i = 0; i < 16; i++)
            {
                if (usrMBTI.equals(allowedEntries[i])) 
                {
                    checker = true;
                    break;
                }
            }
            if(checker == false)
            {
                System.out.println("Incorrect value entered, please enter one of the personality types. E.g. : ENTJ");
            }
        }    

        return (usrMBTI);
    }
    




    
    public int Quiz() {
        int score = 0;
        System.out.println("Welcome to Green21's Climate Change Quiz!\n");
        System.out.println("We'll be giving you a series of question to test your knoweldge on Climate Change and\nassign you a score based on your answers!\n");
        System.out.println("So let's begin!");
        System.out.println("\n\nWhat is Climate Change?\n\n1 - The changing of seasons in a year\n2 - Long term shifts in global weather patterns and temperatures\n3 - The changing of night to day\n4 - The changing of weathers when moving from one country to another\n");  
        

        
        int answer = verifyInput();
        
        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Correct!");
                score += 1;
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat is a Carbon Footprint?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat is a Greenhouse Gas?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhich of the following is untrue?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat does the term renewable energy mean?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat does the term carbon neutrality mean?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nMisinformation presents a threat towards attempts to combat climate change. Is that statement true or false?\n\n1 - \n2 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nRenewable energy is one of the solutions towards a greener future. Is that statement true or false?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat date does Earth Day take place?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhich of these is not an alternative renewable energy resource?\n\n1 - \n2 - \n3 - \n4 - \n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Wrong");
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("Congratulations! Your score for the quiz is " + score);
        
        return score;          
    }
    
    
    public void MBTI() {

        //I have the string broken so that I can have the code in new lines instead of a single long line. Nicer on the eyes 4 me :)
        System.out.println("Welcome to 21Green's Climate Change MBTI Assignment!\n"
        + "\nYou may enter your personality type according to the MBTI test and be assigned a specific class which identifies\n"
        + "what type of defender you are against climate change. E.g.: INFP"
        + "If you have do not know your personality type, you may take the MBTI test at https://www.16personalities.com/free-personality-test\n\n");
        

        String userAnswer = verifyStringInput();
        
        switch (userAnswer)
        {
            
            case "INTJ":
                System.out.println("\n\nIt works.");
                break;

            case "INTP":

            case "ENTJ":

            case "ENTP":

            case "INFJ":

            case "INFP":

            case "ENFJ":

            case "ENFP":

            case "ISTJ":

            case "ISFJ":

            case "ESTJ":

            case "ESFJ":

            case "ISTP":

            case "ISFP":

            case "ESTP":

            case "ESFP":

            default:
                
            
        }
        
    }

    public void NasaReport()
    {

    }

    
    
}
