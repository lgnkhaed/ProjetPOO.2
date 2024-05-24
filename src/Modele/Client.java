package Modele;

public class Client extends Utilisateur {
  private Boolean demandeeffectue = false;
    /* Constructor  */
  public Client(String lastname,String firstname,Integer age, String email , String motdepasse,Hotel hotel){
    super(lastname, firstname, age, email, motdepasse);
    hotel.setCountClients(hotel.getCountClients()+1);
    hotel.listeadCients.put(hotel.getCountClients(),this);
  }

 /* methode poour demander une reservation  */
 public Reservation DemandeReservation(Hotel hotel ,Date datedebut, Date datefin) {
   Reservation demandereserv = new Reservation(hotel,this,datedebut,datefin ); 
  
   this.setDemandeeffectue(true);
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

  /* getter and setter pour demande  */
  public Boolean getDemandeeffectue(){
   return  this.demandeeffectue;
  }

 public void setDemandeeffectue(Boolean A){
  this.demandeeffectue = A;
 }
}
