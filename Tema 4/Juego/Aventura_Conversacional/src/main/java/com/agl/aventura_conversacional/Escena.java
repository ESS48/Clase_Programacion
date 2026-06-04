/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;


/**
 *
 * @author damt119
 */
public class Escena {
    private String nombre;
    private String descripcion;
    private Enemigo enemigo;
    private String visitada;
    private String rutaImagen;

    public Escena(String nombre, String descripcion, Enemigo enemigo, String visitada, String rutaImagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enemigo = enemigo;
        this.visitada = visitada;
        this.rutaImagen = rutaImagen;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public String getVisitada() {
        return visitada;
    }

    public void setVisitada(String visitada) {
        this.visitada = visitada;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    public String toString() {
        return "Escena{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", enemigo=" + enemigo + ", visitada=" + visitada + ", rutaImagen=" + rutaImagen + '}';
    }
    
    
    public void escena1(){
    
        
        
    }
    
    
    public void escena2(){
    
    }
    
    
    public void escena3(){
    
    
    }
    
    
    public void escena4(){
    
    }
    
    
}
