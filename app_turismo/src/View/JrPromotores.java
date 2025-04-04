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
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

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
	Promotores cr = new Promotores();
	private JTextField txtidpromotor;
	private JTextField txtcontrasena;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("Promotores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipodocumento = new JLabel("Tipo De Documento");
		lblTipodocumento.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTipodocumento.setBounds(69, 51, 136, 14);
		contentPane.add(lblTipodocumento);
		
		JLabel lblNumeroDocumento = new JLabel("Numero De Documento");
		lblNumeroDocumento.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNumeroDocumento.setBounds(69, 93, 149, 14);
		contentPane.add(lblNumeroDocumento);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNombre.setBounds(69, 130, 78, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblApellido.setBounds(69, 171, 78, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDireccion.setBounds(69, 208, 78, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTelefono.setBounds(69, 245, 78, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreoPersonal = new JLabel("Correo Personal");
		lblCorreoPersonal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCorreoPersonal.setBounds(69, 281, 109, 14);
		contentPane.add(lblCorreoPersonal);
		
		JLabel lblCorreoCorp = new JLabel("Correo Corp");
		lblCorreoCorp.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCorreoCorp.setBounds(69, 319, 109, 14);
		contentPane.add(lblCorreoCorp);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha De Nacimiento");
		lblFechaNacimiento.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblFechaNacimiento.setBounds(69, 354, 136, 14);
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
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombre.getText(), txtapellido.getText(), 
				txtDireccion.getText(), txtTelefono.getText(), txtCorreopersonal.getText(), txtCorreocorp.getText(), txtFechanacimiento.getText(), txtcontrasena.getText());
				
			}
		});
		btnNewButton_1.setBounds(431, 263, 89, 84);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Promotores");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(250, 11, 124, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID_Promotor");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(488, 51, 98, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setBounds(488, 76, 86, 20);
		contentPane.add(txtidpromotor);
		txtidpromotor.setColumns(10);
		
		JButton btneliminar = new JButton("Eliminar");
		btneliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidpromotor.getText()));
			}
		});
		btneliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btneliminar.setBounds(543, 263, 89, 84);
		contentPane.add(btneliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombre.getText(), txtapellido.getText(), 
				txtDireccion.getText(), txtTelefono.getText(), txtCorreopersonal.getText(), txtCorreocorp.getText(), txtFechanacimiento.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(431, 375, 89, 73);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidpromotor.getText()), txtTipodocumento, txtNumerodocumento, txtNombre, txtapellido, txtDireccion, txtTelefono, txtCorreopersonal, txtCorreocorp, txtFechanacimiento);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.setBounds(543, 373, 89, 76);
		contentPane.add(btnConsultar);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(69, 393, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		txtcontrasena = new JTextField();
		txtcontrasena.setBounds(228, 390, 125, 20);
		contentPane.add(txtcontrasena);
		txtcontrasena.setColumns(10);
	}
}
