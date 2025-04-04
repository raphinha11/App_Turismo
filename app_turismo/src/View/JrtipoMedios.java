package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoMedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class JrtipoMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JButton btnGuardar;
	private JLabel lblNewLabel_1;
	private JTextField txtidtipomedio;
	private JButton btneliminar;
	TipoMedios cr = new TipoMedios();
	private JButton btnActualizar;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrtipoMedios frame = new JrtipoMedios();
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
	public JrtipoMedios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("Tipo de Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 343);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNombre.setBounds(50, 67, 70, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblObservacion.setBounds(50, 127, 91, 14);
		contentPane.add(lblObservacion);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(151, 64, 149, 20);
		contentPane.add(txtNombre);
		
		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(151, 124, 149, 20);
		contentPane.add(txtObservacion);
		
		JLabel lblNewLabel = new JLabel("Tipos De Medios");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(151, 11, 149, 26);
		contentPane.add(lblNewLabel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\guardar-datos (2).png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {

				
				cr.create(txtNombre.getText(), txtObservacion.getText());
				
			}
		});
		btnGuardar.setBounds(50, 200, 89, 73);
		contentPane.add(btnGuardar);
		
		lblNewLabel_1 = new JLabel("ID_TiposMedios");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(343, 39, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidtipomedio = new JTextField();
		txtidtipomedio.setBounds(343, 64, 86, 20);
		contentPane.add(txtidtipomedio);
		txtidtipomedio.setColumns(10);
		
		btneliminar = new JButton("Eliminar");
		btneliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidtipomedio.getText()));
			}
			
		});
		btneliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\eliminar (2).png"));
		btneliminar.setBounds(343, 98, 89, 73);
		contentPane.add(btneliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txtNombre.getText(), txtObservacion.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\actualizar.png"));
		btnActualizar.setBounds(191, 200, 89, 73);
		contentPane.add(btnActualizar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidtipomedio.getText()), txtNombre, txtObservacion);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\consulta.png"));
		btnConsultar.setBounds(343, 200, 89, 73);
		contentPane.add(btnConsultar);
	}

}
