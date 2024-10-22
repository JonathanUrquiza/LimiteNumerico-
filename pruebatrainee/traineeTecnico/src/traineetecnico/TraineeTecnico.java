package traineetecnico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import traineetecnico.logica.tiket.Ticket;

public class TraineeTecnico {

    public static void main(String[] args) {
        
        //estructura de datos
        List <Ticket> listaTickets = new ArrayList<Ticket>();

        //creo los tickets
        
                
        Ticket ticket1= new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(12, 2, 4, 1500, new Date(), new Date());

        //Creación de tickets mediante contstructor vacio encapsulamiento
        Ticket ticket3 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        ticket3.setNumero(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(2300);
        ticket3.setFechaCombra(new Date());
        ticket3.setFechaDeValidez(new Date());

        //arego elem,entos a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        //suma de precios
        
        double suma = 0;
        
        for (Ticket tick : listaTickets){
            suma = suma + tick.getPrecio();
        }
        System.out.println("La suma de precios es de: " + suma);
        
        //Pedir fila al usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la fija de la que desea ver el ticket");
        int fila = teclado.nextInt();
        
        Boolean bandera = false;
        
        for (Ticket tick : listaTickets){
            if(tick.getFila() == fila){
                System.out.println(tick.toString());
                bandera = true;
            }
        }
        if (bandera == false){
            System.out.println("No se encontraron datos de la fila.");
        }
    
    }

}
