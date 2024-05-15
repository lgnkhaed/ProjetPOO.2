package Controller;
import View.MyFrameView;
//import View.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControlmyFrame implements ActionListener{
     private MyFrameView frame ; 
  
    public ControlmyFrame(MyFrameView frame ){
        this.frame = frame; 
        JButton authentifierButton = frame.getAuthentifierButton();

         /* if (authentifierButton != null) {
			authentifierButton.addActionListener( new ActionListener() {
			  @Override
				public void actionPerformed(ActionEvent e ){ 
					
					LoginView frame2 = new LoginView();
					frame2.setVisible(true);	
                    frame.dispose();
				}
			});
		} */ 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
    
   // }

  



