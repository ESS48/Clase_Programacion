/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.agl.ejemplocomposicion;

/**
 *
 * @author damt119
 */
public class EjemploComposicion {

    public static void main(String[] args) {
        
        DNI dni=new DNI("12234",'a');
        
        System.out.println(dni.getNumero());
        
        Persona p1=new Persona("Nombre","1234554",'F');
        
        p1.mostrarPersona();
        
        
        Persona p2=new Persona("Yahir",dni);
        
        p2.mostrarPersona();
    }
}
