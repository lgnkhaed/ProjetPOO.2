package Modele;


public class Reservation {
    
    /* les attribus pour la reservation  */
    private  Hotel hotel; 
    private Client client; 
    private Room room;
    private String codeStringReserv; /* 3 lettres m firstnameclient + 3lettres m lastname + coount  */
    private StateReservation statereserv;
    private Date datedebut;
    private Date datefin;
    private Integer numberofdays;
    
  /*  Setters  */

  /* les attribus auront leurs valeurs lors de la construction mais on a besoin des getters et setters en cas ou de changement de dates pour la reserv   */
   protected void setcodeStringcode(String code  ){
    this.codeStringReserv=code;
   }

   public void setdatedebut(Date date){
    datedebut.setDay(date.getDay());
    datedebut.setMois(date.getMois());
    datedebut.setYear(date.getYear());
   }
   
   public void setdatefin(Date date ){
    datefin.setDay(date.getDay());
    datefin.setMois(date.getMois());
    datefin.setYear(date.getYear());
   }
   
   public void setnumberofdays(Integer number){
     this.numberofdays=number;
   }

   public void setStateReserv(StateReservation state){
    this.statereserv=state;
  }

  public void setHotel(Hotel hotel){
    this.hotel=hotel;
  }

  public void setRoom(Room rm){
    this.room=rm;
  }

  public void setClient(Client client){
    this.client=client;
  }  
/* getters  */

  public Integer getNumberofdays(){
    return this.numberofdays;
  }  

  public Date getDatedebut(){
    return this.datedebut;
  }

  public Date getDateFin(){
    return this.datefin;
  }

  public StateReservation getStateReserv(){
    return this.statereserv;
  }

  public String getCodeStringResrv(){
    return this.codeStringReserv;
  }

  public Client getClient(){
    return this.client;
  }

  public Hotel getHotel(){
    return this.hotel;
  }

  public Room getRoom(){
    return this.room;
  }
/* methode pour creer le code de l  a reservation  */
public String Codereserv(String firstname,String lastname,Integer count  ){
    if (firstname.length() < 3 || lastname.length() < 3) {
        throw new IllegalArgumentException("the name and first name of the client is unvalid ");
    }
    String code = firstname.substring(0,3)+lastname.substring( 0,3)+String.valueOf(count);
   return code; 
}




  /* Constructeur  */
public Reservation(Hotel hotel , Client client, Date datedebut , Date datefin ){
   this.hotel=hotel;
   this.room=null;/* lors de l'acceptation ou refutation de la demande j'affecte une chambre*/
   this.client=client;
   this.datedebut= datedebut;
   this.datefin=datefin;
   this.numberofdays=Date.Daysbetweendates(datedebut,datefin);
   this.setStateReserv(StateReservation.Enattente);
   this.setcodeStringcode(Codereserv(this.client.getFirstname(), this.getClient().getLastname(),this.getHotel().getCountReserv()));
   this.hotel.setcountReserv(this.hotel.getCountReserv()+1);
   
}

}
