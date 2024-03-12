package miPrincipal;

public class Pila<T> {
    
    private Nodo<T> cabeza;
    private int tamanio;
    //constructor por defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //devuelve el total de elementos de la pila
    public getTamanio(){
        return tamanio;
    }
    //verifica si la pila esta vacia
    public boolean esVacia(){
        return (cabeza == null);
    }
    //agregar un elemento a la pila   
    public void apilar(T valor){
        //creamos un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro de nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            //cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //incrementamos el tamanio de la pila por que hay un nuevo elemento
        tamanio++;
    }
    //eliminar un elemento de la pila
    public void retirar(){
        if (!esVacia()) {
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //devuelve el elemento almacenado en el tope de la pila

    public T cima(){
        if (!esVacia()) {
            return cabeza.getValor();
        }else{
            return null;
        }
    }


}