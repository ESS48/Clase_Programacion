/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja2_jdbc_videojuegos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt119
 */
public class VideojuegoDAO {

    public ArrayList<Videojuego> listar() {

        ArrayList<Videojuego> lista = new ArrayList<>();

        String videojuegos = "select * from videojuegos";

        try {
            Connection conexion = ConexionBD.conectar();
            System.out.println("Se conecto la base de datos");

            PreparedStatement ps = conexion.prepareCall(videojuegos);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String plataforma = rs.getString("plataforma");
                double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");

                Videojuego v = new Videojuego(id, titulo, plataforma, precio, stock);
                lista.add(v);
            }

        } catch (SQLException ex) {
            System.out.println("Conexion a la base de datos fallida");
        }

        return lista;

    }

    public Videojuego buscarPorId(int idVideojuego) {

        String videojuegos = "select * from videojuegos where id=?";

        Videojuego v = null;

        try {
            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(videojuegos);

            ps.setInt(1, idVideojuego);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String plataforma = rs.getString("plataforma");
                double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");

                v = new Videojuego(id, titulo, plataforma, precio, stock);

            }

            ps.close();
            rs.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("Conexion fallida");
        }

        return v;

    }

    public boolean insertar(Videojuego v) {

        String videojuego = "INSERT INTO videojuegos(titulo,plataforma,precio,stock) values(?,?,?,?)";

        try {
            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(videojuego);

            ps.setString(1, v.getTitulo());
            ps.setString(2, v.getPlataforma());
            ps.setDouble(3, v.getPrecio());
            ps.setInt(4, v.getStock());

            int fila = ps.executeUpdate();

            if (fila > 0) {
                return true;
            }
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(VideojuegoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean actualizar(Videojuego v) {

        String videojuego = "UPDATE videojuegos SET titulo=?, plataforma=?, precio=?, stock=? WHERE id=?";

        try {
            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(videojuego);

            ps.setString(1, v.getTitulo());
            ps.setString(2, v.getPlataforma());
            ps.setDouble(3, v.getPrecio());
            ps.setInt(4, v.getStock());

            ps.setInt(5, v.getId());

            int fila = ps.executeUpdate();

            if (fila > 0) {
                return true;
            }
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(VideojuegoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    public boolean eliminar(int id) {

        String videojuego = "DELETE FROM videojuegos WHERE id=?";

        try {
            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(videojuego);

            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila > 0) {
                return true;
            }
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(VideojuegoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }
}
