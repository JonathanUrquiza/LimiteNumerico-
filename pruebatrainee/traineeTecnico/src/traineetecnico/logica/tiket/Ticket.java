package traineetecnico.logica.tiket;

import java.util.Date;


public class Ticket {
 private int numero;
private int fila;
private int asiento;
private double precio;
private Date fechaCombra;
private Date fechaDeValidez;
private Cliente cli;

 

    public Ticket(int par, int par1, int par2, int par3, Date date, Date date1) {
    }

    public Ticket(int numero, int fila, int asiento, double precio, Date fechaCombra, Date fechaDeValidez, Cliente cli) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCombra = fechaCombra;
        this.fechaDeValidez = fechaDeValidez;
        this.cli = cli;
    }

 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCombra() {
        return fechaCombra;
    }

    public void setFechaCombra(Date fechaCombra) {
        this.fechaCombra = fechaCombra;
    }

    public Date getFechaDeValidez() {
        return fechaDeValidez;
    }

    public void setFechaDeValidez(Date fechaDeValidez) {
        this.fechaDeValidez = fechaDeValidez;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fechaCombra=" + fechaCombra + ", fechaDeValidez=" + fechaDeValidez + ", cli=" + cli + '}';
    }
    
    

    

}
