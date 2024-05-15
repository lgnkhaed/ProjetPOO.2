package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

/* une vue pour l'administratuer , elle gere les reservations   */
public class ReservationView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationView frame = new ReservationView();
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
	public ReservationView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* il s agit du nom de cleint avec le quel il a fait la reservation pour trouver sa demande*/
		JLabel lblNewLabel = new JLabel("Nom du client :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(26, 26, 109, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(145, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/* ce boutton ok sert a lancer une recherche pour voir si un resrv existe au nom du client */
		JButton btnNewButton_3 = new JButton("ok");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN,12));
		btnNewButton_3.setBounds(252, 24, 49, 23);
		contentPane.add(btnNewButton_3);
		
		/*ici on afficher si la reserv existe ou nom (elle est pas encore au point a travailler )*/
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(26, 65,70, 14);
		contentPane.add(lblNewLabel_2);
		
		/* le numero de la chambre qu on veut reserver ou liberer */
		JLabel lblNewLabel_1 = new JLabel("Numéro de la chambre :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(26, 113, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 110, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		/* bouton pou reserver*/
		JButton btnNewButton = new JButton("Réserver");
		btnNewButton.setBounds(46, 159, 89, 23);
		contentPane.add(btnNewButton);
		
		/*boutton pour decliner*/
		JButton btnNewButton_1 = new JButton("Décliner");
		btnNewButton_1.setBounds(46, 203, 89, 23);
		contentPane.add(btnNewButton_1);
		
		/*bouton pour liberer*/
		JButton btnNewButton_2 = new JButton("Libérer");
		btnNewButton_2.setBounds(196, 203, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
	}

}

