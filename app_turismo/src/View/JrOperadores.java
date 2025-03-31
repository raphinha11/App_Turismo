package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JrOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipodocumento;
	private JTextField txtNumerodocumento;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtidvehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrOperadores frame = new JrOperadores();
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
	public JrOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipodocumento = new JLabel("Tipo De Documento");
		lblTipodocumento.setBounds(68, 67, 134, 14);
		contentPane.add(lblTipodocumento);
		
		JLabel lblNumeroDocumento = new JLabel("Numero De Documento");
		lblNumeroDocumento.setBounds(68, 103, 134, 14);
		contentPane.add(lblNumeroDocumento);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(68, 137, 65, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(68, 174, 65, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(68, 208, 65, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(68, 244, 65, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(68, 279, 46, 14);
		contentPane.add(lblCorreo);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(228, 64, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtNumerodocumento = new JTextField();
		txtNumerodocumento.setColumns(10);
		txtNumerodocumento.setBounds(228, 100, 113, 20);
		contentPane.add(txtNumerodocumento);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(228, 134, 113, 20);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(228, 171, 113, 20);
		contentPane.add(txtApellido);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(228, 205, 113, 20);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(228, 241, 113, 20);
		contentPane.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(228, 276, 113, 20);
		contentPane.add(txtCorreo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operadores cr = new Operadores();
				cr.create(txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombre.getText(),
				txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(), Integer.parseInt(txtidvehiculo.getText()));
			}
		});
		btnGuardar.setBounds(252, 324, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("Operadores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(212, 11, 91, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblidvehiculo = new JLabel("ID Vehiculo");
		lblidvehiculo.setBounds(431, 67, 75, 14);
		contentPane.add(lblidvehiculo);
		
		txtidvehiculo = new JTextField();
		txtidvehiculo.setBounds(420, 100, 86, 20);
		contentPane.add(txtidvehiculo);
		txtidvehiculo.setColumns(10);
	}
}
