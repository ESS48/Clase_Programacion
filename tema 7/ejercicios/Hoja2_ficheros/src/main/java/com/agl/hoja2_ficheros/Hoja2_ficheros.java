/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.hoja2_ficheros;


/**
 *
 * @author damt119
 */
public class Hoja2_ficheros {
    static String nombre_fichero = "personas.txt";

    public static void main(String[] args) {
        
       GestorPersonas gp = new GestorPersonas();
        
        gp.leer();
        
        gp.validacion();
        
        gp.imprimir();
    }

    

    
}
