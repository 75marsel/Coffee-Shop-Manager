import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuNavigator();

        CoffeeProductManagement.showMenu();
    }

    private static void menuNavigator() {
        System.out.println("Welcome to Coffee Shop Manager!");
        System.out.println("[1] - Access Ordering System");
        System.out.println("[2] - Access Coffee Product Management");
        System.out.println("[3] - Access Employee Database");
        int choice = choiceWriter();

        switch (choice) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                npmAssistant();
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                break;
        }
    }

    private static int choiceWriter() {
        Scanner scanner = new Scanner(System.in);
        int choiceValue = 0;

        while(choiceValue <= 0 || choiceValue > 3) {
            try {
                System.out.print("Type here: ");
                choiceValue = scanner.nextInt();
            }
            catch(Exception e) {
                System.out.println("Please enter a valid number!");
            }
        }


        return choiceValue;
    }

    private static void npmAssistant() {
        System.out.println("Welcome to CPM Assistant");
        System.out.println("[1] - Create Coffee");
        System.out.println("[2] - Add Coffee");
        System.out.println("[3] - Access Employee Database");
        int choice = choiceWriter();

        switch (choice) {
            case 1:
                coffeeItemMaker();
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
        }
    }

    private static void coffeeItemMaker() {
        String name = "";
        ArrayList<String> ingredients = new ArrayList<>();
        int price = 0;
        Scanner scanner = new Scanner(System.in);

        // coffee must be named with 3 or more characters
        while(name.isBlank() || name.length() <= 3) {
            System.out.print("Give your Coffee a Name: ");
            try {
                name = scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Input a valid data!");
            }
        }

        // ingredient lists. type q OR Q to stop adding
        while(true) {
            System.out.println("Add a coffee ingredient: ");
            try {
                String data = scanner.nextLine();
                if((data.equals("q") || data.equals("Q")) && !ingredients.isEmpty()) {
                    break;
                }
                ingredients.add(data);
            } catch(Exception e) {
                System.out.println("Input a valid data!");
            }
        }

        // coffee must be named with 3 or more characters
        while(price <= 0) {
            System.out.print("Give your Coffee a Price: ");
            try {
                price = scanner.nextInt();
            } catch(Exception e) {
                System.out.println("Input a valid data!");
            }
        }
        scanner.nextLine();
        Coffee item = new Coffee(name, ingredients, price);

        while(true) {
            try{
                System.out.println("Add the item to the menu?");
                char prompt = scanner.nextLine().charAt(0);

                if(prompt == 'q' || prompt == 'Q') {
                    CoffeeProductManagement.addToMenu(item);
                    break;
                } else {
                    System.out.println("Adding the Coffee to the menu was cancelled.");
                }

            } catch (Exception e) {
                System.out.println("Invalid data.");
                scanner.nextLine();
            }
        }
    } // end coffee item maker
}