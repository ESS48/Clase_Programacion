/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author damt119
 */
public class Disco extends Publicacion {

    private int duracion;

    public Disco(String titulo, String autor, int duracion, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco: " + super.toString() + "duracion: " + duracion;
    }

}
