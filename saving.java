package AssignmentJava;

public class saving {

    public void ReadCheck() {
        try{

            int i = 0;
            File initiate = new File("Registration_Details.txt");
            Scanner userName = new Scanner(System.in);
            Scanner reader = new Scanner(initiate);
            System.out.println("Please enter a new username");

            String name = userName.nextLine();

            while (i > 0)
            {
                while (reader.hasNextLine()) {
                    String registrationDataName = reader.nextLine();
                    if (name == registrationDataName)
                    {
                        System.out.println("Username already exists, please enter a new one");
                        i++;
                        name = userName.nextLine();
                    }
                    else
                    {  
                        i = 0;
                    }
                }
            }

            Write(name);

            reader.close();

        }

        catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
            
        }

    }

    public void Write(String object1) {
        try{
            String writeToFile = (object1 + "\n");

            FileWriter initiate = new FileWriter("Registration_Details.txt");
            initiate.write(writeToFile);
            initiate.close();
            System.out.println("Successfully written to file.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }    

    public void Registration() {

        ReadCheck();
        


    }
    
}
