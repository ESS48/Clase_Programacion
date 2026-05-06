/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author damt119
 */
public final class Libro extends Publicacion {

    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro: " + super.toString() + "numeroPaginas: " + numeroPaginas;
    }

}
