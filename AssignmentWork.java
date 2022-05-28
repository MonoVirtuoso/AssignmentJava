
package AssignmentJava;

import java.util.Scanner;



public class AssignmentWork {

    private int verifyInput()
	{
        int usrInput = -1;
        Scanner kb = new Scanner(System.in);

		while(usrInput < 0 || usrInput > 4)
		{
			try
			{
				System.out.print("\nEnter your selection : ");
				usrInput = Integer.parseInt(kb.nextLine()); 
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Selection. Please Try again.");
			}
		}

		return(usrInput);
	}

    
    public int Quiz() {
        int score = 0;
        System.out.println("Welcome to Green21's Climate Change Quiz!");
        System.out.println("We'll be giving you a series of question to test your knoweldge on Climate Change and\nassign you a score based on your answers!");
        System.out.println("So let's begin!");
        
        int answer = verifyInput();
        
        switch (answer){
            case 1: 
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
                break;
            case 4: 
                System.out.println("Wrong");
        }

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
        
        return score;          
    }
    
    
    public void MBTI() {

        //I have the string broken so that I can have the code in new lines instead of a single long line. Nicer on the eyes 4 me :)
        System.out.println("Welcome to 21Green's Climate Change MBTI Assignment!\n"
        + "\nYou may enter your personality type according to the MBTI test and be assigned a specific class which identifies\n"
        + "what type of defender you are against climate change. E.g.: INFP"
        + "If you have do not know your personality type, you may take the MBTI test at https://www.16personalities.com/free-personality-test");
        Scanner userInput = new Scanner(System.in);
        String userMBTI = userInput.next();

        
        switch (userMBTI)
        {
            
            case "INTJ":

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

        userInput.close();
        
    }
    
    
}
