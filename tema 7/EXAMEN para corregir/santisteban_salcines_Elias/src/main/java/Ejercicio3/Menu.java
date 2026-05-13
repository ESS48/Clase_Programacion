/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import Ejercicio2.Catalogo;
import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalogo c1 = new Catalogo();
        int opcion = 0;
        boolean correcto = true;
        do {

            try {
                correcto = true;
                System.out.println("--Menu--");
                System.out.println("1.-Añadir Libro");
                System.out.println("2.-Añadir videojuego");
                System.out.println("3.-Listar Productos");
                System.out.println("4.-Guardar catalogo en fichero serializado");
                System.out.println("5.-Cargar catálogo desde fichero serializado");
                System.out.println("6.-Salir");
                System.out.println("\nDame una opcion: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        c1.aniadirProductos("libro");
                        break;
                    case 2:
                        c1.aniadirProductos("juego");
                        break;
                    case 3:
                        c1.listarProductos();
                        break;
                    case 4:
                        c1.GuardarColeccion();
                        break;
                    case 5:
                        c1.cargarColeccion();
                        break;
                    case 6:
                        System.out.println("Has salido");
                        break;
                    default:
                        System.out.println("Error de programa");

                }
            } catch (NumberFormatException e) {
                sc.nextLine();
                System.out.println("Se deben meter numeros");
                correcto = false;
            }
        } while (opcion != 6);
    }
}
