import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 730, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 83, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(422, 128, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel LABELhueco1 = new JLabel("Hueco1");
		LABELhueco1.setBounds(38, 21, 46, 14);
		contentPane.add(LABELhueco1);
		
		JLabel LABELhueco2 = new JLabel("Hueco2");
		LABELhueco2.setBounds(255, 67, 46, 14);
		contentPane.add(LABELhueco2);
		
		JLabel LABELhueco3 = new JLabel("Hueco3");
		LABELhueco3.setBounds(442, 114, 46, 14);
		contentPane.add(LABELhueco3);
		
		JButton BOTON1 = new JButton("Click aqui >>");
		BOTON1.setBounds(73, 82, 109, 23);
		contentPane.add(BOTON1);
		
		JLabel LABELboton1 = new JLabel("me llevo el texto al 2");
		LABELboton1.setBounds(73, 67, 109, 14);
		contentPane.add(LABELboton1);
		
		JButton BOTON2 = new JButton("Click aqui >>");
		BOTON2.setBounds(277, 127, 109, 23);
		contentPane.add(BOTON2);
		
		JLabel LABELboton2 = new JLabel("me llevo el texto al 3");
		LABELboton2.setBounds(277, 114, 137, 14);
		contentPane.add(LABELboton2);
		
		JButton BOTON3 = new JButton("Click aqui >>");
		BOTON3.setBounds(470, 171, 109, 23);
		contentPane.add(BOTON3);
		
		JLabel LABELboton3 = new JLabel("Me lo llevo al 1 de nuevo");
		LABELboton3.setBounds(470, 159, 137, 14);
		contentPane.add(LABELboton3);
	}
}
