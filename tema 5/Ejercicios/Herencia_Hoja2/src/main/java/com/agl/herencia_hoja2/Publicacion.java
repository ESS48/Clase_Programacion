/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.herencia_hoja2;

import java.time.LocalDate;

/**
 *
 * @author damt119
 */
public class Publicacion {

    private String titulo;
    private String autor;
    private LocalDate fecha;

    public Publicacion(String titulo, String autor, LocalDate fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }
    
    
    public Publicacion(String titulo, String autor, int dia, int mes, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(anio, mes, dia);
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }

}
