package programavector;

import java.util.Scanner;

public class ProgramaVector {

    public static void main(String[] args) {
        String vector [] = new String [8];
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < vector.length;i++){
            System.out.println("Ingrese un nombre para la posición " + i);
            vector[i] = teclado.nextLine();
        }
        for(int i = 0; i < vector.length; i++) {
            System.out.println("El nombre es " + vector[i] + " y esta en la posicion " + i);
        }
        
    }
}
