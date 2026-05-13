/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author damt119
 */
public class Libro extends ProductoCultural{
    private String autor;
    private int numPaginas;

    public Libro(String titulo, double precio,String autor, int numPaginas) {
        super(titulo, precio);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
// esto me sirve para comparar con el titulo.
    @Override
    public int compareTo(ProductoCultural otro) {
        return this.autor.compareToIgnoreCase(otro.getTitulo());
    }

    @Override
    public String toString() {
        return "Libro: " + super.toString() +"autor: " + autor + ", numPaginas: " + numPaginas;
    }
    
    
    
}
