package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JrClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtnumerodocumento;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdireccio;
	private JTextField txteps;
	private JTextField txtalergias;
	private JTextField txtfechanacimiento;
	private JTextField txttelefono;
	private JTextField txtestadocivil;
	private JTextField txtcorreo;
	private JTextField txtcodigocliente;
	Clientes cr = new Clientes();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrClientes frame = new JrClientes();
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
	public JrClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDocumento = new JLabel("Tipo De Documento");
		lblTipoDocumento.setBounds(63, 73, 120, 14);
		contentPane.add(lblTipoDocumento);
		
		JLabel lblNumeroDocumento = new JLabel("Numero De Documento");
		lblNumeroDocumento.setBounds(63, 98, 120, 14);
		contentPane.add(lblNumeroDocumento);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(63, 123, 77, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(63, 148, 64, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(63, 173, 77, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblEps = new JLabel("EPS");
		lblEps.setBounds(63, 198, 64, 14);
		contentPane.add(lblEps);
		
		JLabel lblAlergias = new JLabel("Alergias");
		lblAlergias.setBounds(63, 223, 77, 14);
		contentPane.add(lblAlergias);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha De Nacimiento");
		lblFechaNacimiento.setBounds(63, 248, 120, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(63, 273, 64, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(63, 298, 86, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(63, 323, 64, 14);
		contentPane.add(lblCorreo);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setColumns(10);
		txttipodocumento.setBounds(183, 70, 86, 20);
		contentPane.add(txttipodocumento);
		
		txtnumerodocumento = new JTextField();
		txtnumerodocumento.setColumns(10);
		txtnumerodocumento.setBounds(183, 95, 130, 20);
		contentPane.add(txtnumerodocumento);
		
		txtnombre = new JTextField();
		txtnombre.setColumns(10);
		txtnombre.setBounds(183, 120, 130, 20);
		contentPane.add(txtnombre);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(183, 145, 130, 20);
		contentPane.add(txtapellido);
		
		txtdireccio = new JTextField();
		txtdireccio.setColumns(10);
		txtdireccio.setBounds(183, 170, 160, 20);
		contentPane.add(txtdireccio);
		
		txteps = new JTextField();
		txteps.setColumns(10);
		txteps.setBounds(183, 195, 160, 20);
		contentPane.add(txteps);
		
		txtalergias = new JTextField();
		txtalergias.setColumns(10);
		txtalergias.setBounds(183, 220, 160, 20);
		contentPane.add(txtalergias);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setColumns(10);
		txtfechanacimiento.setBounds(183, 245, 130, 20);
		contentPane.add(txtfechanacimiento);
		
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(183, 270, 130, 20);
		contentPane.add(txttelefono);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setColumns(10);
		txtestadocivil.setBounds(183, 295, 130, 20);
		contentPane.add(txtestadocivil);
		
		txtcorreo = new JTextField();
		txtcorreo.setColumns(10);
		txtcorreo.setBounds(183, 320, 160, 20);
		contentPane.add(txtcorreo);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txttipodocumento.getText(), Integer.parseInt(txtnumerodocumento.getText()), txtnombre.getText(), 
				txtapellido.getText(), txtdireccio.getText(), txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txttelefono.getText(),
				txtestadocivil.getText(), txtcorreo.getText());
				
			}
		});
		btnNewButton.setBounds(63, 362, 89, 73);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("CLIENTES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(303, 11, 97, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CodigoClientes");
		lblNewLabel_1.setBounds(480, 73, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		txtcodigocliente = new JTextField();
		txtcodigocliente.setBounds(472, 95, 86, 20);
		contentPane.add(txtcodigocliente);
		txtcodigocliente.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtcodigocliente.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(472, 148, 89, 89);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txttipodocumento.getText(), Integer.parseInt(txtnumerodocumento.getText()), txtnombre.getText(), 
				txtapellido.getText(), txtdireccio.getText(), txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txttelefono.getText(),
				txtestadocivil.getText(), txtcorreo.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(472, 294, 89, 89);
		contentPane.add(btnActualizar);
	}
}
