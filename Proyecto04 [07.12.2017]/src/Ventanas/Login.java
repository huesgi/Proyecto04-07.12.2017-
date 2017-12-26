package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido1;
	private JTextField textFieldApellido2;
	private JTextField textFieldInformacion;
	private JTextField textFieldEdad;
	
	
	// Dejamos generado un nuevo jugador
	private Jugador player1;

	
	/**
	 * Create the frame.
	 */
	public Login() {
		

		// aqui iniciamos el Jugador nuevo
		player1 = new Jugador();
		player1.setNombre("");
		player1.setApellidos1("");
		player1.setApellidos2("");
		player1.setEdad(999);												// dejamos un valor que ya sabemos que no es correcto por no dejarlo a 0 sino marcamos un valor aleatorio
		player1.setId(0);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 378);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// etiqueta DATOS DEL JUGADOR
		JLabel lblNewLabelDatosDelJugador = new JLabel("Datos del Jugador");
		lblNewLabelDatosDelJugador.setBackground(Color.PINK);
		lblNewLabelDatosDelJugador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabelDatosDelJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelDatosDelJugador.setBounds(30, 11, 371, 28);
		contentPane.add(lblNewLabelDatosDelJugador);

		// Etiqueta del NOMBRE
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(30, 50, 80, 14);
		contentPane.add(lblNombre);

		// Etiqueta del APELLIDO1
		JLabel lblApellido1 = new JLabel("Apellido 1");
		lblApellido1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellido1.setBounds(30, 83, 80, 14);
		contentPane.add(lblApellido1);

		// Etiqueta del APELLIDO2
		JLabel lblApellido2 = new JLabel("Apellido 2");
		lblApellido2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellido2.setBounds(30, 108, 80, 14);
		contentPane.add(lblApellido2);

		// Etiqueta de la EDAD
		JLabel lblEdad = new JLabel("edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(30, 164, 80, 14);
		contentPane.add(lblEdad);

		// Campo donde escribiremos el NOMBRE
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(157, 47, 228, 20);
		getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		// aqui añado el Listener de la caja del NOMBRE
		textFieldNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1.setNombre(textFieldNombre.getText());
			}
		});

		textFieldApellido1 = new JTextField();
		textFieldApellido1.setBounds(157, 83, 228, 20);
		getContentPane().add(textFieldApellido1);
		textFieldApellido1.setColumns(10);
		
		//aqui le mostramos las caracteristicas de accion del Listener
		textFieldApellido1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1.setNombre(textFieldApellido1.getText());
			}
		});

		textFieldApellido2 = new JTextField();
		textFieldApellido2.setBounds(157, 108, 228, 20);
		getContentPane().add(textFieldApellido2);
		textFieldApellido2.setColumns(10);
		
		//aqui le mostramos las caracteristicas de accion del Listener
		textFieldApellido2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1.setNombre(textFieldApellido2.getText());
			}
		});

		textFieldInformacion = new JTextField();
		textFieldInformacion.setBackground(Color.PINK);
		textFieldInformacion.setBounds(30, 228, 371, 58);
		getContentPane().add(textFieldInformacion);
		textFieldInformacion.setColumns(10);
		
		
		// Caja donde introducimos la edad con sus caracteristicas
		textFieldEdad = new JTextField();
		textFieldEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// los datos introducidos en el TextField llamado "textFieldEdad" 
				// los que intruducimos en el textfieldEdad lo guardamos en la variable "campoEdad"
				String campoEdad = textFieldEdad.getText();
											// lo definimos como "isNumeric"
											//cogemos el metodo en la clase Jugador en este caso la usada es "isNumeric"
				
				boolean semaforo = true;		//hemos creado una variable para el boolena llamaro "semaforo" diciendole que es TRUE
											//comprobamos si es numerico
				if (Jugador.isNumeric(campoEdad)) {								//definido en la linea 158 como "campoEdad"
					int campoEdadint = Integer.parseInt (campoEdad);			// aqui lo que hacemos es convertir el texto introducido en "campoEdad" a un valor numerico en la variable "campoEdadint"
				
					if (Jugador.isValidEdad(campoEdadint)){							//sin haber escogido los valores asignados en player1 sino los asignados en la variabnle creada como "campoEdadint"
					player1.setEdad(campoEdadint);
				
					semaforo = false;				// la variable semaforo si es FALSO
					}
					
				
				}
				
				if (semaforo) {
					textFieldInformacion.setText("la edad no es correcta revisala");
				
				}}
		});
		textFieldEdad.setBounds(157, 161, 228, 20);
		getContentPane().add(textFieldEdad);
		textFieldEdad.setColumns(10);
		///////////////////getContentPane().setLayout(null);

		//aqui le mostramos las caracteristicas de accion del Listener
		
		
		//---------------------------------------------------------------------------------------------------------------
		
		
		// Caracateristicas del BOTON
		JButton btnNewButton = new JButton("A JUGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
textFieldInformacion.setText(" ");
				
				//aqui lo que hacemos el coger el texto y copiarlo en el objeto
				player1.setNombre(textFieldNombre.getText());
				player1.setApellidos1(textFieldApellido1.getText());
				player1.setApellidos2(textFieldApellido2.getText());

				//aqui comprueba si es un valor numerico y lo copia en el OBJETO
				if (player1.isNumeric(textFieldEdad.getText()) == true)
					player1.setEdad(Integer.parseInt(textFieldEdad.getText()));
				else
					player1.setEdad(999);
				
				// aqui hace la comparacion del texto en NOMBRE viendo si tiene texto o no. Sino lo tiene muestra el error
				if (player1.sonEspacios(player1.getNombre()))
				    textFieldInformacion.setText("falta el texto NOMBRE o pulse INTRO");
				
				// aqui hace la comparacion del texto en APELLIDO1 viendo si tiene texto o no. Sino lo tiene muestra el error
				else if (player1.sonEspacios(player1.getApellidos1()))
					textFieldInformacion.setText("falta el texto APELLIDO1 o pulse INTRO");
				
				// aqui hace la comparacion del texto en APELLIDO1 viendo si tiene texto o no. Sino lo tiene muestra el error
				else if (player1.sonEspacios(player1.getApellidos2()))
					textFieldInformacion.setText("falta el texto APELLIDO2 o pulse INTRO");
				
				// aqui hace la comparacion del texto en EDAD viendo si tiene texto o no. Sino lo tiene muestra el error
				else if (player1.getEdad() == 999)
					textFieldInformacion.setText("la EDAD no es correcta o pulse INTRO");
				else
					textFieldInformacion.setText("Nuevo Jugador: " + player1.getNombre() + " " + player1.getApellidos1() + " "
							+ player1.getApellidos2() + " "+player1.getEdad());

			
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		
		btnNewButton.setBounds(30, 190, 373, 23);
		contentPane.add(btnNewButton);

	}
}
