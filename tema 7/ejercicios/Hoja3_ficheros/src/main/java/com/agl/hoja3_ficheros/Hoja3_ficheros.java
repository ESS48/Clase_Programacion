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

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:

                    break;

                default:
                    System.out.println("Opcion no  valida");

            }
        } while (opcion != 0);
    }
}
