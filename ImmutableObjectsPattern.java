
import java.util.ArrayList;
import java.util.Arrays;

class TestClass {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("Veggie", 15.99, new ArrayList<>(Arrays.asList("broccoli", "squash", "tomatoes")));
        System.out.println(pizza.getName());
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getToppings());

        System.out.println(("........................"));
        pizza=new Pizza(pizza.getName(), pizza.getPrice()+5.0, pizza.getToppings());

        System.out.println(pizza.getName());
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getToppings());
    }

}

final class Pizza{

    private final String name;
    private final double price;
    private final ArrayList<String> toppings;

    public Pizza(String name, double price, ArrayList<String> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getToppings() {
        return new ArrayList<>(toppings);
    }
}
