package kata;

public class UserInterface {
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
    }

    public static void selectOption(int choise) {
        switch(choise) {
            case 1 :
                System.out.println("Opcja 1");
                break;
            case 2 :
                System.out.println("Opcja 2");
                break;
        }
    }
}
