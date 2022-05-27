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
		printMenu();
		while(!exit)
		{
			int usrInput = getInput();
			perormAction(usrInput);
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
		System.out.println("\n------------------------------------------------");
		System.out.println("  What would you like to research about today?"  );
		System.out.println("------------------------------------------------");
		System.out.println("1. Causes of climate change");
		System.out.println("2. Effects of climate change");
		System.out.println("3. Methods to combat climate change");
		System.out.println("0. Exit");
	}

	private int getInput()
	{
		Scanner kb = new Scanner(System.in);
		int usrInput = -1;
		while(usrInput < 0 || usrInput > 3)
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

	private void performAction(int usrInput)
	{
		switch(usrInput)
		{
			case 0:
				exit = true;
				System.out.println("+-------------------------------------+");
				System.out.println("| Thanks for using the Climate Change |");
				System.out.println("|           ---Infodesk---            |");
				System.out.println("+-------------------------------------+");
				break;
			case 1:
				ccCauses();
				break;
			case 2:
				ccEffects();
				break;
			case 3:
				ccCombat();
				break;
			default:
				System.out.println("An unexpected error has occured. Great Job.");
		}
	}

	private void ccCauses()
	{
		
	}
	
	private void ccEffects()
	{

	}

	private void ccCombat()
	{

	}

}
