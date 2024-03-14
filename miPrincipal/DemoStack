package miPrincipal;
import java.util.*;

public class DemoStack
{
    public static void Menu() 
    {
        System.out.println("******************");
        System.out.println("    DEMO STACK");
        System.out.println("******************\n");
        Stack<Integer> pila = new Stack<Integer>();

        //Aplilar elementos
        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(10);

        //Consultar la posicion del elemento
        System.out.println("Posicion del elemento 2: " + pila.search(2));
        System.out.println("Posicion del elemento 5: " + pila.search(5));
        System.out.println("Posicion del elemento 7: " + pila.search(7));
        System.out.println("Posicion del elemento 10: " + pila.search(10));
        System.out.println("Posicion del elemento 3: " + pila.search(3));
        System.out.println();

        //Consultar el elemento de la cima
        System.out.println("El elemento del tope es: " + pila.peek());

        //Desapilamos
        pila.pop();

        System.out.println("El elemento del tope es: " + pila.peek());

        pila.pop();
        System.out.println("El elemento del tope es: " + pila.peek());

        pila.pop();
        System.out.println("El elemento del tope es: " + pila.peek());
    }
}