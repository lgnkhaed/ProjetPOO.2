import Controller.*;
import Modele.*;
import View.*;
import java.awt.EventQueue;
public class App {
    public static void main(String[] args) throws Exception {
        Hotel ht = new Hotel(); 
        Administrateur admin1 = new Administrateur(ht,"khaled" ,"laggoun", 20, "khaled", "123");
        Client client1 = new Client("hamiti", "amine", 20,"amine", "hhhh", ht);
        Client clienth = new Client("ouadahi", "kad", 20,"kad", "haha", ht);
        Room room1 = new Room(ht,1);
        Room room2 = new Room(ht,2);
        Room room3 = new Room(ht,3);
        Room room4 = new Room(ht,4);
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