package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class JrMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JLabel lblNewLabel;
	private JButton btnGuardar;
	private JTextField txtidtipomedio;
	private JLabel lblNewLabel_1;
	private JTextField txtidmedios;
	private JButton btnEliminar;
	Medios cr = new Medios();
	private JButton btnActualizar;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrMedios frame = new JrMedios();
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
	public JrMedios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblnombre.setBounds(57, 82, 61, 20);
		contentPane.add(lblnombre);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblobservacion.setBounds(52, 143, 80, 20);
		contentPane.add(lblobservacion);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(144, 82, 158, 20);
		contentPane.add(txtNombre);
		
		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(144, 143, 158, 20);
		contentPane.add(txtObservacion);
		
		lblNewLabel = new JLabel("MEDIOS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(196, 31, 89, 14);
		contentPane.add(lblNewLabel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtNombre.getText(), txtObservacion.getText(), Integer.parseInt(txtidtipomedio.getText()));
			}
		});
		btnGuardar.setBounds(57, 252, 89, 73);
		contentPane.add(btnGuardar);
		
		JLabel lblidmedio = new JLabel("ID_Tipo_Medios");
		lblidmedio.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblidmedio.setBounds(57, 204, 108, 14);
		contentPane.add(lblidmedio);
		
		txtidtipomedio = new JTextField();
		txtidtipomedio.setBounds(159, 201, 86, 20);
		contentPane.add(txtidtipomedio);
		txtidtipomedio.setColumns(10);
		
		lblNewLabel_1 = new JLabel("ID_Medios");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(370, 61, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(358, 82, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidmedios.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btnEliminar.setBounds(358, 125, 89, 83);
		contentPane.add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txtNombre.getText(), txtObservacion.getText(), Integer.parseInt(txtidtipomedio.getText()), Integer.parseInt(txtidmedios.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(211, 252, 89, 73);
		contentPane.add(btnActualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidmedios.getText()), txtNombre, txtObservacion);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.setBounds(358, 252, 89, 73);
		contentPane.add(btnConsultar);
	}
}
