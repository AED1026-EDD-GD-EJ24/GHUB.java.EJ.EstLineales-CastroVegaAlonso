package miPrincipal;

public class DemoListaDeContactos {
    
    public static void menu() throws PosicionIlegalException {
        System.out.println("************************");
        System.out.println("   LISTA DE CONTACTOS   ");
        System.out.println("************************");
        System.err.println();

        ListaDeContactos ldc = new ListaDeContactos();
        ldc.agregarContacto(new Contacto("Fernando", "Castro", "C1 NO12","Fernandocastro@gmail.com","6671607320","6679876540"));
        ldc.agregarContacto(new Contacto("Maria Andrea", "Vargas", "C11 No 705 Culiacan","maria@gmail.com", "6677125029", "6677183209"));
        ldc.agregarContactos(new Contacto("Carolina", "Sanchez", ",", "carolinash@gmail.com", "6671212120", "6678043452"));
        ldc.agregarContacto(new Contacto("Federica", "Cardenas", "," , "fede@gmail.com", "6670971530", "6679491061"));

        Lista<Contacto> conlistadotactos = ldc.mostrarTodosLosContactos();
        System.out.println("--- Listado despues de la agregacion ---");
        for(int i=0;i<conlistadotactos.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        if (ldc.eliminaContacto("Fernando", "Castro")) {
            System.out.println("Se elimino el contacto");
        }

        listado = ldc.mostrarTodosLosContactos();
        System.out.println("--- Listado despues de la eliminacion ---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        ldc.modificarContacto("Federica", "Cardenas", "Laguna de viezca 705 Culiacan", "fede@gmail.com", "6670971530", "6679491061");
    
    }

}