package miPrincipal;
import java.util.ArrayList;

public class ArrayListExamen {
    public static void menu(){
        System.out.println("************************");
        System.out.println("       ARRAYLIST        ");
        System.out.println("       EXMANEN         ");
        System.out.println("************************");
        System.out.println();

        ArrayList<Contacto> listaContactos = new ArrayList<>();

        // Agregar 3 objetos de la clase Contacto
        listaContactos.add(new Contacto("Jaime", "Castro", "avenida los sauces", "correo1@example.com", "134621346", "37345347"));
        listaContactos.add(new Contacto("Cristian", "acosta", "los helechos", "correo2@example.com", "96795646", "134613472"));
        listaContactos.add(new Contacto("Luis", "cazares", "los pinos", "correo3@example.com", "567890426", "3136845684"));

        // Agregar un nuevo Contacto en la posición 1
        listaContactos.add(0, new Contacto("Ramon", "Lopez", "finca del señor", "nuevoCorreo@example.com", "26836838", "9356737"));

        // Agregar un nuevo Contacto en la posición 2
        listaContactos.add(1, new Contacto("Saul", "Jimenez", "Santafe", "nuevoCorreo2@example.com", "634563456", "74567325"));


        
        for (Contacto contacto : listaContactos) {
            System.out.println("Nombre: " + contacto.getNombres());
            System.out.println("Apellido: " + contacto.getApellidos());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Correo: " + contacto.getCorreo());
            System.out.println("Teléfono: " + contacto.getTelefono());
            System.out.println("Celular: " + contacto.getCelular());
            System.out.println();
        }

        // Eliminar el ultimo contacto
        listaContactos.remove(listaContactos.size() - 1);

        
        for (Contacto contacto : listaContactos) {
            System.out.println("Nombre: " + contacto.getNombres());
            System.out.println("Apellido: " + contacto.getApellidos());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Correo: " + contacto.getCorreo());
            System.out.println("Teléfono: " + contacto.getTelefono());
            System.out.println("Celular: " + contacto.getCelular());
            System.out.println();
        }
    }
}