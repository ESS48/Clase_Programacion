/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.hoja3_ficheros;

import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Hoja3_ficheros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        MenuGestion mg = new MenuGestion();
        
        System.out.println("--Menu Gestion--\n");
        System.out.println("1.-Cargar");
        System.out.println("2.-Añadir");
        System.out.println("3.-Borrar");
        System.out.println("4.-Guardar");
        System.out.println("0.-Salir");
        opcion = sc.nextInt();

        do {
            switch (opcion) {
                case 1:
                    mg.cargar();
                    break;
                case 2:
                    mg.aniadir();
                    break;
                case 3:
                    mg.borrar();
                    break;
                case 4:
                    mg.guardar();
                    break;
                case 0:
                    System.out.println("Saliste del programa.");
                    break;

                default:
                    System.out.println("Opcion no  valida");

            }
        } while (opcion != 0);
    }
}
