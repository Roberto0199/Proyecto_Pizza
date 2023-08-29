package PkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Topping {
    private String nombre; //name of topping
    private ArrayList<String> ingredientes = new ArrayList<>();
    public void agregarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }
    public Topping(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString(){
        return "Topping{ nombre:"+nombre+"Ingredientes"+ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}


