import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        /*if (6 >= 3) //uppgift 1
        {
            System.out.println("hello world");
        }*/

        /*  //uppgift 2 och 3

        System.out.println("Skriv användarnamn");
        String username = scanner.nextLine();

        System.out.println("Skriv lösenord");
        String password = scanner.nextLine();

        if (username.equals("noname") && password.equals("nopass"))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Wrong username or password");
        }*/


        /*int antal = 0; //uppgift 4

        while (antal < 32)
        {
            System.out.println("Hello world");
            antal++;
        }*/




        /*String userinput;    //uppgift 5
        String correctPassword = "mypassword";
        boolean loop = true;

        while(loop)
        {
            System.out.println("enter password");
            userinput = scanner.nextLine();

            if(userinput.equals(correctPassword))
            {
                loop = false;
            }
        }*/


        /*for (int i = 0; i < 5; i++) { // uppgift 6
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            int number = Integer.parseInt(input);
            if (number > 5) {
                System.out.println("Högre än 5!");
            }
        }*/


        //slut övning

        boolean gissning = true;
        int tal = 50;

        while(gissning)
        {

            System.out.println("Gissa på ett tal 1-100");
            String gissning2 = scanner.nextLine();

            int gissningNum = Integer.parseInt(gissning2);

            if(gissningNum < tal)
            {
                System.out.println("Din gissning är för låg");
            }
            else if (gissningNum > tal)
            {
                System.out.println("Dinn gissning är för hög");
            }
            else
            {
                System.out.println("Du gissade rätt");
                gissning = false;
            }

        }



    }
}