package View;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modele.Client;
import Modele.Hotel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

/* une vue pour le client ou il peut modifier sa reservation    ***/
public class ModifierClientView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
    private Hotel ht; 
	private Client client; 
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*simple ecriture*/
		JLabel lblNewLabel = new JLabel("Modifer ma réservation ");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel.setBounds(44, 11, 267, 26);
		contentPane.add(lblNewLabel);
		
		/*rentre le nom de la reservation*/
		JLabel lblNewLabel1 = new JLabel("Nom :");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel1.setBounds(54, 48, 46, 14);
		contentPane.add(lblNewLabel1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 48, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		/* rentre date du debut du sejour*/
		JLabel lblNewLabel_4 = new JLabel("Début du séjour :");
		lblNewLabel_4.setBounds(31, 84, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Jour");
		lblNewLabel_1.setBounds(31, 113, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(67, 109, 40, 22);
		contentPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"}));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(169, 109, 86, 22);
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
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setSelectedIndex(1);
		comboBox_2.setBounds(67, 171, 40, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mois");
		lblNewLabel_2_1.setBounds(125, 175, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox<String> comboBox_1_1 = new JComboBox<String>();
		comboBox_1_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"}));
		comboBox_1_1.setSelectedIndex(1);
		comboBox_1_1.setBounds(169, 171, 86, 22);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Année");
		lblNewLabel_3_1.setBounds(265, 175, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		
		textField = new JTextField();
		textField.setBounds(309, 172, 66, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		/*bouton pour appliquer la modif*/
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setBounds(155, 215, 113, 23);
		contentPane.add(btnNewButton);
	
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
