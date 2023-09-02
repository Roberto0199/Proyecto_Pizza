import PkgPizza.Pizza;
import PkgPizza.Topping;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



        public class Main {
            public static void main(String[] args) {

                Topping tomate = new Topping("Tomate", 10.50);
                Topping cebolla = new Topping("Cebolla", 15.0);
                Topping peperoni = new Topping("Peperoni", 17.0);
                Topping champiñones = new Topping("Champiñones", 22.0);

                Pizza pizza = new Pizza("Margarita", 99.99);

                pizza.addTopping(tomate);
                pizza.addTopping(cebolla);
                pizza.addTopping(peperoni);
                pizza.addTopping(champiñones);

                System.out.println("Pizza: " + pizza.getName());
                System.out.println("El Precio total: " + pizza.calcularPrecioTotal());

                Pizza pizza1 = new Pizza("Napolitana", 89.99);
                pizza1.addTopping(tomate);
                pizza1.addTopping(peperoni);
                pizza1.addTopping(champiñones);

                System.out.println("Pizza: " + pizza1.getName());
                System.out.println("El Precio total: " + pizza1.calcularPrecioTotal());


            }
        }

