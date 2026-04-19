/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.herencia_hoja2;

import java.time.LocalDate;

/**
 *
 * @author damt119
 */
public class Herencia_Hoja2 {

    public static void main(String[] args) {

        Publicacion[] publicaciones = new Publicacion[6];

        publicaciones[0] = new Libro("La magia del orden", "Marie Kondo", 480, 24, 6, 2026);
        publicaciones[1] = new Discos("Lux", "Rosalia", 4, 18, 9, 2025);
        publicaciones[2] = new Libro("Alas de onix", "Rebecca Yarros", 1300, 15, 10, 2018);
        publicaciones[3] = new Discos("Abracadabra", "Ladygaga", 5, 18, 9, 2025);
        publicaciones[4] = new Libro("Amanecer en la cosecha", "Suzanne collins", 1200, 20, 12, 2016);
        publicaciones[5] = new Discos("The romantic", "Bruno Mars", 2, 19, 4, 2020);

        System.out.println("\nApartado 1\n");

        for (Publicacion publi : publicaciones) {
            System.out.println(publi);
        }

        System.out.println("\nApartado 2\n");

        Discos mayorDuracion = null;
        int maxDuracion = 0;

        for (Publicacion publi : publicaciones) {
            if (publi instanceof Discos) {
                // esto sirve para poder usar los metodos de discos
                Discos d1 = (Discos) publi;

                if (d1.getDuracionMinutos() > maxDuracion) {
                    //sirve para poder actualizar el disco con mayor duracion.
                    maxDuracion = d1.getDuracionMinutos();
                    //esto guarda el disco con mayor duracion.
                    mayorDuracion = d1;

                }
            }
        }
        if (mayorDuracion != null) {
            System.out.println(mayorDuracion.getTitulo().substring(0, 3));
            System.out.println(mayorDuracion.getAutor().substring(0, 3));
            System.out.println(mayorDuracion);
        }

        System.out.println("\nApartado 3\n");

         LocalDate fechaHoy = LocalDate.now();
         int mesActual=fechaHoy.getMonthValue();
        int paginas = 1000;
        for (Publicacion publi : publicaciones) {

            if (publi instanceof Libro) {
                Libro l1 = (Libro) publi;
                
                if (l1.getNumPaginas() > paginas && l1.getFecha().getMonthValue() == mesActual) {

                    System.out.println(l1.getTitulo() + " | " + l1.getAutor());
                }

            }
        }

        System.out.println("\nApartado 4\n");

        
        for (Publicacion publi : publicaciones) {

            if (publi instanceof Discos) {
                Discos d2 = (Discos) publi;
                
            }
        }

    }
}
