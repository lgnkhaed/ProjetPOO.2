package Modele;

public class Date {
    private  Integer day;
    private Mois mois; 
    private Integer year; 
    private Integer m; 

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
    this.day=day;
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
public static Integer Moisnbr(Mois mois, Integer m) {
    switch (mois) {
        case January:
        	m = 1;
        case March:
        	m = 3;
        case May: 
        	m = 5;
        case July:
        	m = 7;
        case August:
        	m = 8;
        case October:
        	m = 10;
        case December:
        	m = 12;   
        case February :
        	m = 2;
        case April:
        	m = 4;
        case June:
        	m = 6;
        case September:
        	m = 9;
        case November: 
        	m = 11;
        
        default:
            return 0;
    }
}


}


