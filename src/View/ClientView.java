package View;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modele.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
/* une vue du client apres le Login   */
public class ClientView extends JFrame {
    private Hotel escapade; 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("Bienvenue ");
	JButton btnNewButton = new JButton("Réserver");

	JButton btnNewButton_1 = new JButton("Modifier");
	JButton btnNewButton_2 = new JButton("Annuler");
	JButton btnNewButton_1_1 = new JButton("Nettoyage ");




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientView frame = new ClientView();
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
	public ClientView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		  contentPane.setLayout(null);
		
		  //JLabel lblNewLabel = new JLabel("Bienvenue ");
		  lblNewLabel.setBounds(45, 11, 500  , 30);
	        lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.PLAIN,25));
	        contentPane.add(lblNewLabel);
	        
	        /* bouton pour ouvrir la fentre reserverclient  */
	        //JButton btnNewButton = new JButton("Réserver");
	        btnNewButton.setBounds(141, 63, 116, 31);
	        contentPane.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e1 ){
                 if (e1.getSource() == btnNewButton){
					/** instructions pour less views  */
					ReserverClientView frame8 = new ReserverClientView();
					frame8.setVisible(true);
				 }
				}
			});
	        
	        /******************* bouton pour ouvrir la fentre modifierclient  */
	       // JButton btnNewButton_1 = new JButton("Modifier");
	        btnNewButton_1.setBounds(141, 105, 116, 31);
	        contentPane.add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e2 ){
					if(e2.getSource() == btnNewButton_1){
						/* instructiuons for views */
						ModifierClientView frame9 = new ModifierClientView();
						frame9.setVisible(true);
					}
				}
			});
	        
	        /******************** bouton pour ouvrir la fentre annulerclient  */
	        //JButton btnNewButton_2 = new JButton("Annuler");
	        btnNewButton_2.setBounds(141, 198, 116, 31);
	        contentPane.add(btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e3){
					if(e3.getSource() == btnNewButton_2){
						/* lesq instructions pour views  */
						AnnulerClientView frame10 = new AnnulerClientView();
						frame10.setVisible(true);
					}
				}
			});
	        




	        /* ce boutton n ouvre pas de fentre mais crre une demande de nettoyage chezz l admin */
	        //JButton btnNewButton_1_1 = new JButton("Nettoyage ");
	        btnNewButton_1_1.setBounds(141, 156, 116, 31);
	        contentPane.add(btnNewButton_1_1);







	}
	/* cette methode est la pour afficher le nom de l adminstrateur qu il a entrer lors de l authentification 
	 * (ps elle est pas encore au point et elle est utiliser aussi pour le client ) */
    public void setNomUtilisateur(String nomUtilisateur) {
    	
		this.lblNewLabel.setText("Bienvenue " + nomUtilisateur);
    }

/*/ getter and setter for Hotel  */
      public Hotel getHotel(){ 
		return this.escapade; 
	  }  

	  public void setHotel (Hotel ht ){
		this.escapade=ht;
	  }

}
