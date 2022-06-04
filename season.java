package AssignmentJava;

import java.util.Scanner;
public class season {
    
    public void seasons() 
    {           
        Scanner userInput = new Scanner(System.in);
        Main.clearTerminal();
        System.out.println("Which country would you like to know the season for?, type in the correct number");
        System.out.println("1) Malaysia");
        System.out.println("2) Singapore");
        System.out.println("3) India");
        System.out.println("4) Australia");
        System.out.println("5) UK");
        int countryChoice = userInput.nextInt();
        if (countryChoice == 1) 
        {
            Main.clearTerminal();
            System.out.println("Which month would you like to know the season for?, type in the correct number");
            System.out.println("January = 1");
            System.out.println("Febraury = 2");
            System.out.println("March = 3");
            System.out.println("April = 4");
            System.out.println("May = 5");
            System.out.println("June = 6");
            System.out.println("July = 7");
            System.out.println("August = 8");
            System.out.println("September = 9");
            System.out.println("October = 10");
            System.out.println("November = 11");
            System.out.println("December = 12");
            int month = userInput.nextInt();
            if (month >= 3 && month <= 5) {
                System.out.println("The season is spring");
            } 
            else if (month >= 6 && month <= 8) {
                System.out.println("The season is summer");
            } 
            else if (month >= 9 && month <= 11) {
                System.out.println("The season is autumn");
            } 
            else if (month == 12 || month == 1 || month == 2) {
                System.out.println("The season is winter");
            }
        } 
        else if (countryChoice == 2) 
        {
            Main.clearTerminal();
            System.out.println("Which month would you like to know the season for?, type in the correct number");
            System.out.println("January = 1");
            System.out.println("Febraury = 2");
            System.out.println("March = 3");
            System.out.println("April = 4");
            System.out.println("May = 5");
            System.out.println("June = 6");
            System.out.println("July = 7");
            System.out.println("August = 8");
            System.out.println("September = 9");
            System.out.println("October = 10");
            System.out.println("November = 11");
            System.out.println("December = 12");
            System.out.println("Which month would you like to know the season for?");
            int month = userInput.nextInt();
            if (month >= 3 && month <= 5) {
                System.out.println("The season is spring");
            } 
            else if (month >= 6 && month <= 8) {
                System.out.println("The season is summer");
            } 
            else if (month >= 9 && month <= 11) {
                System.out.println("The season is autumn");
            } 
            else if (month == 12 || month == 1 || month == 2) {
                System.out.println("The season is winter");
            }
        } 
        else if (countryChoice == 3) {
            Main.clearTerminal();
            System.out.println("Which month would you like to know the season for?, type in the correct number");
            System.out.println("January = 1");
            System.out.println("Febraury = 2");
            System.out.println("March = 3");
            System.out.println("April = 4");
            System.out.println("May = 5");
            System.out.println("June = 6");
            System.out.println("July = 7");
            System.out.println("August = 8");
            System.out.println("September = 9");
            System.out.println("October = 10");
            System.out.println("November = 11");
            System.out.println("December = 12");
            System.out.println("Which month would you like to know the season for?");
            int month = userInput.nextInt();
            if (month >= 3 && month <= 5) {
                System.out.println("The season is spring");
            } 
            else if (month >= 6 && month <= 8) {
                System.out.println("The season is summer");
            } 
            else if (month >= 9 && month <= 11) {
                System.out.println("The season is autumn");
            } 
            else if (month == 12 || month == 1 || month == 2) {
                System.out.println("The season is winter");
            }
        } 
        else if (countryChoice == 4) {
            Main.clearTerminal();
            System.out.println("Which month would you like to know the season for?, type in the correct number");
            System.out.println("January = 1");
            System.out.println("Febraury = 2");
            System.out.println("March = 3");
            System.out.println("April = 4");
            System.out.println("May = 5");
            System.out.println("June = 6");
            System.out.println("July = 7");
            System.out.println("August = 8");
            System.out.println("September = 9");
            System.out.println("October = 10");
            System.out.println("November = 11");
            System.out.println("December = 12");
            System.out.println("Which month would you like to know the season for?");
                int month = userInput.nextInt();
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("The season is summer");
            } 
            else if (month >= 3 && month <= 5) {
                System.out.println("The season is autumn");
            } 
            else if (month >= 6 && month <= 8) {
                System.out.println("The season is winter");
            } 
            else if (month >= 9 && month <= 11) {
                System.out.println("The season is spring");
            }
        } 
        else if (countryChoice == 5) {
            Main.clearTerminal();
            System.out.println("Which month would you like to know the season for?, type in the correct number");
            System.out.println("January = 1");
            System.out.println("Febraury = 2");
            System.out.println("March = 3");
            System.out.println("April = 4");
            System.out.println("May = 5");
            System.out.println("June = 6");
            System.out.println("July = 7");
            System.out.println("August = 8");
            System.out.println("September = 9");
            System.out.println("October = 10");
            System.out.println("November = 11");
            System.out.println("December = 12");
            System.out.println("Which month would you like to know the season for?");
            int month = userInput.nextInt();
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("The season is winter");
            } 
            else if (month >= 3 && month <= 5) {
                System.out.println("The season is spring");
            } 
            else if (month >= 6 && month <= 8) {
                System.out.println("The season is summer");
            } 
            else if (month >= 9 && month <= 11) {
                System.out.println("The season is autumn");
            }
        }

    }
}

