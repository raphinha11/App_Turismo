package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Companias;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JrCompanias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRazonsocial;
	private JTextField txtDireccion;
	private JTextField txttelefono;
	private JTextField txtCorreo;
	private JTextField txtFechacreacion;
	private JTextField txtweb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrCompanias frame = new JrCompanias();
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
	public JrCompanias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazonSocial = new JLabel("Razon Social");
		lblRazonSocial.setBounds(57, 89, 86, 14);
		contentPane.add(lblRazonSocial);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(57, 127, 46, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(57, 163, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(57, 203, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblFechaCreacion = new JLabel("Fecha De Creacion");
		lblFechaCreacion.setBounds(57, 243, 94, 14);
		contentPane.add(lblFechaCreacion);
		
		JLabel lblWeb = new JLabel("Web");
		lblWeb.setBounds(57, 280, 46, 14);
		contentPane.add(lblWeb);
		
		txtRazonsocial = new JTextField();
		txtRazonsocial.setColumns(10);
		txtRazonsocial.setBounds(161, 86, 180, 20);
		contentPane.add(txtRazonsocial);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(161, 124, 180, 20);
		contentPane.add(txtDireccion);
		
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(161, 160, 112, 20);
		contentPane.add(txttelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(161, 200, 180, 20);
		contentPane.add(txtCorreo);
		
		txtFechacreacion = new JTextField();
		txtFechacreacion.setColumns(10);
		txtFechacreacion.setBounds(161, 240, 112, 20);
		contentPane.add(txtFechacreacion);
		
		txtweb = new JTextField();
		txtweb.setColumns(10);
		txtweb.setBounds(161, 277, 180, 20);
		contentPane.add(txtweb);
		
		JLabel lblNewLabel = new JLabel("Comapñias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(223, 23, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Companias cr = new Companias();
				cr.create(txtRazonsocial.getText(), txtDireccion.getText(), txttelefono.getText(), txtCorreo.getText(), 
				txtFechacreacion.getText(), txtweb.getText());
			}
		});
		btnGuardar.setBounds(398, 159, 89, 23);
		contentPane.add(btnGuardar);
	}
}
