/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja2_ficheros;

import static com.agl.hoja2_ficheros.Hoja2_ficheros.nombre_fichero;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author damt119
 */
public class GestorPersonas {

    private ArrayList<Persona> gestion;

    public GestorPersonas() {

        this.gestion = new ArrayList<>();

    }

    public void imprimir() {

        for (Persona p : gestion) {
            System.out.println("Lista: " + p);
        }
    }

    public void leer() {

        try {
            FileReader fr = new FileReader(nombre_fichero);
            BufferedReader bw = new BufferedReader(fr);

            String lineas = bw.readLine();

            while (lineas != null) {
                String[] partes = lineas.split(";");
                String nombre = partes[0].trim();
                String edad = partes[1].trim();
                String ciudad = partes[2].trim();

                gestion.add(new Persona(nombre, edad, ciudad));
                lineas = bw.readLine();

            }

            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("");
        }

    }

    public void validacion() {

        try {
            FileReader fr = new FileReader(nombre_fichero);
            BufferedReader bw = new BufferedReader(fr);
            String lineas = bw.readLine();
            String[] partes = lineas.split(";");

            if (partes.length != 3) {
                lineas = bw.readLine();
            }
            String nombre = partes[0].trim();
            String edad = partes[1].trim();
            String ciudad = partes[2].trim();

            try {
                int edadd;
                edadd = Integer.parseInt(edad);
                
            } catch (NumberFormatException e){
                lineas = bw.readLine();
            }
            
            
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("");
        }
    }
}
