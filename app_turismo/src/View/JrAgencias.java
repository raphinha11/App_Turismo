package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import java.awt.Toolkit;

public class JrAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtWeb;
	private JLabel lblNewLabel;
	private JButton btnGuardar;
	private JTextField txtidcompania;
	private JTextField txtidagencia;
	Agencias cr = new Agencias();
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrAgencias frame = new JrAgencias();
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
	public JrAgencias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("Agencias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 454);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(172, 61, 220, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(172, 108, 220, 20);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(172, 155, 125, 20);
		contentPane.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(172, 201, 220, 20);
		contentPane.add(txtCorreo);
		
		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(172, 244, 220, 20);
		contentPane.add(txtWeb);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNombre.setBounds(67, 63, 66, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDireccion.setBounds(67, 110, 80, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTelefono.setBounds(67, 157, 80, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCorreo.setBounds(67, 203, 80, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblWeb = new JLabel("Web");
		lblWeb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblWeb.setBounds(67, 246, 46, 14);
		contentPane.add(lblWeb);
		
		lblNewLabel = new JLabel("Agencias");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(248, 11, 111, 20);
		contentPane.add(lblNewLabel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(164, 255, 255));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(), txtWeb.getText(), Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnGuardar.setBounds(67, 316, 103, 80);
		contentPane.add(btnGuardar);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(172, 286, 86, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		JLabel lblidcompania = new JLabel("ID compañia");
		lblidcompania.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblidcompania.setBounds(67, 288, 98, 14);
		contentPane.add(lblidcompania);
		
		JLabel lblNewLabel_1 = new JLabel("ID_Agencia");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(459, 63, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(459, 93, 86, 20);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(164, 255, 255));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidagencia.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(459, 136, 89, 80);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(new Color(164, 255, 255));
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(), txtWeb.getText(), Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(273, 316, 89, 80);
		contentPane.add(btnActualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(164, 255, 255));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidagencia.getText()), txtNombre, txtDireccion, txtTelefono, txtCorreo, txtWeb);
			}
		});
		btnConsultar.setBounds(459, 316, 89, 80);
		contentPane.add(btnConsultar);
	}
}
