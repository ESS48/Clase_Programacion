/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Objects;

/**
 *
 * @author damt119
 */
public abstract class ProductoCultural implements Comparable<ProductoCultural>{
    
    private String titulo;
    private double precio;

    public ProductoCultural(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoCultural: " + "titulo: " + titulo + ", precio: " + precio;
    }
// esto sirve para que no tenga problemas el titulo con las mayusculas y minusculas.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoCultural other = (ProductoCultural) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
}
