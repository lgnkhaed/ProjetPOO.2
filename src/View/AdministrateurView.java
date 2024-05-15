package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** La vue que l'Administrateur aurrait  apres avoir connecte   */
public class AdministrateurView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JButton btnNewButton_1 = new JButton("Chambres");
    JButton btnNewButton = new JButton("Réservations");
    JLabel lblNewLabel = new JLabel("Bienvenue ");
    
    
    
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdministrateurView frame = new AdministrateurView();
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
    public AdministrateurView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        /* l adminstrateur choisi ici le button chambre pour acceder a la fentre chambres*/
        //JButton btnNewButton_1 = new JButton("Chambres");
        btnNewButton_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
        btnNewButton_1.setBounds(253, 130, 135, 23);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ee){ 
               if(ee.getSource() == btnNewButton_1 ){
                 ChambresView ChambPouAdmin = new ChambresView(); 
                 ChambPouAdmin.setVisible(true);
                 /* la meme chose on ferme pas la fenetre  */
               }
            }
        });
        
       
        /* button pour acceder a la fenetre de gerer les reservation*/
        //JButton btnNewButton = new JButton("Réservations");
        btnNewButton.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
        btnNewButton.setBounds(56, 130, 146, 23);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e ) { 
              if(e.getSource()==btnNewButton){
                ReservationView frame6 = new ReservationView();
                frame6.setVisible(true);
                /* ici on  ferme pas la fenetre d'Administrateur  */
              }
            }
        });




       /* l'affichage du bienvenue   */
        //JLabel lblNewLabel = new JLabel("Bienvenue ");
        lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 25));
        lblNewLabel.setBounds(50, 35, 500, 31);
        contentPane.add(lblNewLabel);
    }
    
    
    
    // constructeur jsp si obliger a revoir // // NOn amine pas obligeee Pas d'utilisateur dertha abstract la classse hdyk // 
    public AdministrateurView(String nomUtilisateur) {
		// TODO Auto-generated constructor stub
	}

	/* cette methode est la pour afficher le nom de l adminstrateur qu il a entrer lors de l authentification 
	 * (ps elle est pas encore au point et elle est utiliser aussi pour le client ) */
    /**
     * 
     */
    public void setNomUtilisateur(String nomUtilisateur) {
		this.lblNewLabel.setText("Bienvenue " + nomUtilisateur);
    }
}
