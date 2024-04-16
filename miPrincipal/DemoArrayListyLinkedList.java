package miPrincipal;
import java.util.list;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class DemoArrayListyLinkedList {
    public static void menu() {

        System.out.println("************************");
        System.out.println("          DEMOARRAYLIST         ");
        System.out.println("           LINKEDLIST         ");
        System.out.println("************************");
        System.out.println();

        List<Integer> lista = new LinkedList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();

        lista.add(12);
        lista.add(15);
        lista.add(20);

        Sysout.println("Dato de la posicion 0: " + lista.get(0));
        Sysout.println("Dato de la posicion 1: " + lista.get(1));
        Sysout.println("Dato de la posicion 2: " + lista.get(2));

        lista.add(1,13);
        lista.add(3,16);

        System.out.println("Datos despues de la inserción");
        System.out.println("Dato en la posicion 0: " + lista.get(0));
        System.out.println("Dato en la posicion 1: " + lista.get(1));
        System.out.println("Dato en la posicion 2: " + lista.get(2));
        System.out.println("Dato en la posicion 3: " + lista.get(3));
        System.out.println("Dato en la posicion 4: " + lista.get(4));

        //Lista.add(6,1);error porque no existe la posicion 5 
        }
        // catch(Exception e){
            // e.printStackTrace();
        // }
 
         
    }
        
 //DemoArrayListyLinkedList