package View;
import java.awt.EventQueue;
import Modele.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;


/* une vue pour  le client, demande reservation    */

public class ReserverClientView extends JFrame {

	private static final long serialVersionUID = 1L;
	private Hotel ht;
	private Client client; 
	private JPanel contentPane;

	public JLabel lblnomutil= new JLabel();
	public JLabel lblNewLabel_4 = new JLabel("Début du séjour :");
	public JLabel lblNewLabel_4_1 = new JLabel("Fin du séjour :");

	public JLabel lblNewLabel_2 = new JLabel("Mois");
	public JLabel lblNewLabel_2_1 = new JLabel("Mois");
	public JLabel lblNewLabel_1 = new JLabel("Jour"); 
	public 	JLabel lblNewLabel_1_1 = new JLabel("Jour");
	public 	JLabel lblNewLabel_3 = new JLabel("Année");
	public 	JLabel lblNewLabel_3_1 = new JLabel("Année");
	private JComboBox<Integer> comboBox = new JComboBox<Integer>(); /* jour date debut  */
	private JComboBox<Mois> comboBox_1 = new JComboBox<Mois>(); /* mois date debut  */
	private JTextField textField_1 = new JTextField(); /* annne date debut  */
	
	JComboBox<Integer> comboBox_2 = new JComboBox<Integer>(); /* jour date fin  */
	JComboBox<Mois> comboBox_1_1 = new JComboBox<Mois>(); /* mois date fin  */
	private JTextField textField_2 = new JTextField(); /* annee fin  */

	/* getter and setter  */
/* date debut  */
public JComboBox<Integer> getJourdatedebut(){
	return this.comboBox;
}
public JComboBox<Mois> getMoisdatedebut(){
	return this.comboBox_1;
}

public JTextField getAnnedatedebut(){
	return this.textField_1;
}
/* date fin  */
public JComboBox<Integer> getJourdateFin(){
	return this.comboBox_2;
}

public JComboBox<Mois> getMoisdateFin(){
	return this.comboBox_1_1;
}


public JTextField getAnnedateFin(){
	return this.textField_2;
}
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReserverClientView frame = new ReserverClientView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 /* getter and setter for Client  */
	 public Client getClient(){
		return this.client;
	  }
	
	  public void setClient(Client clnt){
		  this.client=clnt;
	  }
	
	
	  /* getter and setter for Hotel  */
	  public Hotel getHotel(){
		return this.ht;
	  }
	
	  public void setHotel(Hotel hotel){
		  this.ht=hotel;
	  }
	/**
	 * Create the frame.
	 */
	public ReserverClientView() {
		setTitle("Gestion d'hotel"); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,200, 450, 300);
				contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		
		/* rentre la date de debut de la reservation*/
		
