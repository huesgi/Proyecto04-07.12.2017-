package Principal;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Ventanas.Login;

public class Principal extends JFrame {
	public Principal() {
	}

	
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();						//aqui lo que hacemos es enlazar con la ventana LOGIN
					frame.setVisible(true);							// hacemos visible la ventana
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	}
