package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Paquetes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class JrPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFechaventa;
	private JTextField txthoraventa;
	private JTextField txtFechaejecucion;
	private JTextField txtHorasalida;
	private JTextField txtObservacion;
	private JTextField txtPrecio;
	private JTextField txtcodigocliente;
	private JTextField txtidpromotor;
	private JTextField txtidmedio;
	private JTextField txtidagencia;
	private JTextField txtidvehiculos;
	private JTextField txtiddestino;
	private JTextField txtidorigen;
	Paquetes cr = new Paquetes();
	private JTextField txtcodigos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrPaquetes frame = new JrPaquetes();
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
	public JrPaquetes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("Paquetes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFechaventa = new JLabel("Fecha De Venta");
		lblFechaventa.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblFechaventa.setBounds(80, 140, 120, 14);
		contentPane.add(lblFechaventa);
		
		JLabel lblHoraVenta = new JLabel("Hora De Venta");
		lblHoraVenta.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblHoraVenta.setBounds(80, 177, 120, 14);
		contentPane.add(lblHoraVenta);
		
		JLabel lblFechaEjecucion = new JLabel("Fecha De Ejecucion");
		lblFechaEjecucion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblFechaEjecucion.setBounds(80, 254, 120, 17);
		contentPane.add(lblFechaEjecucion);
		
		JLabel lblHoraSalida = new JLabel("Hora De salida");
		lblHoraSalida.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblHoraSalida.setBounds(80, 220, 120, 14);
		contentPane.add(lblHoraSalida);
		
		JLabel lblObcervacion = new JLabel("Observacion");
		lblObcervacion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblObcervacion.setBounds(80, 293, 120, 14);
		contentPane.add(lblObcervacion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPrecio.setBounds(80, 334, 89, 14);
		contentPane.add(lblPrecio);
		
		txtFechaventa = new JTextField();
		txtFechaventa.setBounds(210, 137, 114, 20);
		contentPane.add(txtFechaventa);
		txtFechaventa.setColumns(10);
		
		txthoraventa = new JTextField();
		txthoraventa.setColumns(10);
		txthoraventa.setBounds(210, 174, 114, 20);
		contentPane.add(txthoraventa);
		
		txtFechaejecucion = new JTextField();
		txtFechaejecucion.setColumns(10);
		txtFechaejecucion.setBounds(210, 251, 114, 20);
		contentPane.add(txtFechaejecucion);
		
		txtHorasalida = new JTextField();
		txtHorasalida.setColumns(10);
		txtHorasalida.setBounds(210, 217, 114, 20);
		contentPane.add(txtHorasalida);
		
		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(210, 290, 209, 20);
		contentPane.add(txtObservacion);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(210, 331, 114, 20);
		contentPane.add(txtPrecio);
		
		JLabel lblNewLabel = new JLabel("PAQUETES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(270, 11, 102, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(Integer.parseInt(txtiddestino.getText()), Integer.parseInt(txtidorigen.getText()) , txtFechaventa.getText(), txthoraventa.getText(), txtHorasalida.getText(), txtFechaejecucion.getText(),
				txtObservacion.getText(), Integer.parseInt(txtcodigocliente.getText()), Integer.parseInt(txtidpromotor.getText()),
				Integer.parseInt(txtidmedio.getText()), Integer.parseInt(txtidagencia.getText()), Integer.parseInt(txtidvehiculos.getText()),
				Integer.parseInt(txtPrecio.getText()));
			}
		});
		btnGuardar.setBounds(80, 389, 89, 80);
		contentPane.add(btnGuardar);
		
		JLabel lblcodigocliente = new JLabel("codigocliente");
		lblcodigocliente.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblcodigocliente.setBounds(457, 81, 87, 14);
		contentPane.add(lblcodigocliente);
		
		JLabel lblidpromotor = new JLabel("idpromotor");
		lblidpromotor.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblidpromotor.setBounds(457, 127, 87, 14);
		contentPane.add(lblidpromotor);
		
		JLabel lblidmedio = new JLabel("idmedio");
		lblidmedio.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblidmedio.setBounds(457, 177, 70, 14);
		contentPane.add(lblidmedio);
		
		JLabel lblidagencia = new JLabel("idagencia");
		lblidagencia.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblidagencia.setBounds(457, 223, 87, 14);
		contentPane.add(lblidagencia);
		
		JLabel lblidvehiculos = new JLabel("idvehiculos");
		lblidvehiculos.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblidvehiculos.setBounds(457, 267, 87, 14);
		contentPane.add(lblidvehiculos);
		
		txtcodigocliente = new JTextField();
		txtcodigocliente.setBounds(554, 78, 86, 20);
		contentPane.add(txtcodigocliente);
		txtcodigocliente.setColumns(10);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setColumns(10);
		txtidpromotor.setBounds(554, 124, 86, 20);
		contentPane.add(txtidpromotor);
		
		txtidmedio = new JTextField();
		txtidmedio.setColumns(10);
		txtidmedio.setBounds(554, 174, 86, 20);
		contentPane.add(txtidmedio);
		
		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBounds(554, 220, 86, 20);
		contentPane.add(txtidagencia);
		
		txtidvehiculos = new JTextField();
		txtidvehiculos.setColumns(10);
		txtidvehiculos.setBounds(554, 264, 86, 20);
		contentPane.add(txtidvehiculos);
		
		JLabel lblNewLabel_1 = new JLabel("ID origen");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(80, 99, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Destino");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(80, 61, 96, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtiddestino = new JTextField();
		txtiddestino.setBounds(210, 58, 86, 20);
		contentPane.add(txtiddestino);
		txtiddestino.setColumns(10);
		
		txtidorigen = new JTextField();
		txtidorigen.setColumns(10);
		txtidorigen.setBounds(210, 96, 86, 20);
		contentPane.add(txtidorigen);
		
		JLabel lblNewLabel_2 = new JLabel("Codigos");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(457, 354, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		txtcodigos = new JTextField();
		txtcodigos.setBounds(535, 351, 86, 20);
		contentPane.add(txtcodigos);
		txtcodigos.setColumns(10);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtcodigos.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(532, 389, 89, 80);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtiddestino.getText()), Integer.parseInt(txtidorigen.getText()) , txtFechaventa.getText(), txthoraventa.getText(), txtHorasalida.getText(), txtFechaejecucion.getText(),
				txtObservacion.getText(), Integer.parseInt(txtcodigocliente.getText()), Integer.parseInt(txtidpromotor.getText()),
				Integer.parseInt(txtidmedio.getText()), Integer.parseInt(txtidagencia.getText()), Integer.parseInt(txtidvehiculos.getText()),
				Integer.parseInt(txtPrecio.getText()), Integer.parseInt(txtcodigos.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(207, 389, 89, 80);
		contentPane.add(btnActualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtcodigos.getText()), txtFechaventa, txthoraventa, txtHorasalida, txtFechaejecucion, txtObservacion, txtPrecio);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.setBounds(350, 389, 89, 80);
		contentPane.add(btnConsultar);
	}

}
