package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Modele.*;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/* la vue pour le client deg  2 */
public class AnnulerClientView extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Hotel ht; 
	private Client client; 
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*simple titre*/
		JLabel lblAnnulerMaRservation = new JLabel("Annuler ma réservation ");
		lblAnnulerMaRservation.setBounds(40, 21, 271, 26);
		lblAnnulerMaRservation.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		contentPane.add(lblAnnulerMaRservation);
		
		/* rentre le nom de la reservation */
		JLabel lblNewLabel1 = new JLabel("Nom :");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel1.setBounds(39, 73, 46, 14);
		contentPane.add(lblNewLabel1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 72, 86, 20);
		contentPane.add(textField);
		
		/* le boutton qui va annuler la reservation */
		JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.setBounds(172, 209, 105, 23);
		contentPane.add(btnNewButton);
		

		//********hadi decor berk ***********
		JCheckBox chckbxNewCheckBox = new JCheckBox("J'ai lu et j'accepte les termes et conditions de réservation de l'hotel.");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(33, 156, 368, 23);
		contentPane.add(chckbxNewCheckBox);
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

}


