package com.dwi.backend.Controlador;

import com.dwi.backend.Modelo.Reserva;
import com.dwi.backend.ModeloDAO.ReservaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/reservas")
public class ControladorReserva {

    @Autowired
    private ReservaDAO dao;

    @GetMapping
    public List<Reserva> listarReservas() {
        return dao.listar();
    }

    @PostMapping
    public ResponseEntity<?> agregarReserva(@RequestBody Reserva reserva) {
        boolean nuevaReserva = dao.addReservaAndReturnSuccess(reserva);
        if (!nuevaReserva) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear la reserva");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(reserva);
    }

    @PutMapping("/{id}")
    public Reserva actualizarReserva(@PathVariable int id, @RequestBody Reserva reserva) {
        reserva.setIdReserva(id);
        dao.edit(reserva);
        return reserva;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarReserva(@PathVariable int id) {
        dao.delete(id);
        return ResponseEntity.ok().build();
    }
}
