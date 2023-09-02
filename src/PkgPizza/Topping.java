package PkgPizza;

import java.util.ArrayList;
import java.util.ArrayList;

public class Topping {
    private String nombre;
    private double precio;
    private ArrayList<String> ingredientes = new ArrayList<>();

    public Topping(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void agregarIngrediente(String ingrediente, double precio) {
        this.ingredientes.add(ingrediente);
        this.precio += precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Topping{ nombre:" + nombre + ", Ingredientes: " + ingredientes + ", Precio: " + precio + "}";
    }

}