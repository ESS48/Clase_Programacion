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
public class Discos extends Publicacion{

    private int duracionMinutos;

    public Discos(String titulo, String autor, int duracionMinutos, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    @Override
    public String toString() {
        return "Discos:" + "titulo: " + getTitulo() + ", autor: " + getAutor() + ", fecha: " + getFecha() + " Duracion: "+this.duracionMinutos;
    }
}
