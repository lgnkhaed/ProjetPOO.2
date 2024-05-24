package View;
import Modele.*; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignInView extends JFrame {
    private Hotel escapade; 

    /* the getter and setter for Hotel */
    public Hotel getHotel(){
        return this.escapade;
    }


    private static final long serialVersionUID = 1L;
    private JPanel contentPane2;
    JPanel panel2 = new JPanel();
    JLabel lblsignin  = new JLabel("Sign in "); 
    JPanel panel21 = new JPanel(); 
    JLabel lblNom = new JLabel("Nom  : ");
    JLabel lblprenom = new JLabel("Prénom  : ");
    JLabel lblAge = new JLabel("Age  : ");
    JLabel lblEmail = new JLabel("Email  : ");
    JLabel lblMotdepasse  = new JLabel("Mot de passe :");
    private JTextField textFieldNom;
    private JTextField textFieldPrenom;
    private JTextField textFieldEmail;
    private JTextField textFieldAge; 
    private JPasswordField Passowrd; 
    private JButton submit = new JButton("Sign in "); 


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                     SignInView frame = new SignInView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    /* constructor  */
    public SignInView(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane2 = new JPanel();
        contentPane2.setBackground(new Color(128, 128, 0));
        contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane2);
        contentPane2.setLayout(null);

        panel2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel2.setBackground(new Color(128, 128, 64));
        panel2.setBounds(10, 11, 401, 50);
        contentPane2.add(panel2);
        panel2.setLayout(null); 

        /* SIGN in affichage */
        lblsignin.setFont(new Font("Tahoma", Font.BOLD, 27));
        lblsignin.setForeground(new Color(255, 255, 255));
        lblsignin.setHorizontalAlignment(SwingConstants.CENTER);
        lblsignin.setBounds(57, 9, 292, 29);
        panel2.add(lblsignin);

        panel21.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel21.setBackground(new Color(128, 128, 64));
        panel21.setBounds(10, 74, 401, 176);
        contentPane2.add(panel21);
        panel21.setLayout(null);


      /* Nom  */
        lblNom.setForeground(new Color(255, 255, 255));
       // lblNom.setHorizontalAlignment(SwingConstants.CENTER);
        lblNom.setBounds(10, 20, 150, 14);
         panel21.add(lblNom);
      
        textFieldNom = new JTextField();
        textFieldNom.setBounds(55, 20, 110, 20);
        panel21.add(textFieldNom);
        textFieldNom.setColumns(10);
       
      /* prénom  */

        lblprenom.setForeground(new Color(255, 255, 255));
         // lblprenom.setHorizontalAlignment(SwingConstants.CENTER);
         lblprenom.setBounds(185, 20, 120, 14);
         panel21.add(lblprenom);
  
         textFieldPrenom = new JTextField();
         textFieldPrenom.setBounds(265, 20, 110, 20);
         panel21.add(textFieldPrenom);
         textFieldPrenom.setColumns(10);
        
         /* email  */

         lblEmail.setForeground(new Color(255, 255, 255));
         // lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
         lblEmail.setBounds(10, 60, 120, 14);
         panel21.add(lblEmail);
  
         textFieldEmail = new JTextField();
         textFieldEmail.setBounds(55, 60, 110, 20);
         panel21.add(textFieldEmail);
         textFieldEmail.setColumns(10);

         /* Age  */
         /* Don't forget to fix the exception of the age input in case if it's wrong  */
         lblAge.setForeground(new Color(255, 255, 255));
         // lblAge.setHorizontalAlignment(SwingConstants.CENTER);
         lblAge.setBounds  (10, 100, 120, 14);
         panel21.add(lblAge);
       
         textFieldAge = new JTextField();
         textFieldAge.setBounds(55, 100, 110, 20);
         panel21.add(textFieldAge);
         textFieldAge.setColumns(10);

        /* mote de passe  */
        
        lblMotdepasse.setForeground(new Color(255, 255, 255));
        // lblMotdepasse.setHorizontalAlignment(SwingConstants.CENTER);
         lblMotdepasse.setBounds(180, 60, 120, 14);
         panel21.add(lblMotdepasse);
 
         Passowrd = new JPasswordField();
         Passowrd.setBounds(265, 60, 110, 20);
         panel21.add(Passowrd);
         Passowrd.setColumns(10);

         /* je vais ajouter un radio  button dans le Sign aussi  pour faore la diff entre l'administrateur et le Client   */
        JRadioButton Administrateur  = new JRadioButton("Administrateur");
        JRadioButton Client   = new JRadioButton("Client");
        Client.setBounds(305,105, 80, 14);
        Administrateur.setBounds(185, 105, 110, 14);
        ButtonGroup group = new ButtonGroup();
        group.add(Client);
        group.add(Administrateur);

        panel21.add(Administrateur);
        panel21.add(Client);
        
        
        
        /* Button submit  */ /* ici il y aurra l'action du submit  */
        submit.setBackground(new Color(255, 255, 255));
        submit.setBounds(125, 140, 130, 23);
        panel21.add(submit);

        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            
            if(e.getSource() == submit ){
                try {
                   if(Administrateur.isSelected()){
                     Administrateur  admin = new Administrateur(SignInView.this.getHotel(), textFieldNom.getText(), textFieldPrenom.getText() , Integer.parseInt(textFieldAge.getText()) , textFieldEmail.getText(), Passowrd.getText()); 
                      LoginView login = new LoginView();
                      login.setVisible(true);
                      login.setHotelLog(SignInView.this.escapade);
                      SignInView.this.dispose(); 

                    }else if (Client.isSelected()){
                     Client clnt = new Client(textFieldNom.getText(), textFieldPrenom.getText(), Integer.parseInt(textFieldAge.getText()), textFieldEmail.getText(), Passowrd.getText(),SignInView.this.getHotel());
                     LoginView login = new LoginView();
                     login.setVisible(true);
                     login.setHotelLog(SignInView.this.escapade);
                     SignInView.this.dispose(); 
                    
                    }else{
                        JOptionPane.showMessageDialog(null, "Veuillez sélectionner un rôle.");
                    } 
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer un âge valide.");
                }
            }
            }
        });


    }


        /* setter of the hotel  */
        
        public void setHotelSign(Hotel htl){
            this.escapade = htl ; 
           }        


}
