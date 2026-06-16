/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.agl.hoja2_jdbc_videojuegos;

/**
 *
 * @author damt119
 */
public class Hoja2_JDBC_Videojuegos {

    public static void main(String[] args) {
        
        VideojuegoDAO v = new VideojuegoDAO();
        
        Videojuego juego=v.buscarPorId(3);
        
        System.out.println(juego);
        
        
        //boolean insertar = v.insertar(new Videojuego("Fire Emblem","Switch",49.99,3));
        //System.out.println(b);
        
        boolean actualizar=v.actualizar(new Videojuego(2,"Legue of legends","PC",0,0));
        System.out.println(actualizar);
        
        //boolean eliminar = v.eliminar(11);
        //System.out.println(eliminar);
    }
}