		lblNewLabel_4.setBounds(31, 69, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		
		lblnomutil.setBounds(31, 20, 250, 50);
		contentPane.add(lblnomutil);
		lblnomutil.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		
		lblNewLabel_1.setBounds(15, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		
		comboBox.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29, 30, 31}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(50, 90, 66, 22);
		contentPane.add(comboBox);
		
		
		comboBox_1.setModel(new DefaultComboBoxModel<Mois>(Mois.values()));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(155, 90, 110, 22);
		contentPane.add(comboBox_1);
		
	
		
		lblNewLabel_2.setBounds(125, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
		lblNewLabel_3.setBounds(280, 94, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		textField_1.setBounds(321, 91, 69, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		
		
		/*rentre la date du fin de resservation*/
		
		lblNewLabel_4_1.setBounds(31, 121, 113, 14);
		contentPane.add(lblNewLabel_4_1);
		
		
		
	
		
		lblNewLabel_1_1.setBounds(15, 146, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		
		
		comboBox_2.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29, 30, 31}));
		comboBox_2.setSelectedIndex(1);
		comboBox_2.setBounds(50, 142, 66, 22);
		contentPane.add(comboBox_2);
		
			
		lblNewLabel_2_1.setBounds(125, 146, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		
		comboBox_1_1.setModel(new DefaultComboBoxModel<Mois>(Mois.values()));
		comboBox_1_1.setSelectedIndex(1);
		comboBox_1_1.setBounds(155, 142, 110, 22);
		contentPane.add(comboBox_1_1);
		
		
		
		lblNewLabel_3_1.setBounds(280, 146, 46, 14);
		contentPane.add(lblNewLabel_3_1);

		textField_2.setColumns(10);
		textField_2.setBounds(321, 143, 69, 20);
		contentPane.add(textField_2);
		
		
	    //********hadi decor berk ***********
		JCheckBox chckbxNewCheckBox = new JCheckBox("J'ai lu et j'accepte les termes et conditions de réservation de l'hotel.");
		chckbxNewCheckBox.setFont(new Font("Helvetica Neue", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(31, 185, 368, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		
		
		/* boutton pour confirmer c lui qui valide*/
		JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.setBounds(155, 215, 113, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e){
               if(chckbxNewCheckBox.isSelected()){
                 try {
					// Reservation Reserv = new Reservation(ReserverClientView.this.getHotel(), ReserverClientView.this.getClient(),Date(comboBox.getSelectedItem() ,ReserverClientView.this.comboBox_1.getSelectedItem(),Integer.parseInt(ReserverClientView.this.textField_1.getText())) ,Date(ReserverClientView.this.comboBox_2.getSelectedItem() ,ReserverClientView.this.comboBox_1_1.getSelectedItem(),Integer.parseInt(ReserverClientView.this.textField_2.getText())));
	                Integer jourdatedebut = (Integer) ReserverClientView.this.getJourdatedebut().getSelectedItem();
					Integer anneedatedebut = (Integer) Integer.parseInt(ReserverClientView.this.getAnnedatedebut().getText());
					Mois moisdatedebut = (Mois) ReserverClientView.this.getMoisdatedebut().getSelectedItem();
					
					Integer jourdateFin =(Integer) ReserverClientView.this.getJourdateFin().getSelectedItem(); 
					Integer anneedateFin = Integer.parseInt(ReserverClientView.this.getAnnedateFin().getText());
					Mois moisdateFin = (Mois) ReserverClientView.this.getMoisdateFin().getSelectedItem();
					
					Date datedebut = Datem(jourdatedebut,moisdatedebut,anneedatedebut);
					Date datefin =  Datem(jourdateFin ,moisdateFin,anneedateFin);
				
					if(anneedatedebut  > anneedateFin )
                    {
                        throw new DateInvalidException();
                    }

                    if(test(anneedateFin, anneedateFin)){
                        if(Moisnbrs(moisdatedebut)>Moisnbrs(moisdateFin))
                        throw new DateInvalidException();
                    }

                    if(test(anneedateFin, anneedateFin)){
                        if(test(Moisnbrs(moisdatedebut),Moisnbrs(moisdateFin)))
                        {
                            if(jourdatedebut>jourdateFin)
                            {throw new DateInvalidException();}
                        }

                    }
					JOptionPane.showMessageDialog(null, "Votre demande de réservation a été efféctué " );
					ReserverClientView.this.getClient().setDemandeeffectue(true);
					ReserverClientView.this.getClient().DemandeReservation(ReserverClientView.this.getHotel(), datedebut ,datefin);	

				
				}catch( NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Veuillez entrer une date correcte. ");
				 } catch (DateInvalidException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}  
				
				}else{
				  JOptionPane.showMessageDialog(null, "Veuillez accepter les termes et les conditions d'utilisation");
			   }
			}

			private Date Datem(Integer jourdatedebut, Mois moisdatedebut, Integer anneedatedebut) {
				Date date = new Date(jourdatedebut, moisdatedebut, anneedatedebut);
				return date;
			}

			private Integer Moisnbrs(Mois mois){
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
			
		});
	}
	     public boolean test (int a, int b)
	     {
		if(a == b)
		{
		return true;
		}else {
			return false;
		}
	    }
		public void setNomUtilisateur(String nomUtilisateur) {
    	
			this.lblnomutil.setText( nomUtilisateur);
		}
	

	}



/* il faut faire  les getter de tous les text field et les comboboxs and work with them   */