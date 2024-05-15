package Modele;


public abstract class Utilisateur {
    /* Commuun Utilisateurs Attributes  */
    private String lastname; 
    private String firstname; 
    private Integer age; 
    private String Emailadress;
    private String Motdepasse; 
    
    /* Commuun Utilisateurs Attributes GETTERS AND SETTERS   */

    public void SetLastname(String lastname){
        this.lastname=lastname;
    }
    public void SetFisrtname(String firstname){
        this.firstname=firstname;
    }
    public void Setage(Integer age){
        this.age=age;
    }
    
    public void SetEmailadress(String emailadress){
        this.Emailadress=emailadress;
    }
    
    public void SetMotepasse(String motdepasse){
        this.Motdepasse=motdepasse;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public Integer getAge(){
        return this.age;
    }

    public String getEmailadress(){
        return this.Emailadress;
    }

    public String getMotdepasse(){
        return this.Motdepasse;
    }

    /* Constructors For Utilisateur Class   */
    public Utilisateur(String lastname , String firstname , Integer age , String email , String motdepasse)
    {
        this.lastname=lastname;
        this.firstname=firstname;
        this.age=age;
        this.Emailadress=email;
        this.Motdepasse=motdepasse;
    } 


    /*la Méthode Tostring  */
    public String toString(){
        return "The full  name of the User is :  "+getLastname() + "  " +  getFirstname()+" , and his age is "+String.valueOf(getAge());
    }

    /*Methode li tverfyi email w mot de passe*/
    public Boolean Verifauthenfication(String email , String motdepasse ){
        return this.getEmailadress().equals(email) && this.getMotdepasse().equals(motdepasse);
    }
}
