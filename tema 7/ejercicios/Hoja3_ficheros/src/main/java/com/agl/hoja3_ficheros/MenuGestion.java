/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja3_ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt119
 */
public class MenuGestion {

    static String nombre_fichero = "palabras.txt";

    private ArrayList<String> menu;

    public MenuGestion() {

        this.menu = new ArrayList<>();

    }

    public void cargar() {

        try {
            FileReader fr = new FileReader(nombre_fichero);
            BufferedReader br = new BufferedReader(fr);

            String lineas = br.readLine();

            while (lineas != null) {

            }

        } catch (FileNotFoundException ex) {
            System.out.println("");
        } catch (IOException ex) {
            Logger.getLogger(MenuGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void aniadir() {

    }

    public void borrar() {

    }

    public void guardar() {

    }
}
