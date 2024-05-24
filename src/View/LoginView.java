package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import Modele.*;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
/* login view deg 1  */
public class LoginView extends JFrame {



    private Hotel escapade; 
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    JPanel panel = new JPanel();
    private JTextField textField;
    private JPasswordField passwordField;
    JLabel lblLogin = new JLabel("AUTHENTIFICATION");
    JPanel panel_1 = new JPanel();
    JLabel lblNewLabel = new JLabel(" Email : ");
  
    JLabel lblNewLabel_1 = new JLabel("Mot de passe :");
    
    JButton btnNewButton = new JButton("Authentification");
  

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginView frame = new LoginView();
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
    public LoginView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // JPanel panel = new JPanel();
        panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel.setBackground(new Color(128, 128, 64));
        panel.setBounds(10, 11, 401, 50);
        contentPane.add(panel);
        panel.setLayout(null);

        //JLabel lblLogin = new JLabel("AUTHENTIFICATION");
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 27));
        lblLogin.setForeground(new Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setBounds(57, 9, 292, 29);
        panel.add(lblLogin);

         //JPanel panel_1 = new JPanel();
        panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_1.setBackground(new Color(128, 128, 64));
        panel_1.setBounds(10, 74, 401, 176);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        // JLabel lblNewLabel = new JLabel("Email: ");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(30, 23, 150, 14);
        panel_1.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(164, 20, 128, 20);
        panel_1.add(textField);
        textField.setColumns(10);

        // JLabel lblNewLabel_1 = new JLabel("Mot de passe :");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(71, 50, 95, 14);
        panel_1.add(lblNewLabel_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(164, 50, 128, 20);
        panel_1.add(passwordField);

       /* je vais ajouter un radio  button dans le login pour faore la diff entre l'administrateur et le Client   */
        JRadioButton Administrateur  = new JRadioButton("Administrateur");
        JRadioButton Client   = new JRadioButton("Client");
        Client.setBounds(220,90, 80, 14);
        Administrateur.setBounds(100, 90, 110, 14);
        ButtonGroup group = new ButtonGroup();
        group.add(Client);
        group.add(Administrateur);

        panel_1.add(Administrateur);
        panel_1.add(Client);

        /*c est ce boutton qui est important qui va permettre la connexion ici on va travailler*/
       // JButton btnNewButton = new JButton("Authentification");
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(146, 129, 130, 23);
        panel_1.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //  String nomUtilisateur = textField.getText();
               
               
                if (e.getSource()==btnNewButton ){ 
                    /* hna je dois ajouter un code pour verifier si le password et l'utilistaeur sont pas null est juste   */
                   
                   
                    if(Administrateur.isSelected()){ 
                        String Email = textField.getText();
                        String mdp = passwordField.getText();
                        HashMap<Integer, Administrateur> admins = LoginView.this.escapade.getlisteAdmini();
                        Boolean trouve = false; 
                             for (Administrateur admin : admins.values()) {
                                if (admin.getEmailadress().equals(Email) && admin.getMotdepasse().equals(mdp) ){
                                    AdministrateurView frame3 = new AdministrateurView(); 
                                    frame3.setNomUtilisateur(admin.getLastname()+" "+admin.getFirstname());
                                    frame3.setVisible(true);
                                    LoginView.this.dispose();
                                    trouve = true;   
                                    break;
                                }
                             }
                            
                             if(trouve == false ){
                                JOptionPane.showMessageDialog(null, "Email ou Mot de passe incorrect");
                             }                        

                    }else if ( Client.isSelected()){ 
                        
                        String Email2 = textField.getText();
                        String mdp2 = passwordField.getText();
                        HashMap<Integer, Client> clients = LoginView.this.escapade.getlisteClients();
                        Boolean trouvee = false;  
                        for (Client client : clients.values()){
                            
                            if (client.getEmailadress().equals(Email2) && client.getMotdepasse().equals(mdp2) ){
                                ClientView frame4 = new ClientView(); 
                                frame4.setNomUtilisateur(client.getLastname()+" "+client.getFirstname());
                                frame4.setVisible(true);
                                LoginView.this.dispose();
                                trouvee = true;   
                                frame4.setClient(client);
                                break;
                            }
                         }
                         if(trouvee == false ){
                            JOptionPane.showMessageDialog(null, "Email ou Mot de passe incorrect");
                         }                      
                    }else {
                        JOptionPane.showMessageDialog(null, "Veuillez choisir un type d'utilisateur");
                    }
                    
                }  
            }
        });
        
    }



    /* getter du Button  */
    public JButton getAuthentificationButton(){
      return btnNewButton;
    }
    /* Getter du hotel  */
		public Hotel getHotelforFrame(){
				return this.escapade;
		}
             
    /* Settet du Hotel */
       public void setHotelLog(Hotel htl){
        this.escapade = htl ; 
       }        
}
