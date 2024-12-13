package com.example.soap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.example.model.Reservation;
import com.example.service.ReservationService;

@Endpoint
public class ReservationEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/reservation";

    @Autowired
    private ReservationService reservationService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createReservationRequest")
    @ResponsePayload
    public CreateReservationResponse createReservation(@RequestPayload CreateReservationRequest request) {
        Reservation reservation = request.getReservation();
        Reservation createdReservation = reservationService.createReservation(reservation);
        CreateReservationResponse response = new CreateReservationResponse();
        response.setReservation(createdReservation);
        return response;
    }
}

