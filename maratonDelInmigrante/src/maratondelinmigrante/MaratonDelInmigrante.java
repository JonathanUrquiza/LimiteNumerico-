package maratondelinmigrante;

import java.util.Scanner;

public class MaratonDelInmigrante {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        
        System.out.println("Ingrese el documento del candidato.");
        String documento = teclado.nextLine();

        System.out.println("Ingrese el nombre de la persona,");
        String nombre = teclado2.nextLine();        

        System.out.print("Ingrese la edad del candidato");
        int edad = teclado.nextInt();

        while (!documento.equals("0") || !nombre.equalsIgnoreCase("fin")) {
            
        }
            



    }
    
}
