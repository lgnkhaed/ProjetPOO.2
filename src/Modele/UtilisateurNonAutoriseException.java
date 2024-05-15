package Modele; 


public class UtilisateurNonAutoriseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public UtilisateurNonAutoriseException() {
		super("Utilisateur non autorisé");
	}
}
