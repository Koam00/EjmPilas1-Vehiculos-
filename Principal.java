import java.util.Stack;

public class Principal {
    public static void main(String[] arg){
        Metodos m = new Metodos();
        Stack<Vehiculo> pila = m.LlenarPila();

        m.MostrarPila(pila);
    }
}
