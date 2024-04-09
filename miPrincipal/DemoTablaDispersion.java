package miPrincipal;
import java.util.Hashtable;
import java.util.Enumeration;

public class DemoTablaDispersion {
    public static void menu(){
        System.out.println("************************");
        System.out.println("  TABLA DE DISPERSIÓN  ");
        System.out.println("************************");
        System.out.println();
        //Instanciamos varias personas
        Persona p1 = new Persona("Pablo", 23, "Argentino");
        Persona p2 = new Persona("Juan", 25, "Mexicano");
        Persona p3 = new Persona("Pedro", 22, "Colombiana");
        //Creo la tabla Hash
        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        //Agregamos a las personas tomando su nombre clave
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);
        //Obtenemos el valor asociado a la clave
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));
        //En este caso no existe la clave Rolando devuelve null
        System.out.println(tabla.get("Rolando"));

        /*  
         * Obtengo una enumeracion de las claves existentes en la tabla
         * se recorre y por cada una se accede al elemento asociado para
         * mostrar "clave-valor"
         */

         String aux;
         Enumeration<String> keys = tabla.keys();
         
         while (keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux + " * " + tabla.get(aux));
         }
    }
}