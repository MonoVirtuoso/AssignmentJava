
package AssignmentJava;

import java.util.Scanner;
import java.util.Random;

public class AssignmentWork {
    
    public void FunFact(){
        Random rand = new Random();
        
        int randFact = rand.nextInt(10)+1;
        switch (randFact){
            case 1 :
                
            
        }
            
        
    }

    public int Quiz() {
        int score = 0;
        Scanner userInput = new Scanner (System.in);
        System.out.println("Welcome to Green21's Climate Change Quiz!");
        System.out.println("We'll be giving you a series of question to test your knoweldge on Climate Change and\nassign you a score based on your answers!");
        System.out.println("So let's begin!");
        
        int answer1 = userInput.nextInt();
        
        switch (answer1){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer2 = userInput.nextInt();
        
        switch (answer2){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer3 = userInput.nextInt();
        
        switch (answer3){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer4 = userInput.nextInt();
        
        switch (answer4){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer5 = userInput.nextInt();
        
        switch (answer5){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer6 = userInput.nextInt();
        
        switch (answer6){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer7 = userInput.nextInt();
        
        switch (answer7){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer8 = userInput.nextInt();
        
        switch (answer8){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer9 = userInput.nextInt();
        
        switch (answer9){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        int answer10 = userInput.nextInt();
        
        switch (answer10){
            case 1: 
                System.out.println("Wrong");
            case 2:
                System.out.println("Wrong");
            case 3: 
                System.out.println("Correct!");
                score += 1;
            case 4: 
                System.out.println("Wrong");
        }
        
        userInput.close();

        return score;          
    }
    
    
    public void MBTI() {
        System.out.println("Welcome to 21Green's Climate Change MBTI Assignment!\n"
        + "\nYou may enter your personality type according to the MBTI test and be assigned a specific class which identifies\n"
        + "what type of defender you are against climate change. E.g.: INFP");
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

                
            default:
                
            
        }

        userInput.close();
        
    }
    
    
}
