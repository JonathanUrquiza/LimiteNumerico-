package pruebatraineeuno;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mapa[][] = new String[10][10];
        int libres = 0;
        int ocupados = 0;

        for (int fila = 0; fila < 10; fila++) {
            for (int asiento = 0; asiento < 10; asiento++) {

                mapa[fila][asiento] = "L";
            }
        }


        for (int fila = 0; fila < 10; fila++) {
            for (int asientos = 0; asientos < 10; asientos++) {
                System.out.print(mapa[fila][asientos]);
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < 10; i++) {
            for (int c = 0; c < 10; c++) {
                if (mapa[i][c] == "L") {
                    libres = libres + 1;
                } else {
                    if (mapa[i][c] == "X") {
                        ocupados = ocupados + 1;
                    }
                }
            }
        }
        System.out.println("Hay " + libres + " asientos libre y hay " + ocupados + " ocupados.");
    }

}
