import java.util.ArrayList;

public class Coffee {
    private String name;
    private ArrayList<String> ingredients = new ArrayList<>();
    private int price;

    Coffee(String name, ArrayList<String> ingredients, int price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getCoffeeName() {
        return this.name;
    }

    public ArrayList<String> getCoffeeIngredients() {
        return this.ingredients;
    }

    public int getCoffeePrice() {
        return this.price;
    }
}
