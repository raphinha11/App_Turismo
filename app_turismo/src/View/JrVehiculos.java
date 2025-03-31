package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Vehiculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JrVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtCapacidad;
	private JTextField txtModelo;
	private JTextField txtCategoria;
	private JTextField txtIdtipotransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrVehiculos frame = new JrVehiculos();
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
	public JrVehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(70, 72, 71, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(70, 112, 71, 14);
		contentPane.add(lblMarca);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setBounds(70, 157, 71, 14);
		contentPane.add(lblCapacidad);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(73, 201, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(70, 238, 71, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblIdtipotransporte = new JLabel("ID_Tipo_Transporte");
		lblIdtipotransporte.setBounds(70, 292, 116, 14);
		contentPane.add(lblIdtipotransporte);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(226, 69, 128, 20);
		contentPane.add(txtMatricula);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(226, 112, 259, 20);
		contentPane.add(txtMarca);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(226, 154, 128, 20);
		contentPane.add(txtCapacidad);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(226, 198, 259, 20);
		contentPane.add(txtModelo);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(226, 235, 259, 20);
		contentPane.add(txtCategoria);
		
		txtIdtipotransporte = new JTextField();
		txtIdtipotransporte.setColumns(10);
		txtIdtipotransporte.setBounds(226, 289, 100, 20);
		contentPane.add(txtIdtipotransporte);
		
		JLabel lblNewLabel = new JLabel("Vehiculos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(266, 11, 116, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vehiculos cr = new Vehiculos();
				cr.create(Integer.parseInt(txtMatricula.getText()), txtMarca.getText(), txtCapacidad.getText(),
				txtModelo.getText(), txtCategoria.getText(), Integer.parseInt(txtIdtipotransporte.getText()));
			}
		});
		btnGuardar.setBounds(293, 350, 89, 23);
		contentPane.add(btnGuardar);
	}
}
