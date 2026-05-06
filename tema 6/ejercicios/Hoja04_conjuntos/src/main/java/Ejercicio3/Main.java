/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author damt119
 */
public class Main {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("A1", "Queso", 7);
        Articulo a2 = new Articulo("A2", "Tomate frito", 5);
        Articulo a3 = new Articulo("A2", "Tomate casero", 6);
        Articulo a4 = new Articulo("A3", "Cebolla", 2);
        Articulo a5 = new Articulo("A4", "Patatas", 3);
        Articulo a6 = new Articulo("A5", "Pimientos", 1);

        Almacen al1 = new Almacen();
        
        al1.insertar(a1);
        al1.insertar(a2);
        al1.insertar(a3);
        al1.insertar(a4);
        al1.insertar(a5);
        al1.insertar(a6);
        
        System.out.println("\nBusqueda por codigo");
        Articulo a=al1.buscar("a5");
        System.out.println(a);
        
        System.out.println("\nMostrar todos los articulos");
        al1.mostrarArticulos();
        
        
        System.out.println("\nMostrar el resultado con el metodo pedidos");
        al1.pedidos();
    }

}
