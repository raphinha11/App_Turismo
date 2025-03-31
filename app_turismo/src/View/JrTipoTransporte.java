package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoTrasporte;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JrTipoTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrTipoTransporte frame = new JrTipoTransporte();
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
	public JrTipoTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(47, 97, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(47, 152, 82, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblTiposDeTransporte = new JLabel("Tipos De Transporte");
		lblTiposDeTransporte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTiposDeTransporte.setBounds(150, 11, 140, 19);
		contentPane.add(lblTiposDeTransporte);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(176, 94, 140, 20);
		contentPane.add(txtNombre);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(176, 149, 140, 20);
		contentPane.add(txtDescripcion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoTrasporte cr = new TipoTrasporte();
				cr.create(txtNombre.getText(), txtDescripcion.getText());
			}
		});
		btnGuardar.setBounds(170, 203, 89, 23);
		contentPane.add(btnGuardar);
	}
}
