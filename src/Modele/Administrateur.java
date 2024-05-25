package Modele; 
 /* Administrateur Class  (sous classe d'utilisateur) */
/*Gérer les réservations (accéder aux demandes, accepter, décliner) */
public class Administrateur extends Utilisateur{
     
    
    /* Super constructor  */
     public Administrateur(Hotel hotel, String lastname,String firstname,Integer age, String email , String motdepasse)
    {
      super(lastname, firstname, age, email, motdepasse);
      hotel.setcountAdminist(hotel.getCountAdministra()+1);
      hotel.listeadAdministrateurs.put(hotel.getCountAdministra(),this);
    }

    /* Methods for Administrateur to manipulate Rooms */
    
    /* ADD room  */ 
    public void Newroom(Hotel hotel,Integer num) {  
        Room rm = new Room(hotel,num);
        hotel.listeadRooms.put(hotel.getCountRoom(),rm);/* a la construction de la rm il y aura l'incrementation de countroom  */
        System.out.println(rm.toString()+" is added to the list");
        rm.existe = true;
     }
  	  
   
    
   /* method Delete room  */
    public void Deleteroom(Hotel hotel,Room rm) throws  ChambreInexistanteException{
        hotel.listeadRooms.remove(rm.getNumber());
        System.out.println(rm.toString()+" is removed");
  	  
    }

    /* change the state of a room  */
    public void Changestateroom(Hotel hotel , Room rm ) throws UtilisateurNonAutoriseException, ChambreInexistanteException{
    	if(!estAdmin) {
  		  throw new UtilisateurNonAutoriseException();
  	  }else{
        Room value = hotel.listeadRooms.get(rm.number);
        if(value != null){
            rm.Changestate();
            System.out.println("ROOM with the NUmber "+String.valueOf(rm.getNumber())+"is "+rm.getState()+ "now");
        }else{
        	throw new ChambreInexistanteException();
        }
  	  }
    }

    /* Methode pour chercher une Chambre vide  */
      public Room Freeroom(Hotel hotel) throws UtilisateurNonAutoriseException{
    	  if(!estAdmin) {
    		  throw new UtilisateurNonAutoriseException();
    	  }else{
    		  for (Integer Countroomfree : hotel.listeadRooms.keySet()){
            Room rm =hotel.listeadRooms.get(Countroomfree); 
                 if(rm.state=="free"){
                  return rm; 
                 }
              }
            return null;
           }
      }
      
      private boolean estAdmin;

      public void Utilisateur(boolean estAdmin) {
          this.estAdmin = estAdmin;
      }

      public boolean estAdministrateur() {
          return estAdmin;
      }





   /* Les methodes de l'Administrateurs pour manipuler les Reservations  */

   /* Methode pour accepter une demande  */

   public void AccepterDemandeReserv(Hotel hotel,String codereserv) throws UtilisateurNonAutoriseException, ReservationInexistanteException, ReservationImpossibleException{
	   if(!estAdmin) {
 		  throw new UtilisateurNonAutoriseException();
 	  }else{
 		  try{
        Reservation demanderesrev = hotel.listeadDemandeReservation.get(codereserv);
     /*faut trouver une chambre vide  */
        if(demanderesrev != null ){
            Room roomfree = this.Freeroom(hotel);
            if(roomfree != null){/*il y'a une chambre vide donc demande resrevation devient Reservation  */
                demanderesrev.setStateReserv(StateReservation.Accepte);
                demanderesrev.setRoom(roomfree);
                hotel.listeadReservation.put(codereserv,demanderesrev);
                hotel.listeadDemandeReservation.remove(codereserv);
            } else{
                /*Si on rentre dans ce bloc donc il n y'a pas une chambre vide  */
                demanderesrev.setStateReserv(StateReservation.Refusee);
                throw new ReservationImpossibleException();
            }  
        }  
    }catch(NullPointerException e){
        throw new ReservationInexistanteException();
    }
   }
   }
}