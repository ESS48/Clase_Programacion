/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author damt119
 */
public class GestorAlumnos {

    private ArrayList<Alumno> listaAlumnos;
    private String rutaFichero;

    public GestorAlumnos() {

        this.listaAlumnos = new ArrayList<>();
        this.rutaFichero = "Alumnos.dat";
    }

    public void cargarAlumnos() {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(rutaFichero))) {

            listaAlumnos = (ArrayList<Alumno>) ois.readObject();

        } catch (IOException e) {
            System.out.println("Error al cargar");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar");
        }

    }

    public void guardarAlumnos() {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(rutaFichero))) {

            oos.writeObject(listaAlumnos);
            System.out.println("Se guardo correctamente");

        } catch (IOException e) {
            System.out.println("Error al guardar");
        }
    }

    public void aniadirAlumno(Alumno alumno) {

        listaAlumnos.add(alumno);

    }

    public void borrarAlumno(String nombre) {

        Iterator<Alumno> i = listaAlumnos.iterator();

        while (i.hasNext()) {
            Alumno a = i.next();
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                i.remove();
            }
        }

    }

    public Alumno buscarAlumno(String nombre) {

        for (Alumno a : listaAlumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }

    public void listarAlumno() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay ningun alumno en el fichero");
        } else {
            for (Alumno a : listaAlumnos) {
                System.out.println(a);
            }
        }
    }

}
