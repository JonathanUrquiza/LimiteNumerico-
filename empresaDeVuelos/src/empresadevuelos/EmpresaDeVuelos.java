package empresadevuelos;

import java.util.Scanner;

public class EmpresaDeVuelos {

    public static void main(String[] args) {
        int vuelos[][] = new int[6][3];
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el N° de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = teclado.nextInt();

            if (destino >= 5 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {

                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }
                    System.out.println("Desea continuar reservando? ingrese finish para terminar");
                    bandera = teclado2.nextLine();

                }
            }
        }

    }

}
