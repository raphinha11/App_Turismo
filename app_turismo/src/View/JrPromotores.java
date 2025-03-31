package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JrPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipodocumento;
	private JTextField txtNumerodocumento;
	private JTextField txtNombre;
	private JTextField txtapellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreopersonal;
	private JTextField txtCorreocorp;
	private JTextField txtFechanacimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrPromotores frame = new JrPromotores();
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
	public JrPromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipodocumento = new JLabel("Tipo De Documento");
		lblTipodocumento.setBounds(69, 51, 109, 14);
		contentPane.add(lblTipodocumento);
		
		JLabel lblNumeroDocumento = new JLabel("Numero De Documento");
		lblNumeroDocumento.setBounds(69, 93, 120, 14);
		contentPane.add(lblNumeroDocumento);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(69, 130, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(69, 171, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(69, 208, 46, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(69, 245, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreoPersonal = new JLabel("Correo Personal");
		lblCorreoPersonal.setBounds(69, 281, 109, 14);
		contentPane.add(lblCorreoPersonal);
		
		JLabel lblCorreoCorp = new JLabel("Correo Corp");
		lblCorreoCorp.setBounds(69, 319, 109, 14);
		contentPane.add(lblCorreoCorp);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha De Nacimiento");
		lblFechaNacimiento.setBounds(69, 354, 109, 14);
		contentPane.add(lblFechaNacimiento);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(228, 48, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtNumerodocumento = new JTextField();
		txtNumerodocumento.setColumns(10);
		txtNumerodocumento.setBounds(228, 90, 125, 20);
		contentPane.add(txtNumerodocumento);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(228, 127, 125, 20);
		contentPane.add(txtNombre);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(228, 168, 125, 20);
		contentPane.add(txtapellido);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(228, 205, 146, 20);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(228, 242, 125, 20);
		contentPane.add(txtTelefono);
		
		txtCorreopersonal = new JTextField();
		txtCorreopersonal.setColumns(10);
		txtCorreopersonal.setBounds(228, 278, 146, 20);
		contentPane.add(txtCorreopersonal);
		
		txtCorreocorp = new JTextField();
		txtCorreocorp.setColumns(10);
		txtCorreocorp.setBounds(228, 316, 146, 20);
		contentPane.add(txtCorreocorp);
		
		txtFechanacimiento = new JTextField();
		txtFechanacimiento.setColumns(10);
		txtFechanacimiento.setBounds(228, 351, 125, 20);
		contentPane.add(txtFechanacimiento);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotores cr = new Promotores();
				cr.create(txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombre.getText(), txtapellido.getText(), 
				txtDireccion.getText(), txtTelefono.getText(), txtCorreopersonal.getText(), txtCorreocorp.getText(), txtFechanacimiento.getText());
				
			}
		});
		btnNewButton_1.setBounds(467, 204, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Promotores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(250, 11, 103, 26);
		contentPane.add(lblNewLabel);
	}

}
