package kata;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        UserInterface userInterface = new UserInterface();
        UserInterface.printMenu();
        Scanner input = new Scanner(System.in);
        userInterface.selectOption(Integer.parseInt(input.nextLine()));
    }
}
