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
import javax.swing.ImageIcon;

public class JrVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtCapacidad;
	private JTextField txtModelo;
	private JTextField txtCategoria;
	private JTextField txtIdtipotransporte;
	private JTextField txtidvehiculos;
	Vehiculos cr = new Vehiculos();

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
		setBounds(100, 100, 696, 484);
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
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(Integer.parseInt(txtMatricula.getText()), txtMarca.getText(), txtCapacidad.getText(),
				txtModelo.getText(), txtCategoria.getText(), Integer.parseInt(txtIdtipotransporte.getText()));
			}
		});
		btnGuardar.setBounds(70, 317, 89, 91);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1 = new JLabel("ID_Vehiculos");
		lblNewLabel_1.setBounds(568, 264, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidvehiculos = new JTextField();
		txtidvehiculos.setBounds(559, 289, 86, 20);
		contentPane.add(txtidvehiculos);
		txtidvehiculos.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidvehiculos.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(556, 324, 89, 84);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtMatricula.getText()), txtMarca.getText(), txtCapacidad.getText(),
				txtModelo.getText(), txtCategoria.getText(), Integer.parseInt(txtIdtipotransporte.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(202, 320, 89, 88);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidvehiculos.getText()), txtMatricula, txtMarca, txtCapacidad, txtModelo, txtCategoria);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.setBounds(341, 320, 89, 84);
		contentPane.add(btnConsultar);
	}
}
