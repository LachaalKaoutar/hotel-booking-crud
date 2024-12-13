package com.example.soap;

import com.example.model.Reservation;

public class CreateReservationResponse {
    private Reservation reservation;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}

