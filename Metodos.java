import java.nio.file.OpenOption;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Metodos {
    public Stack<Vehiculo> LlenarPila(){
        Stack<Vehiculo> pila = new Stack();
        boolean Continuar = true;
        String agregar = "";
        while (Continuar){
            Vehiculo o = new Vehiculo();
           o.setMarca(JOptionPane.showInputDialog("Ingrese la marca:  "));
           o.setColor(JOptionPane.showInputDialog("Ingrese el color:  "));
           o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:  ")));
           pila.push(o);
           agregar = JOptionPane.showInputDialog("Desea agregar mas registros?  S/N:  ");
           if(agregar.equalsIgnoreCase("N")){
                Continuar = false;

           }

        }
        return pila;
    }
    public void MostrarPila(Stack<Vehiculo>pila){
        for (Vehiculo o : pila){
            System.out.println("Marca: "+o.getMarca());
            System.out.println("Color: "+o.getColor());
            System.out.println("Precio: "+o.getPrecio());
        }
    }
}
