
package AssignmentJava;

import java.util.Scanner;



public class AssignmentWork {

    public int verifyInput()
	{
        int usrInput = -1;
        Scanner kb = new Scanner(System.in);

		while(usrInput < 1 || usrInput > 4)
		{
			try
			{
				System.out.print("\nEnter your selection : \n");
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

    public int verifyMMInput()
	{
        int usrInput = -1;
        Scanner kb = new Scanner(System.in);

		while(usrInput < 1 || usrInput > 6)
		{
			try
			{
				System.out.print("\nEnter your selection : \n");
				usrInput = Integer.parseInt(kb.nextLine()); 
                if (usrInput < 1 || usrInput > 6)
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

    public int verifyPMInput()
	{
        System.out.println("|=======================|");
        System.out.println("|        PRE MENU       |");
        System.out.println("|=======================|");
        System.out.println("1- Login");
        System.out.println("2- Register");
        System.out.println("3- Exit");
        System.out.print("Select your choice: ");
        int usrInput = -1;
        Scanner kb = new Scanner(System.in);

		while(usrInput < 1 || usrInput > 3)
		{
			try
			{
				System.out.print("\nEnter your selection : \n");
				usrInput = Integer.parseInt(kb.nextLine()); 
                if (usrInput < 1 || usrInput > 3)
                    {
                        Main.clearTerminal();
                        System.out.println("|=======================|");
                        System.out.println("|        PRE MENU       |");
                        System.out.println("|=======================|");
                        System.out.println("1- Login");
                        System.out.println("2- Register");
                        System.out.println("3- Exit");

                        System.out.println("Invalid Selection. Please Try again:");
                    }
			}
			catch(NumberFormatException e)
			{
                Main.clearTerminal();
                System.out.println("|=======================|");
                System.out.println("|        PRE MENU       |");
                System.out.println("|=======================|");
                System.out.println("1- Login");
                System.out.println("2- Register");
                System.out.println("3- Exit");

				System.out.println("Invalid Selection. Please Try again:");
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

        Main.clearTerminal();
        
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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

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

        Main.clearTerminal();

        System.out.println("Congratulations! Your score for the quiz is " + score);
        
        return score;          
    }
    
    
    public void MBTI() {

        //I have the string broken so that I can have the code in new lines instead of a single long line. Nicer on the eyes 4 me :)
        System.out.println("Welcome to 21Green's Climate Change MBTI Assignment!\n"
        + "\nYou may enter your personality type according to the MBTI test and be assigned a specific class which identifies\n"
        + "what type of defender you are against climate change. E.g.: INFP"
        + "\n\nIf you have do not know your personality type, you may take the MBTI test at https://www.16personalities.com/free-personality-test\n\n");
        

        String userAnswer = verifyStringInput();
        
        switch (userAnswer)
        {
            
            case "INTJ":
                Main.clearTerminal();
                System.out.println("You are one of the Informed");
                System.out.println("Determined and rational, you contribute to the fight against Climate Change by ensuring the information\nconsumed is correct and evidence-based, thereby negating the effects of misinformation.");
                break;

            case "INTP":
                Main.clearTerminal();
                System.out.println("You are one of the Innovators");
                System.out.println("Driven by curiosity and receptive to new ideas,the Innovator contribute to Climate Change by finding creative solutions\nto combat Climate Change, be it an invention or method to do so.");
                break;

            case "ENTJ":
                Main.clearTerminal();
                System.out.println("You are one of the Leaders");
                System.out.println("Invigorating and inspiring, the Leaders contribute to Climate Change by inspiring others to participate \nin efforts against Climate Change.");
                break;

            case "ENTP":
                Main.clearTerminal();
                System.out.println("You are one of the Brainstormers");
                System.out.println("Quick thinking and original, the Brainstormers contribute to Climate Change by using the knowledge they learned\nto find out-of-the-box solutions for Climate Change.");
                break;

            case "INFJ":
                Main.clearTerminal();
                System.out.println("You are one of the Principled");
                System.out.println("Dedication to their value and beliefs, the Principled contribute to Climate Change by keeping enviromental\nfriendly principles and sharing their ideals with their fellows.");
                break;
            case "INFP":
                Main.clearTerminal();
                System.out.println("You are one of the Empathetic");
                System.out.println("Sensitive towards the problems of others, the Empathetic help efforts against Climate Change through\nunderstanding the perspectives of those affected by Climate Change");
                break;

            case "ENFJ":
                Main.clearTerminal();
                System.out.println("You are one of the Altruists");
                System.out.println("Passionate and inspiring, Altruists bring together people to become a united force against\nClimate Change with their charisma and their passionate qualities.");
                break;

            case "ENFP":
                Main.clearTerminal();
                System.out.println("You are one of the Enthusiasts");
                System.out.println("Perceptive and curious, Enthusiasts are excellent communicators and as such are usually\ngreat representatives for efforts against Climate Change.");
                break;

            case "ISTJ":
                Main.clearTerminal();
                System.out.println("You are one of the Enforcers");
                System.out.println("Effective and efficient, the Enforcers help efforts against Climate Change through\npreventing others from committing acts that harm the environment.");
                break;

            case "ISFJ":
                Main.clearTerminal();
                System.out.println("You are one of the Supporters");
                System.out.println("Reliable and enthusiastic, Supporters contribute to actions against Climate Change by helping others\naffected by Climate Change through charity runs or volunteer work.");
                break;

            case "ESTJ":
                Main.clearTerminal();
                System.out.println("You are one of the Dedicated");
                System.out.println("Organized and direct, the Dedicated help efforts against Climate Change through volunteering\nin Climate Change campaigns and fundraisers to help those in need.");
                break;

            case "ESFJ":
                Main.clearTerminal();
                System.out.println("You are one of the Dutiful");
                System.out.println("Individuals with a strong sense of responsibility, the Dutiful contribute to Climate Change efforts by\nmanaging and organizing Climate Change campaigns and events to raise awareness.");
                break;

            case "ISTP":
                Main.clearTerminal();
                System.out.println("You are one of the Optimists");
                System.out.println("Energetic and positive, the Optimists sustain the morale of those fighting against Climate Change\nand keep the hope of a better future alive with their optimistic attitude.");
                break;

            case "ISFP":
                Main.clearTerminal();
                System.out.println("You are one of the Journeyman");
                System.out.println("Artistic and adventurous, the Journeyman help efforts against Climate Change through\nvisualizations of Climate Change with art that shows a better future or the effects of Climate Change.");
                break;

            case "ESTP":
                Main.clearTerminal();
                System.out.println("You are one of the Bold");
                System.out.println("Brave and perceptive, the Bold contribute to efforts against Climate Change by initiating\nlarge impactful events such as debates, campaigns and are quick to put down misinformation.");
                break;

            case "ESFP":
                Main.clearTerminal();
                System.out.println("You are one of the Showmen");
                System.out.println("Creative and confident, the Showmen help efforts against Climate Change through the entertainment\nthey create, be it in a form of a play or media that spreads awareness on Climate Change.");
                break;
            
        }
        
    }

    public int exit(){
        int usrInput = -1;
        Scanner kb = new Scanner(System.in);

		while(usrInput != 0)
		{
			try
			{
				System.out.print("\nEnter 0 to return to the main menu : ");
				usrInput = Integer.parseInt(kb.nextLine()); 
                if (usrInput !=0 )
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

    
    
}
