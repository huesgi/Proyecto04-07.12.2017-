import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNOMBRE;
	private JTextField textFieldAPELLIDO1;
	private JTextField textFieldAPELLIDO2;
	private JTextField textFieldEDAD;
	private JTextField textFieldINFORMACION;

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
		setBounds(100, 100, 618, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTITULO = new JLabel("DATOS DEL JUGADOR");
		labelTITULO.setHorizontalAlignment(SwingConstants.CENTER);
		labelTITULO.setForeground(Color.BLACK);
		labelTITULO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelTITULO.setBounds(199, 24, 215, 42);
		contentPane.add(labelTITULO);
		
		JLabel labelNOMBRE = new JLabel("NOMBRE");
		labelNOMBRE.setHorizontalAlignment(SwingConstants.CENTER);
		labelNOMBRE.setBounds(32, 83, 57, 27);
		contentPane.add(labelNOMBRE);
		
		textFieldNOMBRE = new JTextField();
		textFieldNOMBRE.setBounds(126, 83, 430, 33);
		contentPane.add(textFieldNOMBRE);
		textFieldNOMBRE.setColumns(10);
		
		JLabel labelAPELLIDO1 = new JLabel("APELLIDO 1");
		labelAPELLIDO1.setHorizontalAlignment(SwingConstants.CENTER);
		labelAPELLIDO1.setBounds(21, 146, 84, 27);
		contentPane.add(labelAPELLIDO1);
		
		textFieldAPELLIDO1 = new JTextField();
		textFieldAPELLIDO1.setColumns(10);
		textFieldAPELLIDO1.setBounds(126, 146, 430, 33);
		contentPane.add(textFieldAPELLIDO1);
		
		JLabel labelAPELLIDO2 = new JLabel("APELLIDO 2");
		labelAPELLIDO2.setHorizontalAlignment(SwingConstants.CENTER);
		labelAPELLIDO2.setBounds(21, 190, 84, 27);
		contentPane.add(labelAPELLIDO2);
		
		textFieldAPELLIDO2 = new JTextField();
		textFieldAPELLIDO2.setColumns(10);
		textFieldAPELLIDO2.setBounds(126, 190, 430, 33);
		contentPane.add(textFieldAPELLIDO2);
		
		JLabel labelEDAD = new JLabel("EDAD");
		labelEDAD.setHorizontalAlignment(SwingConstants.CENTER);
		labelEDAD.setBounds(32, 250, 57, 27);
		contentPane.add(labelEDAD);
		
		textFieldEDAD = new JTextField();
		textFieldEDAD.setColumns(10);
		textFieldEDAD.setBounds(126, 250, 430, 33);
		contentPane.add(textFieldEDAD);
		
		JButton btnNUEVA_PARTIDA = new JButton("NUEVA PARTIDA");
		btnNUEVA_PARTIDA.setBackground(Color.GRAY);
		btnNUEVA_PARTIDA.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnNUEVA_PARTIDA.setBounds(238, 304, 199, 27);
		contentPane.add(btnNUEVA_PARTIDA);
		
		textFieldINFORMACION = new JTextField();
		textFieldINFORMACION.setEditable(false);
		textFieldINFORMACION.setBounds(126, 349, 430, 61);
		contentPane.add(textFieldINFORMACION);
		textFieldINFORMACION.setColumns(10);
		
		textFieldINFORMACION.setText(private "gettextFieldNOMBRE"+"gettextFieldAPELLIDO1"+"gettextFieldAPELLIDO2");
	}
}
