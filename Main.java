package AssignmentJava;

import java.util.Scanner;

public class Main {
    

    static void clearTerminal(){        
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static String username_register;
    private static String password_register;
    private static String username_login;
    private static String password_login;
    private static int reply_for_mainmenu;

    static void preMenu() {
        AssignmentWork method = new AssignmentWork();
        Scanner Scanner1 = new Scanner(System.in);
        Scanner Scanner2 = new Scanner(System.in);
        boolean loggedin_user = false;
        boolean registered_user = false;
        boolean done_with_program = false;

        while (done_with_program == false && loggedin_user == false) {
            System.out.println("|=======================|");
            System.out.println("|        PRE MENU       |");
            System.out.println("|=======================|");
            System.out.println("1- Login");
            System.out.println("2- Register");
            System.out.println("3- Exit");
            System.out.print("Select your choice: ");
            int reply_for_premenu = method.verifyPMInput();
            System.out.println("");


            if (reply_for_premenu == 2 && registered_user == false) {             // ######### REGISTER MENU #########
                clearTerminal();
                System.out.println("***   REGISTER MENU   ***");

                System.out.print("Username: ");
                username_register = Scanner2.nextLine();

                System.out.print("");

                System.out.print("Password: ");
                password_register = Scanner2.nextLine();

                System.out.println("");
                clearTerminal();
                System.out.println("Successfully registered!");
                registered_user = true;
                System.out.println("");
            }

            else if (reply_for_premenu == 1 && registered_user == true) {          // ######### LOGIN MENU #########
                clearTerminal();

                System.out.println("***   LOGIN MENU   ***");

                System.out.print("Enter your username: ");
                username_login = Scanner2.nextLine();

                System.out.print("Enter your password: ");
                password_login = Scanner2.nextLine();

                if ((password_login.equals(password_register)) && (username_login.equals(username_register))) {
                    System.out.println("");
                    System.out.println("Successfully logged in!");
                    loggedin_user = true;
                    System.out.println("");
                } else {
                    clearTerminal();
                    System.out.println("Username or password is incorrect!");
                    System.out.println("");
                }
            }

            else if (reply_for_premenu == 2 && registered_user == true) {
                clearTerminal();
                System.out.println("You have already registered, please login");
                System.out.println("");
            }

            else if (reply_for_premenu == 1 && registered_user == false) {
                clearTerminal();
                System.out.println("You haven't registered yet, register first");
                System.out.println("");
            }

            else if (reply_for_premenu == 0) {
                loggedin_user = true;
            }

            else if (reply_for_premenu == 3) {
                done_with_program = true;
                System.out.println("Program exited");                         // ######### QUITED #########
                System.exit(0);
            }

            else {
                System.out.println("INVALID INPUT");
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        AssignmentWork method = new AssignmentWork();
        preMenu();                                                              // ######### PRE MENU #########

        boolean back_to_premenu = false;                                        // ######### MAIN MENU #########
        // int reply_for_mainmenu;
        boolean done_with_program = false;
        boolean loggedin_user = true;
        while (reply_for_mainmenu != 5 || done_with_program == true || loggedin_user == true) {
            clearTerminal();
            System.out.println("|=======================|");
            System.out.println("|       MAIN MENU       |");
            System.out.println("|=======================|");
            System.out.println("1- Climate Change Infodesk");
            System.out.println("2- Climate Change Quiz");
            System.out.println("3- Climate Change Personality");
            System.out.println("4- Random Climate Change Facts");
            System.out.println("5- Country's Seasons");
            System.out.println("6- Back to PRE MENU");
            System.out.print("Select your choice: ");
            reply_for_mainmenu = method.verifyMMInput();
            System.out.println("");


            // Methods
            if (reply_for_mainmenu == 1) {
                clearTerminal();
                ccMenu ccMenu = new ccMenu();
		        ccMenu.menuProcess();
                clearTerminal();

            } // Menu 1:

            else if (reply_for_mainmenu == 2) {
                clearTerminal();
                method.Quiz();
                method.exit();

            } // Menu 2
            else if (reply_for_mainmenu == 3) {
                clearTerminal();
                method.MBTI();
                method.exit();

            } // Menu 3:

            else if (reply_for_mainmenu == 4) {
                clearTerminal();
                randomfunfact randommethod = new randomfunfact();
                randommethod.randomFF();;
                method.exit();

            } // Menu 4:

            else if (reply_for_mainmenu == 5) {
                clearTerminal();
                season seasonmethod = new season();
                seasonmethod.seasons();
                method.exit();
                
            } // Menu 5:

            else if (reply_for_mainmenu == 6) {
                clearTerminal();
                System.out.println();                                              // Menu 5: BACK TO PRE-MENU
                back_to_premenu = false;
                loggedin_user = true;
                System.out.println("-Returned to PRE MENU");
                System.out.println("");
                preMenu();
            }

            else {
                System.out.println("INVALID INPUT");
                System.out.println("");
            }
        }
    }
}

