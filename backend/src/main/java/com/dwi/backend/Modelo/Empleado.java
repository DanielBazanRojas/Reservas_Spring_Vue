package com.dwi.backend.Modelo;

public class Empleado {
    int id;
    String nombres;
    String cargo;
    int telefono;
    String correo;
    int dni;

    public Empleado() {
    }

    public Empleado(String nombres, String cargo, int telefono, String correo, int dni) {
        this.nombres = nombres;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}