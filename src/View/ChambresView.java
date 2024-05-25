package View;
import Modele.*;
import java.awt.EventQueue;
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

import javax.swing.JButton;
/* la vue de la chambre deg 1  */
/* Only Obj de type Administrateur peut acceder a cette vue  */
public class ChambresView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JButton btnNewButton_4;
	private Hotel ht;
    private Administrateur admin; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChambresView frame = new ChambresView();
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
	public ChambresView() {
		
		/*********** c sur ces classes qu il y aura le plus de travail ************/
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Numéro de la chambre :");
		lblNewLabel_3.setBounds(45, 39, 151, 14);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		/*c le numero de la chambre qu on voudra faire les op sur */
		/* on rentre le num de la chambre attention on doit utiliser exception pour pouvoir entreer que des nombres*/
		textField = new JTextField();
		textField.setBounds(195, 37, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/*partie creation*/
		/*button qui cree la chambres tjr utiliser les excptions qui vont avec exp si la chambre existe */
		btnNewButton = new JButton("Créer");
		btnNewButton.setBounds(10, 85, 103, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
              try{
                if(textField.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Veuillez entre le id de la chambre pour la créer");
				
				}else if(Integer.parseInt(textField.getText()) <= 0 ){
					JOptionPane.showMessageDialog(null, "Veuillez introduire un numéro positif ");
				}else{
					Integer num = Integer.parseInt(textField.getText()); 
                      String id = String.valueOf(num);
					  Boolean rmExiste = false;
                    for (Room rm : ChambresView.this.getHotel().getlisteRooms().values()){
                      if(rm.getidroom().equals(id)){
						rmExiste = true;
						break;
				       }
					}
					
					if(rmExiste){
						throw new ChambreDejaExistanteException();
					}else{
					   
					    ChambresView.this.getAdmin().Newroom(ChambresView.this.getHotel(),num);
					 JOptionPane.showMessageDialog(null, "Chambres bien créee ");
				      }
			       }
			    
		
			  }catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(null, "Veuillez introduire des chiffres ");
			  }catch(ChambreDejaExistanteException ex2){
                JOptionPane.showMessageDialog(null, ex2.getMessage());
			  }
			}
		});
		
		/* partie modification */
		/*ce button va pas modifier directemnt il va ouvrir les prametres de la modification */
		/* btnNewButton_1 = new JButton("Modifier");
		btnNewButton_1.setBounds(10, 127, 103, 23);
		contentPane.add(btnNewButton_1);
		*/ 

		/* ici rentre le nv nom de la chambre */
		/*lblNewLabel = new JLabel("Nouveau num :");
		lblNewLabel.setBounds(123, 131, 89, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 128, 54, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		*/
		/* ici la confirmation */
		
		/* 
		btnNewButton_4 = new JButton("Confirmer");
		btnNewButton_4.setBounds(307, 127, 99, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			}
		});
		
		*/
		
		/*partie suppression*/
		/* ici la suppression de la chambre*/
		btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.setBounds(10, 195, 103, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					if(textField.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Veuillez entre le id de la chambre pour la supprimer ");
					
					}else if(Integer.parseInt(textField.getText()) <= 0 ){
						JOptionPane.showMessageDialog(null, "Veuillez introduire un id correct ");
					}else{
						Integer num = Integer.parseInt(textField.getText());
                        String id = String.valueOf(num);
						Room rm = null;
					    Boolean roomexiste = false; 
						for(Room room : ChambresView.this.getHotel().getlisteRooms().values()){
							if(room.getidroom().equals(id)){
								roomexiste=true;
								rm = room ;
								break;
							}
						}

						if(roomexiste){
							ChambresView.this.getHotel().getlisteRooms().remove(rm.getNumber());
							JOptionPane.showMessageDialog(null, "La chambre avec le id "+rm.getidroom()+" est supprimée ");
						}else{
							JOptionPane.showMessageDialog(null, "La chambre avec le id "+ id +" n'existe pas  ");
						}
					}
				}
                  catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Veuillez introduire des chiffres ");
				 }
			}
		});
	
		
		/*partie nettoyage (a rajouter dans les classes comme booleans)*/ 
		/* operation en plus pour nettoyer la chambre quand le client le demandera */
		 /* btnNewButton_3 = new JButton("Nettoyer ");
		btnNewButton_3.setBounds(10, 161, 103, 23);
		contentPane.add(btnNewButton_3); */ 
	}
	
	
	/* getter and setter for Hotel  */
public Hotel getHotel(){ 
	return this.ht; 
	}  
  
	public void setHotel (Hotel ht ){
	this.ht=ht;
	}
  
	public Administrateur getAdmin(){
		return this.admin;
	  }
	  
	  public void setAdmin(Administrateur admin){
		this.admin=admin;
	  }
	  
}
