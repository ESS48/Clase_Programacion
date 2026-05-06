/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.hoja_4_objetos_serializables;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author damt119
 */
public class Hoja_4_Objetos_Serializables {

    public static void main(String[] args) {

        guardarPersonas();

        leer();

    }

    static void guardarPersonas() {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("personas.dat"))) {

            Mascota m1 = new Mascota("Perro", 4);
            Mascota m2 = new Mascota("Gato", 4);
            Mascota m3 = new Mascota("Conejo", 4);
            Mascota m4 = new Mascota("Caballo", 4);

            Persona p1 = new Persona("Elias", "Santisteban", 19, m2);
            Persona p2 = new Persona("Azucena", "Salcines", 48, m1);
            Persona p3 = new Persona("Valentin", "Santisteban", 25, m3);
            Persona p4 = new Persona("Neco", "Santisteban", 17, m4);

            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.writeObject(p4);

            System.out.println("Personas guardadas");

        } catch (IOException e) {
            System.out.println("Error al guardar");
        }

    }

    static void leer() {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("personas.dat"))) {

            while (true) {
                Persona p = (Persona) ois.readObject();
                System.out.println(p);
            }

        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            System.out.println("Error al cargar");

        } catch (ClassNotFoundException ex) {
            System.out.println("");
        }

    }
}
