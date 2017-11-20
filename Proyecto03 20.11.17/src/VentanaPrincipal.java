import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//aqui creo el jugador
		
		
		Jugador playerOne=new Jugador();
		//aqui cojo lo programado en el proyecto JUGADOR y definido como "Nombre"
		playerOne.setNombre("Hugon");
		//aqui cojo lo programado en el proyecto JUGADOR y definido como "PrimerApellido"
		playerOne.setPrimerApellido("Espejel");
		//aqui cojo lo programado en el proyecto JUGADOR y definido como "SegundoApellido"
		playerOne.setSegundoApellido("Gil");
		//aqui cojo lo programado en el proyecto JUGADOR y definido como "Edad"
		playerOne.setEdad(15);
		System.out.println(playerOne.toString());
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
