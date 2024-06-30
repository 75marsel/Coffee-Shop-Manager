import java.util.ArrayList;

public class CoffeeProductManagement {

    private static ArrayList<Coffee> coffeeMenu = new ArrayList<>();
    static Coffee currentItem = null;

    public static void addToMenu(Coffee coffee) {
        System.out.println("Coffee: " + coffee.getCoffeeName() + " successfully added to menu!");
        coffeeMenu.add(coffee);
    }

    public static void addToMenu(Coffee[] coffee) {
        for(Coffee item: coffee) {
            System.out.println("Coffee: " + item.getCoffeeName() + " successfully added to menu!");
            coffeeMenu.add(item);
        }
    }

    public static void showMenu() {
        for(Coffee item: coffeeMenu) {
            System.out.println(item.getCoffeeName());
        }
    }
}
