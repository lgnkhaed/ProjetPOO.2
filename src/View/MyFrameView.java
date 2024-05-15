package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import Modele.*;

/***  la vue 1   ***/
public class MyFrameView extends JFrame {

	private Hotel ht; 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JButton Authentifier; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrameView frame = new MyFrameView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrameView() {
		/*arriere plan*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
       
       
       
        /*** je vais enlver un button et l'autre je vais le laisser pour prendre l'utilisateur de l'app vers Login page  */


        /* un button pour authentification */
        JButton Authentifier = new JButton("Authentifier ");   
        Authentifier.setBackground(new Color(255, 255, 255));	
		Authentifier.setBounds(121, 120, 190, 55);
		Authentifier.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		contentPane.add(Authentifier);
		
	 if (Authentifier != null) {
			Authentifier.addActionListener( new ActionListener() {
			  @Override
				public void actionPerformed(ActionEvent e ){ 
					
					LoginView frame2 = new LoginView();
					frame2.setVisible(true);	
					MyFrameView.this.dispose();

		            frame2.setHotelLog(MyFrameView.this.getHotelforFrame());
				}
			});
		}
		


        
		/*simple ecriture */
		JLabel lblNewLabel = new JLabel("Hotel l'Escapade");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 23));
		lblNewLabel.setBounds(56,20, 319, 32);
		contentPane.add(lblNewLabel);
		
	}
           /* Getter pour mon buuttton  */
           public  JButton getAuthentifierButton(){ 
            return Authentifier ;
            }
    
		/*getter et setter pour l'hotel  */ 
			public Hotel getHotelforFrame(){
				return this.ht;
			} 
		public void sethotel( Hotel htl ){
			this.ht= htl; 
		}	
        
}
