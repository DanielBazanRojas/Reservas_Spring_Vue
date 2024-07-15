package com.dwi.backend.Interfaces;

import java.util.List;
import com.dwi.backend.Modelo.Reserva;

public interface CRUDReserva {
    public List listar();
    public Reserva list(int id);
    public boolean add(Reserva reserva);
    public boolean edit(Reserva reserva);
    public boolean delete(int id);
}
