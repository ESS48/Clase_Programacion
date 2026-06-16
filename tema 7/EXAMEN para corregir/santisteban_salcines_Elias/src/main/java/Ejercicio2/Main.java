/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author damt119
 */
public class Main {
    public static void main(String[] args) {
    
        Catalogo c = new Catalogo();
        
        c.cargar();
        
        c.listarProductos();
        
        c.aniadirProductos("Pokemon");
        c.ordenarProductos();
        
        c.listarProductos();
        c.contar();
    
        c.guardar();
    }
}
