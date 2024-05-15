package Modele;

public class ChambreInexistanteException extends Exception {

	/**
	
	 */
	private static final long serialVersionUID = 1L;

	
	public ChambreInexistanteException() {
		super("Chambre n'existe pas !!!! ");
	}
}
