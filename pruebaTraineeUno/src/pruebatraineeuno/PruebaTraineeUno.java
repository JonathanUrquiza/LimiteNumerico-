package pruebatraineeuno;

import java.util.Scanner;
import javax.swing.JComboBox;

/**
 * Primera parte: Suponer un sistema de reserva de asientos para un anfiteatro,
 * el teatro cuenta con 10 filas y 10 asientos cada una, Se necesita desarrollar
 * un sistema (sin uso de base de datos, únicamente nabejo de datos de forma
 * lógica) que permita llevar a cabo lo siguiente.
 *
 * 1- cargar el mapa de las gilas y los asientos. inicando con una X los
 * asientos ocupados y con una L los asientos libres, al iniciar el programa los
 * asientos deben estar libres.
 *
 * 2- Manejar la reserva de asientos contemplando que asiento solo puede ser
 * reservaedo si se encuentra en estado L. En caso de que este en X se deberá
 * permitir al comprador elegir otro asiento, si se enciuentra en estado L
 * debera pasar automáticamente a estado X.
 *
 * 3- Para finalizar el programa debera ingresar un valor particular,
 * contemplando que no existen una cantidad exacta de veces que el programa se
 * pueda ejecutar.
 *
 * 4- contemplar que solo exiten 10 fias y 10 columnas, no se pueden cender
 * asientos afuera de esas numeraciones, no esta permitida la sobre venta.
 */
public class PruebaTraineeUno {

    public static void main(String[] args) {
        String asientos[][] = new String[10][10];
        //Declaración de variables
        int libres = 0;
        int ocupados = 0;
        String respuesta;
        int fila = 0, asiento = 0;
        String verMapa;
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        //bienvenida al sistema
        System.out.println("Bienvenido al sistema de reservas");
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = "O";
                }
            }
        while (bandera != true) {
            //Visualización 
            System.out.println("¿Desea ver los asientos disponibles?");
            verMapa = teclado.next();

            if (verMapa.equalsIgnoreCase("S")) {
                dibujarMapa(asientos);
            }

            //Reserva
            boolean centinel = false;
            while (centinel != true) {
                
                System.out.println("Ingrese fila y asiento");
                System.out.print("fila(entre  0 y 9)");
                fila = teclado.nextInt();

                System.out.print("asiento(entre  0 y 9)");
                asiento = teclado.nextInt();
                if (fila <= 9 && fila>=0) {
                    if (asiento <=9 && asiento >= 0){
                        centinel = true;
                    } else{
                        System.out.println("En número de asiento no es válido.");
                    }
                } else {
                    System.out.println("El número de fija no es válido.");
                }
            }

            if (asientos[fila][asiento].equals("O")) {
                asientos[fila][asiento] = "X";
                System.out.println("El asiento fue reservado correctamentre");
            } else {
                System.out.println("El asiento está ocupado, por favor elija otra posición");
            }
            System.out.println("¿Desea finalizar la reserva?\n Ingrese S:Si, para continuar \n Cualquier otra letra:No");
            respuesta = teclado2.next();
            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            } else {
                bandera = false;
            }
        }
        dibujarMapa(asientos);
       

    }

    static void dibujarMapa(String asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + " ");
            for (int c = 0; c < 10; c++) {
                System.out.print(" [" + asientos[f][c] + "] ");
            }
            System.out.print("\n");
        }
    }



    static void iniciaMapa(String asientos[][]) {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = "L";
                System.out.print(" [" + asientos[f][c] + "] ");
            }
            System.out.print("\n");
        }
    }
}
