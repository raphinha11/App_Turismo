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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(157, 60, 220, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(157, 107, 220, 20);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(157, 154, 125, 20);
		contentPane.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(157, 200, 220, 20);
		contentPane.add(txtCorreo);
		
		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(157, 243, 220, 20);
		contentPane.add(txtWeb);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(67, 63, 56, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(67, 110, 56, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(67, 157, 56, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(67, 203, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblWeb = new JLabel("Web");
		lblWeb.setBounds(67, 246, 46, 14);
		contentPane.add(lblWeb);
		
		lblNewLabel = new JLabel("Agencias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(273, 11, 86, 20);
		contentPane.add(lblNewLabel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtCorreo.getText(), txtWeb.getText(), Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnGuardar.setBounds(273, 288, 111, 80);
		contentPane.add(btnGuardar);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(157, 285, 86, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		JLabel lblidcompania = new JLabel("ID compañia");
		lblidcompania.setBounds(67, 288, 80, 14);
		contentPane.add(lblidcompania);
		
		JLabel lblNewLabel_1 = new JLabel("ID_Agencia");
		lblNewLabel_1.setBounds(513, 63, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(502, 88, 86, 20);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidagencia.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(499, 140, 89, 80);
		contentPane.add(btnEliminar);
	}
}
