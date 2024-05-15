package Modele;

//import java.util.*;
import java.util.HashMap;

public class Hotel {
    private  Integer countRoom = 0 ;
    private Integer countClients = 0;
    private Integer countAdminist = 0;
    private Integer countReserv = 0 ;  
    //private Integer countDemandeReserv = 0 ; 
    private String name; 
    protected HashMap<Integer,Administrateur> listeadAdministrateurs = new HashMap<Integer,Administrateur>(); 
    protected HashMap<Integer,Client> listeadCients = new HashMap<Integer,Client>();
    protected HashMap<Integer,Room> listeadRooms = new HashMap<Integer,Room>();
    protected HashMap<String,Reservation> listeadReservation = new HashMap<String,Reservation>();
    protected HashMap<String,Reservation> listeadDemandeReservation = new HashMap<String,Reservation>();


    public Hotel(){
        listeadAdministrateurs = new HashMap<Integer,Administrateur>();   
        listeadCients = new HashMap<Integer,Client>();
        listeadRooms = new HashMap<Integer,Room>();
        listeadReservation = new HashMap<String,Reservation>();
        listeadDemandeReservation = new HashMap<String,Reservation>();
    }

    /* getter pour LIste administrateur  */
    public HashMap<Integer,Administrateur> getlisteAdmini(){
        return this.listeadAdministrateurs;
    }

    /* Getters and Setters  */
    /**************public void setcountDemandeReserv(Integer countdemandreserv){
        this.countDemandeReserv=countdemandreserv;
    }****************/

    public void setcountReserv(Integer countreserv){
        this.countReserv=countreserv;
    }
    
    public void setcountAdminist(Integer countadmini){
        this.countAdminist=countadmini;
    }

    public void setCountClients(Integer countClients){
        this.countClients=countClients;
    }

    public void setcountRoom(Integer count){
      this.countRoom=count;
    }
     
    public void setName(String name){
        this.name=name;
    }
  
    public Integer getCountRoom(){
        return this.countRoom;
    }

    public String getName(){
        return this.name;
    }

    public Integer getCountClients(){
        return this.countClients;
    }

    public Integer getCountAdministra(){
        return this.countAdminist;
    }


    public Integer getCountReserv(){
        return this.countReserv;
    }
    
    /**************************     public Integer getCountDemandeReserv(){
        return this.countDemandeReserv;
    }***************************/
}
