package kata;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserInterface.printMenu();
        Scanner input = new Scanner(System.in);
        UserInterface.selectOption(Integer.parseInt(input.nextLine()));
    }
}
