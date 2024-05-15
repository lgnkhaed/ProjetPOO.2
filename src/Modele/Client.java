package Modele;

public class Client extends Utilisateur {

    /* Constructor  */
  public Client(String lastname,String firstname,Integer age, String email , String motdepasse,Hotel hotel){
    super(lastname, firstname, age, email, motdepasse);
    hotel.setCountClients(hotel.getCountClients()+1);
  }

 /* methode poour demander une reservation  */
 public Reservation DemandeReservation(Hotel hotel ,Date datedebut, Date datefin) throws DateInvalidException{
   Reservation demandereserv = new Reservation(hotel,this,datedebut,datefin ); 
   Integer d = Date.Daysbetweendates(datedebut,datefin);
   if(datedebut.getYear() > datefin.getYear() || datedebut.getYear() == datefin.getYear() && datedebut.getM() > datefin.getM()  || d < 0) {
	   throw new DateInvalidException();
   }
   hotel.listeadDemandeReservation.put(demandereserv.getCodeStringResrv(),demandereserv);
   return demandereserv;
  }
 

/* methode pour annuler une Reservation  */
  public void AnnulerResrvation(Hotel hotel,String codeReserv){
    try{
      Reservation reservannulee = hotel.listeadReservation.get(codeReserv);
      if(reservannulee != null){
      reservannulee.setStateReserv(StateReservation.Annulee);
      }else{
        reservannulee = hotel.listeadDemandeReservation.get(codeReserv);
        if(reservannulee != null){
          reservannulee.setStateReserv(StateReservation.Annulee);
        }else {
          System.out.println("Reservation not found ");
        }
      }
    }catch( NullPointerException exception){
     System.out.println("Reservation not found");
    } 
  }
}
