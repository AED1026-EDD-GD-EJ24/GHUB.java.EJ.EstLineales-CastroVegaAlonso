package miPrincipal;

public class DemoDelimitadores {
    public static void menu(){
        System.out.println("******************");
        System.out.println("    DEMO STACK");
        System.out.println("******************\n");
        Delimitadores objDel = new Delimitadores();
        String expr = "(a+b)/2";
        if(objDel.evaluacion(expr))
            System.out.println("La expresion correcta");
        else
            System.out.println("La expresion no es correcta");
    }
}