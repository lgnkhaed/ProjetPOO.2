package Modele;


public class ChambreDejaExistanteException extends Exception {

	/*
	                     */
	private static final long serialVersionUID = 1L;

	
	public ChambreDejaExistanteException() {
		super("Chambre existe déja");
	}
}

