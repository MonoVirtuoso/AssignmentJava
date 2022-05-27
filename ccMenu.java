import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ccMenu
{
    public static void main(String[] args) {
        ccMenu ccMenu = new ccMenu();
        ccMenu.menuProcess();
    }

    boolean exit;

    public void menuProcess()
    {
        printHeader();
        while(!exit)
        {
            printMenu();
            int usrInput = getInput();
        }
    }

    public void printHeader()
    {
        System.out.println("+----------------------------------------------+");
        System.out.println("|         Welcome to the Climate Change        |");
        System.out.println("|                                              |");
        System.out.println("|                ---Infodesk---                |");
        System.out.println("+----------------------------------------------+");
    }

    public void printMenu()
    {
        System.out.println("------------------------------------------------");
        System.out.println("  What would you like to research about today?");
        System.out.println("------------------------------------------------");
        System.out.println("1. Causes of climate change");
        System.out.println("2. Effects of climate change");
        System.out.println("3. Methods to combat climate change");
        System.out.println("0. Exit");
    }

    private int getInput()
    {
        int usrInput = -1;
        while(usrInput < 0 || usrInput > 3)
        {
            
        }
    }
}
