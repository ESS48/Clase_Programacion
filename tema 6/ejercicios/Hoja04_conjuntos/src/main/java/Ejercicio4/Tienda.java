/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author damt119
 */
public class Tienda {

    private HashSet<Publicacion> tienda;

    public Tienda() {
        this.tienda = new HashSet<>();
    }

    public void insertarPublicacion(Publicacion p) {

        tienda.add(p);
    }

    public void borrarPublicacion(Publicacion p) {

        tienda.remove(p);

    }

    public String mostrar() {
        String m = "";

        for (int i = 0; i < tienda.size(); i++) {
            m += tienda;
        }
        return m;
    }

    public Disco mayor() {

        Disco mayorDuracion = null;
        int maxDuracion = 0;

        for (Publicacion publi : tienda) { 
            if (publi instanceof Disco) {
                Disco d1 = (Disco) publi;

                if (d1.getDuracion() > maxDuracion) {
                    maxDuracion = d1.getDuracion();
                    mayorDuracion = d1;

                }
            }
        }
        
        return mayorDuracion;
    }

    public List<Libro> novedades() {

       
        
        return null;
    }

}
