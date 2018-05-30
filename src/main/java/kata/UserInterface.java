package kata;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    private UnitConverter unitConverter = new UnitConverterImpl();
    private boolean finish;

    public void operateUI() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        do {
            selectOption(Integer.valueOf(scanner.next()));
        } while (!finish);
    }

    private static void printMenu() {
        System.out.println("KONWERTER JEDNOSTEK");
        System.out.println("MENU:");
        System.out.println("1. Celcjusz -> Fahrenheit");
        System.out.println("2. Fahrenheit -> Celcjusz");
        System.out.println("3. Mile -> Kilometry");
        System.out.println("4. Kilometry -> Mile");
        System.out.println("5. Funty -> Kilogramy");
        System.out.println("6. Kilogramy -> Funty");
        System.out.println("7. Zakończ");
        System.out.print("Wybierz opcję: ");
    }

    private void selectOption(int choice) {
        Scanner scanner = new Scanner(System.in);
        String enterValue = "Podaj wartość do przeliczenia: ";
        switch(choice) {
            case 1 :
                System.out.print(enterValue);
                printResult(unitConverter.celsiusToFahrenheit(Double.valueOf(scanner.next())));
                listenForEnter();
                printMenu();
                break;
            case 2 :
                System.out.print(enterValue);
                printResult(unitConverter.fahrenheitToCelsius(Double.valueOf(scanner.next())));
                listenForEnter();
                printMenu();
                break;
            case 3 :
                System.out.print(enterValue);
                printResult(unitConverter.milesToKilometers(Double.valueOf(scanner.next())));
                listenForEnter();
                printMenu();
                break;
            case 4 :
                System.out.print(enterValue);
                printResult(unitConverter.kilometersToMiles(Double.valueOf(scanner.next())));
                listenForEnter();
                printMenu();
                break;
            case 5 :
                System.out.println(enterValue);
                printResult(unitConverter.poundsToKilograms(Double.valueOf(scanner.next())));
                listenForEnter();
                printMenu();
                break;
            case 6 :
                System.out.println(enterValue);
                printResult(unitConverter.kilogramsToPounds(Double.valueOf(scanner.next())));
                listenForEnter();
                printMenu();
                break;
            case 7 :
                finish = true;
                break;
            default:
                break;
        }
    }

    private void listenForEnter() {
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Bład!");
        }
    }

    private void printResult(double result) {
        try {
            System.out.println("Wynik = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono niepoprawne dane!");
        }
        System.out.println("[Enter] - powrót do menu");
    }
}
