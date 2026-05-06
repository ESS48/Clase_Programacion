/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.HashSet;

/**
 *
 * @author damt119
 */
public class Almacen {

    private HashSet<Articulo> productos;

    public Almacen() {
        this.productos = new HashSet<>();
    }

    public void insertar(Articulo p) {

        productos.add(p);

    }

    public Articulo buscar(String c) {

        for (Articulo a : productos) {
            if (a.getCodigo().equalsIgnoreCase(c)) {
                return a;
            }
        }

        return null;

    }

    public void pedidos() {
        for (Articulo a : productos) {
            if (a.getExistencias() < 5) {
                System.out.println(a);
            }
        }
    }

    public void mostrarArticulos() {

        for (Articulo a : productos) {
            System.out.println(a);
        }
    }
}
