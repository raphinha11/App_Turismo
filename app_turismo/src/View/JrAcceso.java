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
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("Control de Acesso");
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Documento");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(160, 46, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblContrasea.setBounds(160, 118, 84, 14);
		contentPane.add(lblContrasea);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(112, 71, 180, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnIngresar.setBackground(new Color(255, 255, 255));
		btnIngresar.setForeground(new Color(0, 128, 0));
		btnIngresar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\marca-de-verificacion.png"));
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotores pr = new Promotores();
				pr.controlAcceso(Integer.parseInt(txtDocumento.getText()), txtContrasena.getText());
			}
		});
		btnIngresar.setBounds(144, 194, 113, 33);
		contentPane.add(btnIngresar);
		
		JLabel lblNewLabel_1 = new JLabel("Control de Acceso");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(131, 11, 172, 14);
		contentPane.add(lblNewLabel_1);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(112, 143, 180, 20);
		contentPane.add(txtContrasena);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblNewLabel, lblContrasea, txtDocumento, btnIngresar, lblNewLabel_1, txtContrasena}));
	}
}
