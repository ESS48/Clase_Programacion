/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja3_ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
                menu.add(lineas);
                lineas = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo");
        }
    }

    public void aniadir() {
        try {
            Scanner sc = new Scanner(System.in);
            String palabra;

            FileReader fr = new FileReader(nombre_fichero);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(nombre_fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Dime una palabra: ");
            palabra = sc.nextLine();

            String lineas = br.readLine();

            while (lineas != null) {
                if (lineas.equalsIgnoreCase(palabra)) {
                    System.out.println("Se pudo añadir la palabra.");
                    menu.add(palabra);
                } else {
                    System.out.println("La palabra esta repetida.");
                }

                lineas = br.readLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("");
        } catch (IOException ex) {
            System.out.println("");
        }

    }

    public void borrar() {

        try {
            Scanner sc = new Scanner(System.in);
            String palabra;

            FileReader fr = new FileReader(nombre_fichero);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(nombre_fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Que palabra quieres borrar");
            palabra = sc.nextLine();

            String linea = br.readLine();

            while (linea != null) {
                if (menu.contains(palabra)) {
                    menu.remove(palabra);
                    System.out.println("palabra eliminada");
                } else {
                    System.out.println("Palabra no eliminada");
                }
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo");
        }
    }

    public void guardar() {
        try {
            FileWriter fw = new FileWriter(nombre_fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (String p: menu) {
               bw.write(p);
               bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo");
        }
    }
}
