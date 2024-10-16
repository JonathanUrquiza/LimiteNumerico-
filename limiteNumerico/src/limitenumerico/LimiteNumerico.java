package limitenumerico;

import java.util.Scanner;

public class LimiteNumerico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;
        int contador =0;
        System.out.println("Ingrese el limite hasta el que quiere contar:");
        limite = teclado.nextInt();
        
        for(int i = 0; i <=limite; i++){
            System.out.println(i);
        }
        while(contador <= limite){
            System.out.println(contador);
            contador++;
        }
        
        
    }
    
}
