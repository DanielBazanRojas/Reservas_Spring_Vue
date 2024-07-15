package com.dwi.backend.controllers;

import com.dwi.backend.common.ApiResponse;
import com.dwi.backend.model.Booking;
import com.dwi.backend.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/reservas")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createBooking(@Valid @RequestBody Booking booking){
        if(Objects.nonNull(bookingService.readBooking(booking.getIdReserva()))){
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "La reserva no pudo ser creada"), HttpStatus.CONFLICT);
        }
        bookingService.createBooking(booking);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Reserva creada exitosamente"), HttpStatus.CREATED);
    }
}
