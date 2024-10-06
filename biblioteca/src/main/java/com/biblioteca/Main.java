package com.biblioteca;

import autor.Autor;
import cliente.Cliente;
import editorial.Editorial;
import libro.Libro;
import prestamo.Prestamo;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor1 = new Autor();
        Editorial editorial1 = new Editorial();
        Cliente cliente1 = new Cliente();
        Prestamo prestamo1 = new Prestamo();

        Date fechaActual = new Date();

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaActual);
        calendario.add(Calendar.DAY_OF_YEAR, 15);
        Date fechaDevolucion = calendario.getTime();





        libro1.setTitulo("La vuelta al mundo en 80 días");
        libro1.setIsbn("123");
        libro1.setAnioPublicacion(1985);
        libro1.setGenero("Aventura");
        libro1.setAutor(autor1);
        libro1.setEditorial(editorial1);

        autor1.setNombre("Julio Verne");
        autor1.setNacionalidad("Francia");

        editorial1.setNombre("Random editiones");
        editorial1.setDireccion("calle 33 Medellín");

        cliente1.setNombre("Miguel Anjel");
        cliente1.setNumeroTelefono("1234");
        cliente1.setDireccion("calle 104 Medellín");
        cliente1.setEdad(20);
        cliente1.setEmail("miguel@gmail.com");

        prestamo1.setLibro(libro1);
        prestamo1.setCliente(cliente1);
        prestamo1.setFechaPrestamo(fechaActual);
        prestamo1.setFechaDevolucion(fechaDevolucion);

        System.out.println("Datos del prestamo: ");
        System.out.println("Libro: " + libro1.getTitulo() + " Autor: " + autor1.getNombre() + " Editorial: " + editorial1.getNombre() + " Cliente: " + cliente1.getNombre() + " Fecha de devolución: " + prestamo1.getFechaDevolucion());


        

    }
}