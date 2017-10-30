import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProyectoVentanaPersonal extends JFrame {

	private JPanel contentPane;               //indicamos que tenemos una ventana
	private JTextField CajaNombre;            //hemos introducido una caja para nuestro nombre
	private JTextField CajaApellido;          //hemos introducido una caja para nuestro nombre
	private JTextField CajaEdad;              //hemos introducido una caja para nuestro nombre
	private JTextField CajaEmail;             //hemos introducido una caja para nuestro nombre

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoVentanaPersonal frame = new ProyectoVentanaPersonal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Aqui generamos la configuracion de nuestra ventana
	 */
	public ProyectoVentanaPersonal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Las medidas de nuestra ventana (borde exterior)
		setBounds(100, 100, 499, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//nuestra caja donde contiene el NOMBRE
		JLabel TituloeNombre = new JLabel("Nombre");
		TituloeNombre.setBounds(10, 31, 46, 14);
		contentPane.add(TituloeNombre);
		
		
		CajaNombre = new JTextField();
		CajaNombre.setEditable(false);						//aqui indicamos que la caja NO SERA EDITABLE cuando genere la ventana
		CajaNombre.setText("Hugo");							//el Texto introducido en la caja			
		CajaNombre.setBounds(10, 51, 86, 20);
		
		contentPane.add(CajaNombre);
		CajaNombre.setColumns(10);
		
		//nuestra caja donde contiene los APELLIDOS
		JLabel TituloeApellidos = new JLabel("Apellidos");
		TituloeApellidos.setBounds(10, 94, 46, 14);
		contentPane.add(TituloeApellidos);
		
		CajaApellido = new JTextField();
		CajaApellido.setEditable(false);					//aqui indicamos que la caja NO SERA EDITABLE cuando genere la ventana
		CajaApellido.setText("Espejel Gil");				//el Texto introducido en la caja
		CajaApellido.setColumns(10);
		CajaApellido.setBounds(10, 114, 86, 20);
		contentPane.add(CajaApellido);
		
		
		//nuestra caja donde contiene los EDAD
		JLabel TituloeEdad = new JLabel("Edad");
		TituloeEdad.setBounds(10, 160, 46, 14);
		contentPane.add(TituloeEdad);
		
		CajaEdad = new JTextField();
		CajaEdad.setEditable(false);						//aqui indicamos que la caja NO SERA EDITABLE cuando genere la ventana
		CajaEdad.setText("30");								//el Texto introducido en la caja
		CajaEdad.setColumns(10);
		CajaEdad.setBounds(10, 180, 86, 20);
		contentPane.add(CajaEdad);
		
		
		//nuestra caja donde contiene el eMail
		JLabel TituloeMail = new JLabel("eMail");
		TituloeMail.setBounds(10, 227, 46, 14);
		contentPane.add(TituloeMail);
		
		CajaEmail = new JTextField();
		CajaEmail.setEditable(false);						//aqui indicamos que la caja NO SERA EDITABLE cuando genere la ventanas
		CajaEmail.setText("hugo86job@gmail.com");			//el Texto introducido en la caja
		CajaEmail.setColumns(10);
		CajaEmail.setBounds(10, 247, 138, 20);
		contentPane.add(CajaEmail);							//Nombre de la caja
	}

}
