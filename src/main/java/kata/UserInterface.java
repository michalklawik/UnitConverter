package kata;

import java.util.Scanner;

public class UserInterface {

    UnitConverter unitConverter = new UnitConverterImpl();

    public static void printMenu() {
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

    public void selectOption(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch(choice) {
            case 1 :
                System.out.print("Podaj wartość do przeliczenia: ");
                System.out.print("Wynik = " + unitConverter.celsiusToFahrenheit(Double.valueOf(scanner.next())));
                break;
            case 2 :
                System.out.print("Podaj wartość do przeliczenia: ");
                System.out.print("Wynik = " + unitConverter.fahrenheitToCelsius(Double.valueOf(scanner.next())));
                break;
            case 3 :
                System.out.print("Podaj wartość do przeliczenia: ");
                System.out.print("Wynik = " + unitConverter.milesToKilometers(Double.valueOf(scanner.next())));
                break;
            case 4 :
                System.out.print("Podaj wartość do przeliczenia: ");
                System.out.print("Wynik = " + unitConverter.kilometersToMiles(Double.valueOf(scanner.next())));
                break;
        }
    }
}
