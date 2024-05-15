import Controller.*;
import Modele.*;
import View.*;
import java.awt.EventQueue;
public class App {
    public static void main(String[] args) throws Exception {
      /* 
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFrameView frame = new MyFrameView();
                    new ControlmyFrame(frame);
                    frame.setVisible(true);
                    Hotel ht =  frame.getHotelforFrame();
                                        //System.out.println("bon l'admin est "+ ht.getlisteAdmini().get(1));             
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });*/
        MyFrameView frame = new MyFrameView();
                    new ControlmyFrame(frame);
                    frame.setVisible(true);
                    Hotel ht =  frame.getHotelforFrame();
        System.out.println("eyyyye"+ht.getCountAdministra());
 
    }
}
/* quand je cree une fenetre avec un Button lazm mm class control ta3ha n'extensiha w nmdlhja l veiw hdyk comme ^parametres  */