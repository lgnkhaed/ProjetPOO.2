package View;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
/* une vue pour  le client, demande reservation    */
public class ReserverClientView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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

	/**
	 * Create the frame.
	 */
	public ReserverClientView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* il rentre le nom pour la reservation*/
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(51, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(107, 32, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/* rentre la date de debut de la reservation*/
		JLabel lblNewLabel_4 = new JLabel("Début du séjour :");
		lblNewLabel_4.setBounds(31, 69, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Jour");
		lblNewLabel_1.setBounds(31, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(67, 90, 40, 22);
		contentPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"}));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(169, 90, 86, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mois");
		lblNewLabel_2.setBounds(125, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Année");
		lblNewLabel_3.setBounds(265, 94, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(321, 91, 69, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		
		/*rentre la date du fin de resservation*/
		JLabel lblNewLabel_4_1 = new JLabel("Fin du séjour :");
		lblNewLabel_4_1.setBounds(31, 121, 113, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Jour");
		lblNewLabel_1_1.setBounds(31, 146, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setSelectedIndex(1);
		comboBox_2.setBounds(67, 142, 40, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mois");
		lblNewLabel_2_1.setBounds(125, 146, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox<String> comboBox_1_1 = new JComboBox<String>();
		comboBox_1_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"}));
		comboBox_1_1.setSelectedIndex(1);
		comboBox_1_1.setBounds(169, 142, 86, 22);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Année");
		lblNewLabel_3_1.setBounds(265, 146, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(321, 143, 69, 20);
		contentPane.add(textField_2);
		
		
		
		
		
		
		/* boutton pour confirmer c lui qui valide*/
		JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.setBounds(155, 215, 113, 23);
		contentPane.add(btnNewButton);
		
		//********hadi decor berk ***********
		JCheckBox chckbxNewCheckBox = new JCheckBox("J'ai lu et j'accepte les termes et conditions de réservation de l'hotel.");
		chckbxNewCheckBox.setFont(new Font("Helvetica Neue", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(31, 185, 368, 23);
		contentPane.add(chckbxNewCheckBox);
	}
}
