import java.util.Scanner;

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
			performAction(usrInput);
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
				System.out.println("Did you just type something thats not a number?? Great Job. Try again.");
			}
		}
		return(usrInput);
	}

	private int exitPrompt()
	{
		Scanner kb2 = new Scanner(System.in);
		int usrInput = -1;
		while(usrInput != 0)
		{
			try
			{
				System.out.print("\nPress 0 to exit : ");
				usrInput = Integer.parseInt(kb2.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Did you just type something thats not a number?? Great Job. Try again.");
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
		int exitInt = -1;
		System.out.println("+-------------------------------------+");
		System.out.println("|              Causes of              |");
		System.out.println("|            Climate Change           |");
		System.out.println("+-------------------------------------+");
		System.out.println("1. Power Generation");
		System.out.println("2. Manufacturing of Goods");
		System.out.println("3. Deforestation");
		System.out.println("4. Inefficient Usage of Transportation Methods");
		System.out.println("0. Exit back to Infodesk");
		switch(getInput())
		{
			case 1:
				System.out.println("https://www.iea.org/commentaries/if-the-energy-sector-is-to-tackle-climate-change-it-must-also-think-about-water");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 2:
				System.out.println("https://www.c2es.org/document/a-climate-of-change-manufacturing-must-rise-to-the-risks-and-opportunities-of-climate-change-2/#:~:text=Manufacturing%20operations%20that%20are%20most,as%20paper%20and%20chemicals%20operations.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 3:
				System.out.println("https://www.ucsusa.org/resources/tropical-deforestation-and-global-warming#:~:text=When%20forests%20are%20cut%20down,percent%20of%20global%20warming%20pollution.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 4:
				System.out.println("https://www.epa.gov/transportation-air-pollution-and-climate-change/carbon-pollution-transportation");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 0:
				printHeader();
				printMenu();
				break;
		}
	}
	
	private void ccEffects()
	{
		int exitInt = -1;
		System.out.println("+-------------------------------------+");
		System.out.println("|              Effects of             |");
		System.out.println("|            Climate Change           |");
		System.out.println("+-------------------------------------+");
		System.out.println("1. Hotter Temperatures");
		System.out.println("2. Loss of Species");
		System.out.println("3. Increased Severity of Natural Disasters");
		System.out.println("4. A Warming, Rising Ocean");
		System.out.println("0. Exit back to Infodesk");
		switch(getInput())
		{
			case 1:
				System.out.println("https://www.climate.gov/news-features/understanding-climate/climate-change-global-temperature#:~:text=According%20to%20NOAA%27s%202020%20Annual,more%20than%20twice%20that%20rate.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 2:
				System.out.println("https://www.biologicaldiversity.org/campaigns/global_warming_and_endangered_species/index.html#:~:text=Global%20warming%20is%20projected%20to,human%20societies%20across%20the%20globe.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 3:
				System.out.println("https://www.usgs.gov/faqs/how-can-climate-change-affect-natural-disasters");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 4:
				System.out.println("https://climate.nasa.gov/vital-signs/sea-level/#:~:text=Global%20sea%20levels%20are%20rising,of%20seawater%20as%20it%20warms.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 0:
				printHeader();
				printMenu();
				break;
		}
	}

	private void ccCombat()
	{
		int exitInt = -1;
		System.out.println("+-------------------------------------+");
		System.out.println("|        Methods used to combat       |");
		System.out.println("|            Climate Change           |");
		System.out.println("+-------------------------------------+");
		System.out.println("1. Save Energy at Home");
		System.out.println("2. Taking More Climate Friendly Methods of Transportation");
		System.out.println("3. Reducing, Reusing and Recyling");
		System.out.println("4. Changing Homes' sources of energy");
		System.out.println("0. Exit back to Infodesk");
		switch(getInput())
		{
			case 1:
				System.out.println("https://19january2017snapshot.epa.gov/climatechange/what-you-can-do-home_.html");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 2:
				System.out.println("https://www.conserve-energy-future.com/transportation-alternatives-combat-climate-change.php");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 3:
				System.out.println("https://www.canr.msu.edu/news/reduce_recycle_and_reuse_to_decrease_climate_change#:~:text=We%20can%20help%20protect%20our,Recycle%20waste%20products.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 4:
				System.out.println("https://www.sciencedirect.com/science/article/pii/0301421595001174#:~:text=Solar%20energy%20is%20one%20option,and%2032%25%20in%2050%20years.");
				while (exitInt != 0)
				{
					exitInt = exitPrompt();
				}
				printHeader();
				printMenu();
				break;
			case 0:
				printHeader();
				printMenu();
				break;
		}
	}

}
