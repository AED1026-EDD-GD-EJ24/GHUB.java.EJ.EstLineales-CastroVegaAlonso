package miPrincipal;

public class Delimitadores {
    public boolean evaluacion(string cadena){
        Pila<string> pcaracteres = new Pila<string>();
        int i=0;
        boolean masElementosPorLeer = true;
        while (i<cadena.length() && masElementosPorLeer){
            char car = cadena.charAt(i);
            String s = chartoString(car);
            i++;
            switch(car){
                //en caso de apilar se da cuando el caracter sea un operador de apertura
                //( [ { /* 
                case '(':
                    pcaracteres.apilar(charToString(')'));
                    break;
                case '[':
                    pcaracteres.apilar(charToString(']'));
                    break;
                case '{':
                    pcaracteres.apilar(charToString('}'));
                    break;
                case '/':
                    //si el siguiente caracter es un asterisco, se apila
                    if(siguienteEsAsterisco(cadena, i)){
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                    break;
                //en caso de desapilar se da cuando el caracter sea un operador de cierre
                //) ] } */
                case ')':
                case ']':
                case '}':
                {
                    //comparar que correspondan los operadores de cierre con los de apertura
                    String aux = pcaracteres.cima();
                    if (aux != null){
                        if(s.compareTo(aux)==0){
                            //Hay correspondencia y por lo tanto lo elimino
                            pcaracteres.retirar();
                        }else{
                            //No hay correspondencia
                            masElementosPorLeer = false;
                        }
                        
                    }
                }
                case '*':
                    if(siguienteEsDiagonal(cadena, i)){
                    pcaracteres.retirar();
                    i++;
                    }
                    break;
            }
        }//termina el while
        if (pcaracteres.esVacia() && masElementosPorLeer){
            return true;
        }else{
            return false;
        }
    }//Termina el método evaluación
    private static String charToString(char ch){
        return String.valueOf(ch);
    }

    private static boolean siguienteEsAsterisco(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if(car == '*'){
            return true;
        }else{
            return false;
        }
    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if(car == '/'){
            return true;
        }else{
            return false;
        }
    }

}