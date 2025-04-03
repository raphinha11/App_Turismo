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
import javax.swing.ImageIcon;

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
	private JTextField txtidoperadores;
	Operadores cr = new Operadores();

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
		setBounds(100, 100, 603, 455);
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
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombre.getText(),
				txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(), Integer.parseInt(txtidvehiculo.getText()));
			}
		});
		btnGuardar.setBounds(68, 310, 89, 82);
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
		
		JLabel lblNewLabel_1 = new JLabel("ID_Operadores");
		lblNewLabel_1.setBounds(430, 138, 86, 12);
		contentPane.add(lblNewLabel_1);
		
		txtidoperadores = new JTextField();
		txtidoperadores.setBounds(420, 171, 86, 20);
		contentPane.add(txtidoperadores);
		txtidoperadores.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidoperadores.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(420, 216, 89, 77);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombre.getText(),
				txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(), Integer.parseInt(txtidvehiculo.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(212, 307, 89, 85);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidoperadores.getText()), txtTipodocumento, txtNumerodocumento, txtNombre, txtApellido, txtDireccion, txtTelefono, txtCorreo);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.setBounds(417, 310, 89, 73);
		contentPane.add(btnConsultar);
	}
}
