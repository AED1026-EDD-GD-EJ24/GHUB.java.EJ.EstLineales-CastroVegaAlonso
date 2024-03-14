package miPrincipal;

public class Pila<T>
{
    //Atributo cabeza apunta al tope de la pila
    private Nodo<T> cabeza;
    private int tamanio;

    public Pila()
    {
        cabeza = null;
        tamanio = 0;
    }

    public int getTamanio()
    {
        return tamanio;
    }

    public boolean esVacia()
    {
        return (cabeza == null);
    }

    public void apilar(T valor)
    {
        Nodo<T> nuevo = new Nodo<T>();

        //Fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if (esVacia())
        {
            //Cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }
        else
        {
            //Se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);

            //La nueva cabeza de a pila pasa a ser nuevo
            cabeza = nuevo;
        }

        //Incrementar el tamaño porque hay un nuevo en la pila
        tamanio++;
    }

    public void retirar()
    {
        if (!esVacia())
        {
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }

    public T cima()
    {
        if(!esVacia())
        {
            return cabeza.getValor();
        }
        else
        {
            return null;
        }
    }
    
}