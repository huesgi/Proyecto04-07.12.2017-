import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField TextoIzquierda;
	private JTextField TextoDerecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
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
	public BailandoTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 277);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Aqui indico el nombre y tipo de "caja" creada
		TextoIzquierda = new JTextField();
		//Aqui indico las medidads de la caja IZQUIERDA
		TextoIzquierda.setBounds(24, 79, 130, 20);
		contentPane.add(TextoIzquierda);
		TextoIzquierda.setColumns(10);
		
		//Aqui indico el nombre y tipo de "caja" creada
		TextoDerecha = new JTextField();
		//Aqui indico las medidads de la caja DERECHA
		TextoDerecha.setBounds(311, 79, 130, 20);
		contentPane.add(TextoDerecha);
		TextoDerecha.setColumns(10);
		
		//le he colocado un Jlabel como titulo de la "caja"
		JLabel LABELTextoIzquierda = new JLabel("Texto Izquierda");
		//Medidas del titulo de la "caja"
		LABELTextoIzquierda.setBounds(24, 64, 93, 14);
		contentPane.add(LABELTextoIzquierda);
		
		
		//le he colocado un Jlabel como titulo de la "caja"
		JLabel LABELTextoDerecha = new JLabel("Texto Derecha");
		//Medidas del titulo de la "caja"
		LABELTextoDerecha.setBounds(311, 64, 93, 14);
		contentPane.add(LABELTextoDerecha);
		
		JButton BOTON1 = new JButton("Click aqui >>");
		BOTON1.setForeground(Color.BLUE);
		BOTON1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//si apreto el boton con el Jlabel "Me llevo a la derecha" lo pasara a la caja de la derecha
				TextoDerecha.setText(TextoIzquierda.getText());	
				// con este comando cuando lo pase a la caja de la derecha borrara el texto de la izquierda para que solo lo presente en el texto derecho
				TextoIzquierda.setText("");
			}
		});
		//Boton y sus medidas
		BOTON1.setBounds(158, 27, 109, 23);
		contentPane.add(BOTON1);
		
		JLabel LABELboton1 = new JLabel("Me llevo a la derecha");
		LABELboton1.setBounds(158, 11, 109, 14);
		contentPane.add(LABELboton1);
		
		
		
		JButton BOTON2 = new JButton("<< Click aqui");
		BOTON2.setBackground(Color.BLUE);
		BOTON2.setForeground(Color.WHITE);
		BOTON2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//si apreto el boton con el Jlabel "Me llevo a la izquierda" lo pasara a la caja de la izquierda
				TextoIzquierda.setText(TextoDerecha.getText());	
				// con este comando cuando lo pase a la caja de la izquierda borrara el texto de la derecha para que solo lo presente en el texto izquierdo
				TextoDerecha.setText("");
				
			}
		});
		//Boton y sus medidas
		BOTON2.setBounds(158, 139, 109, 23);
		contentPane.add(BOTON2);
		
		JLabel LABELboton2 = new JLabel("Me llevo a la izquierda");
		LABELboton2.setBounds(158, 126, 137, 14);
		contentPane.add(LABELboton2);
		
		JButton BOTONBORRAR = new JButton("Borrar");
		BOTONBORRAR.setBackground(Color.RED);
		BOTONBORRAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TextoDerecha.setText("");
			TextoIzquierda.setText("");
			}
		});
		BOTONBORRAR.setBounds(384, 193, 97, 23);
		contentPane.add(BOTONBORRAR);
		
		JLabel lblNewLabel = new JLabel("Borrar textos");
		lblNewLabel.setBounds(395, 179, 97, 14);
		contentPane.add(lblNewLabel);
	}
}
