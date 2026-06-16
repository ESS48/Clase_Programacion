/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja3_swing;

/**
 *
 * @author damt119
 */
public class VideoJuego {

    private String titulo;
    private String plataforma;
    private int stock;
    private double precio;

    public VideoJuego(String titulo, String plataforma, int stock, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.stock = stock;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "titulo=" + titulo + ", plataforma=" + plataforma + ", stock=" + stock + ", precio=" + precio + '}';
    }

    
}
