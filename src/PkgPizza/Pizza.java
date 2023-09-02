package PkgPizza;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double calcularPrecioTotal() {
        double total = price;
        for (Topping topping : toppings) {
            total += topping.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pizza: " + name + ", Price: " + price;
    }

    public String getName() {
        return name;
    }
}


