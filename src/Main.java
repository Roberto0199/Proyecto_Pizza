import PkgPizza.Pizza;
import PkgPizza.Topping;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita",100);
        pizza.addTopping(new Topping("Tomate"));
        pizza.addTopping(new Topping("Cebolla"));
        pizza.addTopping(new Topping("Peperoni"));

        }
    }
