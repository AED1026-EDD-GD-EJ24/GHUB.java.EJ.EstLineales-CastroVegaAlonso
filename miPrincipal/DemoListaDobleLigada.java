package miPrincipal;

import listaDoble.ListaDoblementeEnlazada;

public class DemoListaDobleLigada {
    public static void menu() {
        System.out.println("************************");
        System.out.println("   LISTA DOBLE LIGADA   ");
        System.out.println("************************");
        System.err.println();
        ListaDoblementeEnlazadaz<Integer> lde = new ListaDoblementeEnlazada<Integer>();
        listaDoble.agregar(30);
        listaDoble.agregar(40);
        listaDoble.agregar(10);
        System.out.println("Mostrar elementos agregados");
        System.out.println("Elemento 0: " + listaDoble.getValor(0));
        System.out.println("Elemento 1: " + listaDoble.getValor(1));
        System.out.println("Elemento 2: " + listaDoble.getValor(2));
        for(int i=0; i<listaDoble.getTamanio(); i++){
            System.out.println("Elemento: "+ i + " " +listaDoble.getValor(i));
        }


    }
}