package com.example.mapper;

import com.example.dto.ReservationDTO;
import com.example.model.Chambre;
import com.example.model.Reservation;

public class ReservationMapper {
    public static ReservationDTO toDTO(Reservation reservation) {
        ReservationDTO dto = new ReservationDTO();
        dto.setId(reservation.getId());

        // Vérifiez que `chambre` n'est pas null avant d'appeler `getId()`
        Chambre chambre = reservation.getChambre();
        if (chambre != null) {
            dto.setChambreId(chambre.getId());
        }

        dto.setClientId(reservation.getClient().getId());
        dto.setDateDebut(reservation.getDateDebut().toString());
        dto.setDateFin(reservation.getDateFin().toString());
        return dto;
    }
}
