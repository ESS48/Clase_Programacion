/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.herencia_hoja2;


/**
 *
 * @author damt119
 */
public class Libro extends Publicacion {

    
    private int numPaginas;

    public Libro(String titulo, String autor,int numPaginas, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    @Override
    public String toString() {
        return "Libros: " + "titulo: " + getTitulo() + ", autor: " + getAutor() + ", fecha: " + getFecha() + " NumeroPaginas: "+this.numPaginas;
    }
    
}
