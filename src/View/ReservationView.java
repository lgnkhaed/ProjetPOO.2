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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;

/* une vue pour l'administratuer , elle gere les reservations   */
public class ReservationView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();
    public Administrateur admin;
	private Hotel ht;

    

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
		JLabel lblNewLabel = new JLabel("Email du client  :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(26, 26, 109, 14);
		contentPane.add(lblNewLabel);
		
		//textField = new JTextField();
		textField.setBounds(145, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/* ce boutton ok sert a lancer une recherche pour voir si un resrv existe au nom du client */
	/* 	JButton btnNewButton_3 = new JButton("ok");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN,12));
		btnNewButton_3.setBounds(252, 24, 49, 23);
		contentPane.add(btnNewButton_3); */ 
		
		/*ici on afficher si la reserv existe ou nom (elle est pas encore au point a travailler )*/
	/* 	JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(26, 65,70, 14);
		contentPane.add(lblNewLabel_2);*/ 
		
		/* le numero de la chambre qu on veut reserver ou liberer */
		JLabel lblNewLabel_1 = new JLabel("Numéro de la chambre :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(26, 113, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		// textField_1 = new JTextField();
		textField_1.setBounds(160, 110, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		/* bouton pou reserver*/
		JButton btnNewButton = new JButton("Réserver ou refuser");
		btnNewButton.setBounds(46, 159, 160, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override  
			public void actionPerformed(ActionEvent eee){ 
				String email = textField.getText();
			    if(textField.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Veuillez l'adresse email du client   ");
				}else if(!EmailValide(email)){
					JOptionPane.showMessageDialog(null, "Veuillez entrer une adresse email valide  ");
				}else {
					Client cl1 = new Client(email, email, null, email, email, ht);
					cl1.setDemandeeffectue(false); 
				    Boolean clienttrouvee = false; 
				    for(Client client : ReservationView.this.getHotel().getlisteClients().values()){
					if(client.getEmailadress().equals(email)){
						clienttrouvee = true;
						cl1 = client;
						break;
					}
				}

				    if(cl1.getDemandeeffectue() == false ){
					JOptionPane.showMessageDialog(null, "Le client avec l'adresse mail  "+email+"  n'a pas fait une demande de réservation ");
				    }else{
                       Room room = null;
					   Boolean chambrelibre = false;
                       /* je cherche une chambre libre  */
					   for (Room rm : ReservationView.this.getHotel().getlisteRooms().values()){
						if(rm.getState().equals("free")){
							room = rm;
							chambrelibre = true;
							break;
						}
					   }
                    
					   if(chambrelibre == true){
						JOptionPane.showMessageDialog(null, "Le client avec l'adresse mail  "+cl1.getEmailadress()+" a réserver la chambre "+ room.getidroom());
                        room.Changestate();
						cl1.setDemandeeffectue(true);
					   }else{
						
						JOptionPane.showMessageDialog(null, "Nous vous prions de nous excuser, nous ne pouvons pas vous offrir une chambre car toutes les chambres sont réservées.");
					   }
				    }
			
			
				}
			
			} 
		});
		
		/*boutton pour decliner*/
	/*  	JButton btnNewButton_1 = new JButton("Décliner");
		btnNewButton_1.setBounds(46, 203, 89, 23);
		contentPane.add(btnNewButton_1); */ 
		
		/*bouton pour liberer*/
		JButton btnNewButton_2 = new JButton("Libérer");
		btnNewButton_2.setBounds(196, 203, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override  
			public void actionPerformed(ActionEvent eeee){
            
			try{
				Integer num = Integer.parseInt(textField_1.getText());
				String id = String.valueOf(num);
				if(textField_1.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Veuillez entrez la chambre que vous voulez libérer");
			    }else if( num <= 0){
				JOptionPane.showMessageDialog(null, "Veuillez entrez un id correct");
			    }else{
					
					Room rm = null;
					Boolean Chmbrtrouvee = false;
					for(Room room : ReservationView.this.getHotel().getlisteRooms().values()){
						if(room.getidroom().equals(id)){
							Chmbrtrouvee = true;
							rm = room;
							break;
						}
					}
			       
					if(Chmbrtrouvee==false){
						throw new ChambreInexistanteException();
								
					}else{
                        if(rm.getState().equals("free")){
							JOptionPane.showMessageDialog(null, "La chambre avec id " + id +" est déja libre");

						}else{
						   rm.setState("free");
						  JOptionPane.showMessageDialog(null, "La chambre avec id : " + id +" est libérée");

						}
                        
					}		
 				
				}
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Veuillez entrer des chiffres ");
			}catch(ChambreInexistanteException ee){
				JOptionPane.showMessageDialog(null, ee.getMessage());
			}
		}
		});
		
		
	}
 


  /* getter and setter for Hotel  */
  public Hotel getHotel(){
	return this.ht;
  }

  public void setHotel(Hotel hotel){
      this.ht=hotel;
  }


  
public Administrateur getAdmin(){
	return this.admin;
  }
  
  public void setAdmin(Administrateur admin){
	this.admin=admin;
  }
private boolean EmailValide(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

