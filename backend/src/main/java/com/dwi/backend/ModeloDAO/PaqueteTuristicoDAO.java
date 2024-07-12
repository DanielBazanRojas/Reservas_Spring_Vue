package com.dwi.backend.ModeloDAO;

import com.dwi.backend.Config.Conexion;
import com.dwi.backend.Modelo.PaqueteTuristico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaqueteTuristicoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public List<PaqueteTuristico> listar() {
        ArrayList<PaqueteTuristico> list = new ArrayList<>();
        String sql = "SELECT * FROM paquete_turistico ORDER BY idpaquete ASC";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                PaqueteTuristico paquete = new PaqueteTuristico();
                paquete.setIdPaquete(rs.getInt("idpaquete"));
                paquete.setDestino(rs.getString("destino"));
                paquete.setDuracion(rs.getString("duracion"));
                paquete.setPrecio(rs.getString("precio"));
                paquete.setDescripcion(rs.getString("descripcion"));
                list.add(paquete);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    // Métodos add, edit, delete, y list (por id) se implementarían siguiendo la estructura de ReservaDAO,
    // adaptando las consultas SQL y los parámetros a los campos de PaqueteTuristico.
}