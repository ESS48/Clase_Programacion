/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        GestorAlumnos ga = new GestorAlumnos();
        
        do {
            
            System.out.println("--Dime la opcion que necesitas: --");
            System.out.println("1.-Añadir alumnos");
            System.out.println("2.-Listar alumnos");
            System.out.println("3.-Buscar alumno");
            System.out.println("4.-Borrar alumno");
            System.out.println("5.-Guardar alumnos");
            System.out.println("6.-Salir");
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1:
                    ga.cargarAlumnos();
                    break;
                case 2:
                    ga.listarAlumno();
                    break;
                case 3:
                    ga.buscarAlumno("");
                    break;
                case 4:
                    ga.borrarAlumno("");
                    break;
                case 5:
                    ga.guardarAlumnos();
                    break;
                case 6:
                    System.out.println("¡Has Salido Del Programa!");
                    ga.guardarAlumnos();
                    break;
                default:
                    System.out.println("Error al elegir opcion");
            }
            
        } while (opcion!=6);
        
        
        
    }
}
