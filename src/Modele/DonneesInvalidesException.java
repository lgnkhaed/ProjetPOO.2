package Modele;

public class DonneesInvalidesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public DonneesInvalidesException() {
		super("Veuillez introduire des donnes Valides !!! ");
	}
}
