package com.dwi.backend.Controlador;

import com.dwi.backend.Modelo.Reserva;
import com.dwi.backend.ModeloDAO.ReservaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        boolean nuevaReserva = dao.add(reserva);
        if (!nuevaReserva) { // Check if nuevaReserva is false
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(nuevaReserva);
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