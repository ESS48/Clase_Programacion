/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author damt119
 */
public class Empleado {
    
    private String nombre;
    private String departamento;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
        
        this.nombre = "Elias";
        this.departamento = "Informatica";
        this.edad = 19;
        this.casado = false;
        this.salario = 1400.50;
    }
    
    public void clasificacionEdad(){
    
        if (edad<=21) {
            System.out.println("Principiante");
        }
    
    
    }
    
}
