import Controller.*;
import Modele.*;
import View.*;
import java.awt.EventQueue;
public class App {
    public static void main(String[] args) throws Exception {
        Hotel ht = new Hotel(); 
        Administrateur admin1 = new Administrateur(ht,"khaled" ,"laggoun", 20, "khaled@gmail.com", "123");
        Client client1 = new Client("hamiti", "amine", 20,"amine@gmail.com", "aze", ht);
        Client clienth = new Client("ouadahi", "kad", 20,"kad1@gmail.com", "aze", ht);
        Client client3 = new Client("ouadahi", "kad", 20,"kad@gmail.com", "aze", ht);
        client3.setDemandeeffectue(true); /* Client 3 a une reservation  */
        Room room1 = new Room(ht,1);
         Room room2 = new Room(ht,2);
        room1.setState("reserved");
        room2.setState("free");
        Room room3 = new Room(ht,3);
        room3.setState("reserved");
        Room room4 = new Room(ht,4);
        room4.setState("free");
        Room room5= new Room(ht,20); 
        MyFrameView frame = new MyFrameView();
                    new ControlmyFrame(frame);
                    frame.setVisible(true);
                    frame.sethotel(ht);
        System.out.println("eyyyye"+ht.getCountAdministra());
        System.out.println("eyyyye"+ht.getCountClients());
        ht.parcourirHashMap();
    }
}
/* quand je cree une fenetre avec un Button lazm mm class control ta3ha n'extensiha w nmdlhja l veiw hdyk comme ^parametres  */