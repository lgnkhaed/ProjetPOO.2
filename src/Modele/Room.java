package Modele;

public class Room {
    /* Attributes  */
    
    protected Integer number;
    protected String state;
    public boolean existe;
   // protected TypeRoom typeRoom; 
   
    /* getters and setters */
      
    public void setState(String state){
        this.state=state;
    }

    
   /*  public void settypeRoom(TypeRoom typeRoom){
        this.typeRoom=typeRoom;
    }*/

    public void setNumber(Integer num ){
        this.number=num;
    }

    public String getState(){
        return this.state;
    }

    
    /*public TypeRoom gettTypeRoom(){
        return this.typeRoom;
    }*/ 

    public Integer getNumber(){
        return this.number;
    }

    @Override 
    public String toString(){
        return "The room with the  number "+ String.valueOf(number)+"is : " +getState();
    }

    /* constructor  */
    public Room(Hotel hotel){
        this.state = "free";
        hotel.setcountRoom(hotel.getCountRoom()+1);
        this.number= hotel.getCountRoom();
        hotel.listeadRooms.put(hotel.getCountRoom(),this);
    }

    /* Chnage state method  */
    public void Changestate(){
        if(this.state == "free"){
            this.state = "reserved";
        }else{
            this.state="free";
        }
    }


}

