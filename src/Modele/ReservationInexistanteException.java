package Modele;
public class ReservationInexistanteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ReservationInexistanteException() {
		super("Reservation non Trouvée " );
	}
}
