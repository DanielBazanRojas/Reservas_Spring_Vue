package com.dwi.backend.ModeloDAO;

import com.dwi.backend.Config.Conexion;
import com.dwi.backend.Interfaces.CRUDReserva;
import com.dwi.backend.Modelo.Reserva;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class ReservaDAO implements CRUDReserva {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Reserva reserva = new Reserva();

    @Override
    public boolean addReservaAndReturnSuccess(Reserva reserva) {
        String sql = "INSERT INTO reserva (idcliente, idpaquete, idempleado, fecha_reserva, fecha_salida, fecha_retorno, cantidad_personas) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, reserva.getIdCliente());
            pst.setInt(2, reserva.getIdPaquete());
            if (reserva.getIdEmpleado() != null) {
                pst.setInt(3, reserva.getIdEmpleado());
            } else {
                pst.setNull(3, Types.INTEGER);
            }
            pst.setDate(4, new java.sql.Date(reserva.getFechaReserva().getTime()));
            pst.setDate(5, new java.sql.Date(reserva.getFechaSalida().getTime()));
            pst.setDate(6, new java.sql.Date(reserva.getFechaRetorno().getTime()));
            pst.setInt(7, reserva.getCantidadPersonas());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List listar() {
        return List.of();
    }

    @Override
    public Reserva list(int id) {
        String sql = "SELECT * FROM reserva WHERE idreserva = " + id;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idreserva"));
                reserva.setIdCliente(rs.getInt("idcliente"));
                reserva.setIdPaquete(rs.getInt("idpaquete"));
                reserva.setIdEmpleado(rs.getInt("idempleado"));
                reserva.setFechaReserva(rs.getDate("fecha_reserva"));
                reserva.setFechaSalida(rs.getDate("fecha_salida"));
                reserva.setFechaRetorno(rs.getDate("fecha_retorno"));
                reserva.setCantidadPersonas(rs.getInt("cantidad_personas"));
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
        return reserva;
    }

    @Override
    public boolean add(Reserva reserva) {
        String sql = "INSERT INTO reserva (idcliente, idpaquete, idempleado, fecha_reserva, fecha_salida, fecha_retorno, cantidad_personas) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, reserva.getIdCliente());
            pst.setInt(2, reserva.getIdPaquete());
            pst.setInt(3, reserva.getIdEmpleado());
            pst.setDate(4, new java.sql.Date(reserva.getFechaReserva().getTime()));
            pst.setDate(5, new java.sql.Date(reserva.getFechaSalida().getTime()));
            pst.setDate(6, new java.sql.Date(reserva.getFechaRetorno().getTime()));
            pst.setInt(7, reserva.getCantidadPersonas());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
                    System.out.println("Error al guardar la reserva: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean edit(Reserva reserva) {
        String sql = "UPDATE reserva SET idcliente = ?, idpaquete = ?, idempleado = ?, fecha_reserva = ?, fecha_salida = ?, fecha_retorno = ?, cantidad_personas = ? WHERE idreserva = ?";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, reserva.getIdCliente());
            pst.setInt(2, reserva.getIdPaquete());
            pst.setInt(3, reserva.getIdEmpleado());
            pst.setDate(4, new java.sql.Date(reserva.getFechaReserva().getTime()));
            pst.setDate(5, new java.sql.Date(reserva.getFechaSalida().getTime()));
            pst.setDate(6, new java.sql.Date(reserva.getFechaRetorno().getTime()));
            pst.setInt(7, reserva.getCantidadPersonas());
            pst.setInt(8, reserva.getIdReserva());
            int rowsUpdated = pst.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM reserva WHERE idreserva = " + id;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
