package com.dwi.backend.repository;

import com.dwi.backend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Booking findByidReserva(Integer idReserva);
}
