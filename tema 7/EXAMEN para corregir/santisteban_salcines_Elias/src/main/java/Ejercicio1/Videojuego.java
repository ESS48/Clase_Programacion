/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author damt119
 */
public class Videojuego extends ProductoCultural{
    
    private String plataforma;
    private int edadRecomendada;

    public Videojuego(String titulo, double precio,String plataforma, int edadRecomendada) {
        super(titulo, precio);
        this.plataforma = plataforma;
        this.edadRecomendada = edadRecomendada;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
    
    @Override
    public int compareTo(ProductoCultural otro) {
        return this.plataforma.compareToIgnoreCase(otro.getTitulo());
    }

    
    @Override
    public String toString() {
        return "Videojuego: " + super.toString() +"plataforma: " + plataforma + ", edadRecomendada: " + edadRecomendada;
    }
    
    
    
}
