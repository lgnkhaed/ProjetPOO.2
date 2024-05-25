package View;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modele.*;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* une vue pour le client ou il peut modifier sa reservation    ***/
public class ModifierClientView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// private JTextField textField_2;
    private Hotel ht; 
	private Client client; 
	public JLabel lblnomclient = new JLabel();
	/* date debut  */
	public JComboBox<Integer> comboBox = new JComboBox<Integer>(); /* jour date debut */
	public JComboBox<Mois> comboBox_1 = new JComboBox<Mois>(); /* mois dae debut  */
	public  JTextField textField_1; /* annee date debut  */



	/* date fin  */
	public JComboBox<Integer> comboBox_2 = new JComboBox<Integer>(); /* jour date fin  */
	public JComboBox<Mois> comboBox_1_1 = new JComboBox<Mois>();
	public  JTextField textField =  new JTextField();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierClientView frame = new ModifierClientView();
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
	public ModifierClientView() {
		setTitle("Gestion d'hotel"); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,200, 450, 300);
			contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*simple ecriture*/
		JLabel lblNewLabel = new JLabel("Modifer ma réservation ");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel.setBounds(44, 11, 267, 26);
		contentPane.add(lblNewLabel);
		

		lblnomclient.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblnomclient.setBounds(44, 50, 267, 26);
		contentPane.add(lblnomclient);


		
		
		/* rentre date du debut du sejour*/
		JLabel lblNewLabel_4 = new JLabel("Début du séjour :");
		lblNewLabel_4.setBounds(31, 84, 113, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_1 = new JLabel("Jour");
		lblNewLabel_1.setBounds(31, 113, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		// JComboBox<Integer> comboBox = new JComboBox<Integer>();
		comboBox.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29, 30, 31}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(60, 109, 66, 22);
		contentPane.add(comboBox);
		
		// JComboBox<Mois> comboBox_1 = new JComboBox<Mois>();
		comboBox_1.setModel(new DefaultComboBoxModel<Mois>(Mois.values()));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(155, 109, 110, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mois");
		lblNewLabel_2.setBounds(125, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Année");
		lblNewLabel_3.setBounds(265, 113, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(309, 110, 60, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		/* rentre date de fin de sejour*/
		JLabel lblNewLabel_4_1 = new JLabel("Fin du séjour :");
		lblNewLabel_4_1.setBounds(31, 150, 113, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Jour");
		lblNewLabel_1_1.setBounds(31, 175, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		// JComboBox<Integer> comboBox_2 = new JComboBox<Integer>();
		comboBox_2.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29, 30, 31}));
		comboBox_2.setSelectedIndex(1);
		comboBox_2.setBounds(60, 171, 66, 22);
		contentPane.add(comboBox_2);

		JLabel lblNewLabel_2_1 = new JLabel("Mois");
		lblNewLabel_2_1.setBounds(125, 175, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		
		// JComboBox<Mois> comboBox_1_1 = new JComboBox<Mois>();
		comboBox_1_1.setModel(new DefaultComboBoxModel<Mois>(Mois.values()));
		comboBox_1_1.setSelectedIndex(1);
		comboBox_1_1.setBounds(155, 171, 110, 22);
		contentPane.add(comboBox_1_1);
		
		
		JLabel lblNewLabel_3_1 = new JLabel("Année");
		lblNewLabel_3_1.setBounds(265, 175, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		// textField = new JTextField();
		textField.setBounds(309, 172, 66, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		/*bouton pour appliquer la modif*/
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setBounds(155, 215, 113, 23);
		contentPane.add(btnNewButton);
	
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e){
               try {
					// Reservation Reserv = new Reservation(ReserverClientView.this.getHotel(), ReserverClientView.this.getClient(),Date(comboBox.getSelectedItem() ,ReserverClientView.this.comboBox_1.getSelectedItem(),Integer.parseInt(ReserverClientView.this.textField_1.getText())) ,Date(ReserverClientView.this.comboBox_2.getSelectedItem() ,ReserverClientView.this.comboBox_1_1.getSelectedItem(),Integer.parseInt(ReserverClientView.this.textField_2.getText())));
	                Integer jourdatedebut = (Integer) ModifierClientView.this.comboBox.getSelectedItem();
					Integer anneedatedebut = (Integer) Integer.parseInt(ModifierClientView.this.textField_1.getText());
					Mois moisdatedebut = (Mois) ModifierClientView.this.comboBox_1.getSelectedItem();
					
					Integer jourdateFin =(Integer) ModifierClientView.this.comboBox_2.getSelectedItem(); 
					Integer anneedateFin = Integer.parseInt(ModifierClientView.this.textField.getText());
					Mois moisdateFin = (Mois) ModifierClientView.this.comboBox_1_1.getSelectedItem();
					
					// Date datedebut = Datem(jourdatedebut,moisdatedebut,anneedatedebut);
					// Date datefin =  Datem(jourdateFin ,moisdateFin,anneedateFin);
				
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
					if(ModifierClientView.this.getClient().getDemandeeffectue() == true)
					JOptionPane.showMessageDialog(null, "Votre modification a été efféctuée " );	
                    else{
						JOptionPane.showMessageDialog(null, "Aucune demande de réservation trouvée  " );
					}
				
				}catch( NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Veuillez entrer une date correcte. ");
				 } catch (DateInvalidException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}  
			}
		});
	}
		/* private Date Datem(Integer jourdatedebut, Mois moisdatedebut, Integer anneedatedebut) {
			Date date = new Date(jourdatedebut, moisdatedebut, anneedatedebut);
			return date;
		}*/

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
  
      public boolean test (int a, int b){
       if(a == b){
            return true;
           }else {
	            return false;
                     }
       }
    public void setNomUtilisateur(String nomUtilisateur) {
    	
		this.lblnomclient.setText( nomUtilisateur);
	}

}