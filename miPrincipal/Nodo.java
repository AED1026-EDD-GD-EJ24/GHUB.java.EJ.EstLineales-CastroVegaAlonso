package miPrincipal;
public class Nodo<T>{

    //Atributo valor de tipo T. Almacena la referencia al objeto que se guarda en el nodo.
    private T valor;
    //Atributo siguiente de tipo Nodo<T>. Almacena la referencia al siguiente nodo.
    private Nodo<T> siguiente;
    //constructor por defecto
    public nodo(){
        valor = null;
        siguiente = null;
    }
    //develve el valor
    public t getValor(){
        return valor;
    }
    //modifica el valor
    public void setValor(T valor){
        this.valor = valor;
    }
    devuelve el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}
