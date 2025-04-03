package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JrAcceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDocumento;
	private JPasswordField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrAcceso frame = new JrAcceso();
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
	public JrAcceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Documento");
		lblNewLabel.setBounds(49, 48, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(49, 102, 67, 14);
		contentPane.add(lblContrasea);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(143, 45, 180, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotores pr = new Promotores();
				pr.controlAcceso(Integer.parseInt(txtDocumento.getText()), txtContrasena.getText());
			}
		});
		btnIngresar.setBounds(187, 177, 89, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblNewLabel_1 = new JLabel("Control de Acceso");
		lblNewLabel_1.setBounds(187, 11, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(143, 99, 180, 20);
		contentPane.add(txtContrasena);
	}
}
