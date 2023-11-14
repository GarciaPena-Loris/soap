package m1.archi.service;

import m1.archi.exception.DateNonValideException;
import m1.archi.exception.ReservationProblemeException;
import m1.archi.exception.UserNotFoundException;
import m1.archi.hotel.Offre;
import m1.archi.hotel.Reservation;
import m1.archi.model.Agence;

import javax.jws.WebService;

@WebService(endpointInterface = "m1.archi.service.AgenceServiceReservation")
public class AgenceServiceReservationImpl implements AgenceServiceReservation {

    private Agence agence;

    public AgenceServiceReservationImpl() {
        this.agence = new Agence();
    }

    public AgenceServiceReservationImpl(Agence agence) {
        this.agence = agence;
    }

    public Reservation reserverChambresHotel(String login, String motDePasse, Offre offre, boolean petitDejeuner, String nomClient, String prenomClient, String email, String telephone, String nomCarte, String numeroCarte, String expirationCarte, String CCVCarte)
            throws DateNonValideException, UserNotFoundException, ReservationProblemeException {
        return agence.reserverChambresHotel(login, motDePasse, offre, petitDejeuner, nomClient, prenomClient, email, telephone, nomCarte, numeroCarte, expirationCarte, CCVCarte);
    }
}
