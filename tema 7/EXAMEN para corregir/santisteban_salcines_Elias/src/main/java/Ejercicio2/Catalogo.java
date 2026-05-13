/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author damt119
 */
public class Catalogo implements Serializable {

    static String fichero = "productos.txt";

    private ArrayList<String> productos;

    public Catalogo() {
        this.productos = new ArrayList<>();
    }

    public void aniadirProductos(String p) {

        productos.add(p);

    }

    public void listarProductos() {

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            String lineas = br.readLine();

            while (lineas != null) {
                if (lineas.isEmpty()) {
                    System.out.println("No hay productos");
                } else {
                    for (String p : productos) {
                        bw.write(lineas);
                        bw.newLine();
                        System.out.println(p);
                    }
                    lineas = br.readLine();
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo lectura");
        }

    }

    public void ordenarProductos() {

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String lineas = br.readLine();

            while (lineas != null) {
                String[] partes = lineas.split(";");
                String campo1 = partes[0].trim();
                String campo2 = partes[1].trim();
                double campo3 = Double.parseDouble(partes[2].trim());
                String campo4 = partes[3].trim();
                double campo5 = Double.parseDouble(partes[4].trim());

                System.out.println(campo1);
                System.out.println(campo2);
                System.out.println(campo3);
                System.out.println(campo4);
                System.out.println(campo5);

                lineas = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo lectura");
        }

    }

    public void contar() {

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader bw = new BufferedReader(fr);

            String lineas = bw.readLine();

            while (lineas != null) {
                String[] partes = lineas.split(";");
                String campo2 = partes[0].trim();
                for (String p : partes) {
                    System.out.println(campo2);
                    System.out.println(p);
                }
                lineas = bw.readLine();
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo lectura");
        }

    }

    public void cargar() {
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            
             //bw.write(productos);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo lectura");
        }
    }

    public void guardar() {

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            String lineas = br.readLine();

            while (lineas != null) {
                bw.write(lineas);
                bw.newLine();
            }
// esto me sirve para guardar el contenido en otro fichero
            File original = new File(fichero);
            File copia = new File("listado_productos.txt");

            original.delete();
            copia.renameTo(original);

            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Fallo lectura");
        }

    }

    public void GuardarColeccion() {

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.dat"));
            //esto me sirve para guardar el fichero en la collecion.
            oos.writeUTF(fichero);

        } catch (IOException ex) {
            System.out.println("Fallo");
        }

    }

    public void cargarColeccion() {

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productos.dat"));
// este me sirve para recorrer el fichero .dat
            while (true) {
                ois.read();
            }
// esto sirve para que no salga la excepcion y salgo un mensaje
        } catch (EOFException e) {

            System.out.println("Fin del fichero");

        } catch (IOException ex) {
            System.out.println("Fallo");
        }

    }
}
