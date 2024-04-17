package miPrincipal;

import java.util.List;
import java.util.LinkedList;
import java.util.random;
import cuadrupedo.Cuadrupedo;

public class DemoLinkedListCuadrupedos {
    public static void menu(){
        System.out.println("************************");
        System.out.println("       ARRAYLIST        ");
        System.out.println("       LINKEDLIST       ");
        System.out.println("************************");
        System.out.println();
        try{
            List<Cuadrupedo> cuadrupedos = new LinkedList<>();
            String [] nombres = {"Leon", "Gato", "Perro", "Elefante"};
            Random random = new Random();
            for (int i = 1; i <= 10000; i++){
                String tipo = tipos[random.nextInt(tipos.length)];
                cuadrupedos.add(new Cuadrupedo(i, tipo));
            }

            int leonCount = 0, gatoCount = 0, perroCount = 0, elefanteCount = 0;
            for (Cuadrupedo cuadrupedo : cuadrupedos){
                switch (cuadrupedo.getTipo()){
                    case "Leon":
                        leonCount++;
                        break;
                    case "Gato":
                        gatoCount++;
                        break;
                    case "Perro":
                        perroCount++;
                        break;
                    case "Elefante":
                        elefanteCount++;
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}