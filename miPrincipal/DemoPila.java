package miPrincipal;

public class DemoPila{
    public static void main(String[]args){
        //crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer>();
        //apilar algunos datos enteros
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tope de la pila es " + pila.cima());
        //Se desapila
        pila.retirar();
        System.out.println("El tope de la pila es " + pila.cima());
        //Se desapila
        pila.retirar();
        System.out.println("El tope de la pila es " + pila.cima());
        //Se desapila
        pila.retirar();

    }
}