package Modele;

public class Date {
    private  Integer day; 
    private Mois mois; 
    private Integer year; 
    private Integer m; 



    /* lazm le jour ykon tahet 31 w ça depend le mois   */
    public Boolean Jourcorrect(Integer jour , Mois mois ){
         if( jour>= 1 && jour <= joursDansMois(mois)){
            return true;
         }else{
            return false;
         }
    }

/* constructeur  */
    public Date(Integer day , Mois mois ,Integer year){
        this.day=day;
        this.mois = mois; 
        this.year = year; 
    }
/*getters  */

 public Integer getDay(){
    return this.day;
 }

 public Mois getMois(){
    return this.mois;
 }

 public Integer getYear(){
    return this.year;
 }

/*setters  */
  public void setDay(Integer day){
    if ( day >= 1 && day <= 31){
      this.day = day;
    }
  }

  public void setMois(Mois mois){
    this.mois=mois;
  }

  public void setYear(Integer year){
    this.year=year;
  }
/* methode pour donner le nombre de jours de chaque mois  */
public static Integer joursDansMois(Mois mois) {
    switch (mois) {
        case January: 
        case March: 
        case May:  
        case July: 
        case August: 
        case October: 
        case December: 
            return 31;
        case February :
        case April: 
        case June: 
        case September: 
        case November: 
            return 30;
        
        default:
            return 0;
    }
}
/* Methide pour calculer le nombres des jours entres deux dates  */
 public static Integer Daysbetweendates(Date date1 , Date date2){

 Integer days1 = date1.getYear() * 365 + (date1.getMois().ordinal()+1) * joursDansMois(date1.getMois())  + date1.getDay();
 Integer days2 = date2.getYear() * 365 + (date2.getMois().ordinal()+1) * joursDansMois(date2.getMois())  + date2.getDay();

 if ( days2 - days1 >= 0 ){
    return  days2-days1;
}else{
    return days1-days2;
}
}

public Integer getM() {
	return m;
}

public void setM(Integer m) {
	this.m = m;
}

/* methode qui renvoie le nombre d'un mois quelconque */
public  Integer Moisnbr(Mois mois) {
    switch (mois) {
        case January:
            return 1;
        case February:
            return 2;
        case March:
            return 3;
        case April:
            return 4;
        case May:
            return 5;
        case June:
            return 6;
        case July:
            return 7;
        case August:
            return 8;
        case September:
            return 9;
        case October:
            return 10;
        case November:
            return 11;
        case December:
            return 12;
        
        default:
            return 0;
    }
}


}


