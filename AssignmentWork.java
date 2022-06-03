
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

        System.out.println("\n\nWhat is a Carbon Footprint?\n\n1 - The footprint left behind when carbon is on the groun\n2 - The carbon emitted from mining carbon resources\n3 - Natural Gases mixed with carbon\n4 - The sum of greenhouse gas emissions from an event, organization or individual\n"); 

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
                System.out.println("Correct!");
                score += 1;
                break;
        }
        System.out.println("\n\nWhat is a Greenhouse Gas?\n\n1 - A gaseous compound able to emit and absorb radiant energy from within the thermal infrared range\n2 - Gases with the colour green\n3 - Gases emitted from houses that are green\n4 - Gases emitted from the plants inside of greenhouses\n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Correct!");
                score += 1;
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

        System.out.println("\n\nWhich of the following is untrue?\n\n1 - Climate Change is a threat to mankind's future\n2 - Misinformation is one of the biggest threats for actions against Climate Change\n3 - Renewable energy is one of the best enviromental friendly solutions for preventing Climate Change\n4 - Climate Change will go away if we simply ignore it\n"); 

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
                System.out.println("Correct!");
                score += 1;
                break;
        }

        System.out.println("\n\nWhat does the term renewable energy mean?\n\n1 - Energy that has to be renewed annually\n2 - Energy resources that are new\n3 - Energy that comes from natural resources on Earth that are not finite or exhaustible\n4 - Energy that comes from people that are not finite or exhaustible\n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3: 
                System.out.println("Correct!");
                score += 1;
                break;
            case 4: 
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat does the term carbon neutrality mean?\n\n1 - A neutral carbon resource used for energy\n2 - A state of net zero carbon dioxide emissions\n3 - Neutrality achieved from common carbon emissions amongst two countries\n4 - Carbon dioxide mixed with neutral carbon\n"); 

        answer = verifyInput();

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

        System.out.println("\n\nMisinformation presents a threat towards attempts to combat climate change. Is that statement true or false?\n\n1 - True\n2 - False\n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Correct!");
                score += 1;
                break;
            case 2:
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nRenewable energy is one of the solutions towards a greener future. Is that statement true or false?\n\n1 - True\n2 - False\n"); 

        answer = verifyInput();

        switch (answer){
            case 1: 
                System.out.println("Correct!");
                score += 1;
                break;
            case 2:
                System.out.println("Wrong");
                break;
        }

        System.out.println("\n\nWhat date does Earth Day take place?\n\n1 - 20th June\n2 - 22nd April\n3 - 1st August\n4 - 24th December\n"); 

        answer = verifyInput();

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

        System.out.println("\n\nWhich of these is not an alternative renewable energy resource?\n\n1 - Hydroelectric\n2 - Wind\n3 - Geothermal\n4 - Natural Gas\n"); 

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
                System.out.println("Correct!");
                score += 1;
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
                System.out.println("You are one of the Informed");
                System.out.println("Determined and rational, you contribute to the fight against Climate Change by ensuring the information\nconsumed is correct and evidence-based, thereby negating the effects of misinformation.");

            case "INTP":
                System.out.println("You are one of the Innovators");
                System.out.println("Driven by curiosity and receptive to new ideas,the Innovator contribute to Climate Change by finding creative solutions\nto combat Climate Change, be it an invention or method to do so.");

            case "ENTJ":
                System.out.println("You are one of the Leaders");
                System.out.println("");

            case "ENTP":
                System.out.println("You are one of the Charismatics");
                System.out.println("");

            case "INFJ":
                System.out.println("You are one of the Principled")
                System.out.println("");

            case "INFP":
                System.out.println("You are one of the Empathetic");
                System.out.println("");

            case "ENFJ":
                System.out.println("You are one of the Altruistics");
                System.out.println("");

            case "ENFP":
                System.out.println("You are one of the Enthusiasts");
                System.out.println("");

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
