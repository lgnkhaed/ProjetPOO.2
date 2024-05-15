package Modele;

public class ReservationImpossibleException extends Exception {

	/*  cette exception au cas ou la reservation du client est impossible pour une certaine raison */
	private static final long serialVersionUID = 1L;

	
	public ReservationImpossibleException() {
		super("Reservation impossible");
	}
}
