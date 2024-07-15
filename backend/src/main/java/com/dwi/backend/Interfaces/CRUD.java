package com.dwi.backend.Interfaces;

import java.util.List;
import com.dwi.backend.Modelo.Cliente;

public interface CRUD {
    public List listar();
    public Cliente list(int id);
    public boolean add(Cliente cliente);
    public boolean edit(Cliente cliente);
    public boolean delete(int id);
}
