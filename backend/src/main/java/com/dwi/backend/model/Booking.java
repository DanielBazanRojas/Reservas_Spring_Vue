package com.dwi.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.awt.print.Book;
import java.util.Date;

@Entity
@Table(name = "reserva")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;


    private Integer idCliente;
    private Integer idPaquete;

    private @NotBlank Date fecha_reserva;
    private @NotBlank Date fecha_salida;
    private @NotBlank Date fecha_retorno;

    @Column(name = "cantidad_personas")
    private @NotBlank Integer personas;

    public Booking(){

    }

    public Booking(@NotBlank Date fecha_salida,@NotBlank Date fecha_retorno,@NotBlank Integer personas) {
        this.fecha_salida = fecha_salida;
        this.fecha_retorno = fecha_retorno;
        this.personas = personas;
    }

    public Booking(@NotBlank Date fecha_reserva,@NotBlank Date fecha_salida,@NotBlank Date fecha_retorno,@NotBlank Integer personas) {
        this.fecha_reserva = fecha_reserva;
        this.fecha_salida = fecha_salida;
        this.fecha_retorno = fecha_retorno;
        this.personas = personas;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer id) {
        this.idReserva = id;
    }

    public @NotBlank Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(@NotBlank Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public @NotBlank Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(@NotBlank Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public @NotBlank Date getFecha_retorno() {
        return fecha_retorno;
    }

    public void setFecha_retorno(@NotBlank Date fecha_retorno) {
        this.fecha_retorno = fecha_retorno;
    }

    public @NotBlank Integer getPersonas() {
        return personas;
    }

    public void setPersonas(@NotBlank Integer personas) {
        this.personas = personas;
    }
}
