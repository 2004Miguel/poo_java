package prestamo;

import libro.Libro;
import cliente.Cliente;

import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Cliente cliente;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    // Constructor
    public Prestamo(Libro libro, Cliente cliente, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}

