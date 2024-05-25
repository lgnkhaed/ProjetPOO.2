package View;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import Modele.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/* la vue pour le client deg  2 */
public class AnnulerClientView extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// private JTextField textField;
	private Hotel ht; 
	private Client client; 
	public JLabel lblNOmClient = new JLabel(); 
	public JLabel lblNewLabel1 = new JLabel("Nom :"); 
	public JLabel lblAnnulerMaRservation = new JLabel("Annuler ma réservation ");
	public JButton btnNewButton = new JButton("Confirmer");
	public JCheckBox chckbxNewCheckBox = new JCheckBox("J'ai lu et j'accepte les termes et conditions de réservation de l'hotel.");
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnnulerClientView frame = new AnnulerClientView();
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
	public AnnulerClientView() {
setTitle("Gestion d'hotel"); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,200, 450, 300);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*simple titre*/
		//JLabel lblAnnulerMaRservation = new JLabel("Annuler ma réservation ");
		lblAnnulerMaRservation.setBounds(40, 21, 271, 26);
		lblAnnulerMaRservation.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		contentPane.add(lblAnnulerMaRservation);
		
		
		/* rentre le nom de la reservation */
		// JLabel lblNewLabel1 = new JLabel("Nom :");
	/* 	lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel1.setBounds(39, 73, 46, 14);
		contentPane.add(lblNewLabel1);*/
		
		/*textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 72, 86, 20);
		contentPane.add(textField);*/
		 
		//********hadi decor berk ***********
		//JCheckBox chckbxNewCheckBox = new JCheckBox("J'ai lu et j'accepte les termes et conditions de réservation de l'hotel.");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(33, 156, 368, 23);
		contentPane.add(chckbxNewCheckBox);
		
		/* le boutton qui va annuler la reservation */
		//JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.setBounds(172, 209, 105, 23);
		contentPane.add(btnNewButton);
		
	 	btnNewButton.addActionListener(new ActionListener() {
		
			@Override
		public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox.isSelected()){	
				
				if(AnnulerClientView.this.getClient().getDemandeeffectue() == false){
					JOptionPane.showMessageDialog(null, "Aucune Réservation trouvée " );
			   }else{
				   AnnulerClientView.this.getClient().setDemandeeffectue(false);
				   JOptionPane.showMessageDialog(null, "Réservation Annulée " );
			   }
			}else{
				JOptionPane.showMessageDialog(null, "Vous devez accepter les conditions " );
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
  public void setNomUtilisateur(String nomUtilisateur) {
    	
	this.lblNOmClient.setText( nomUtilisateur);
}
}


