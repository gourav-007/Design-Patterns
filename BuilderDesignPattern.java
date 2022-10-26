import java.util.ArrayList;
import java.util.Arrays;

//Builder Design Pattern
class TestClass {

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder
                .setName("Veggie")
                .setPrice(15.99)
                .setToppings(new ArrayList<>(Arrays.asList("broccoli", "squash", "tomatoes")))
                .setSize(11)
                .setTips(4.00)
                .setDeliveryAdress("Home");

        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza.getName());
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getToppings());
        System.out.println(pizza.getSize());
        System.out.println(pizza.getTips());
        System.out.println(pizza.getDeliveryAdress());

    }
}

class PizzaBuilder{

    private String name;
    private double price;
    private ArrayList<String> toppings;
    private int size;
    private String deliveryAdress;
    private String storeManager;
    private double tips;


    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public PizzaBuilder setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
        return this;

    }

    public PizzaBuilder setStoreManager(String storeManager) {
        this.storeManager = storeManager;
        return this;

    }

    public PizzaBuilder setTips(double tips) {
        this.tips = tips;
        return this;
    }

    public Pizza build(){
        return new Pizza(name,price,toppings,size,deliveryAdress,storeManager,tips);
    }

}

final class Pizza{

    private final String name;
    private final double price;
    private final ArrayList<String> toppings;
    private final int size;
    private final String deliveryAdress;
    private final String storeManager;
    private final double tips;

    public Pizza(String name, double price, ArrayList<String> toppings, int size, String deliveryAdress, String storeManager, double tips) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
        this.size = size;
        this.deliveryAdress = deliveryAdress;
        this.storeManager = storeManager;
        this.tips = tips;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public int getSize() {
        return size;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public String getStoreManager() {
        return storeManager;
    }

    public double getTips() {
        return tips;
    }
}
