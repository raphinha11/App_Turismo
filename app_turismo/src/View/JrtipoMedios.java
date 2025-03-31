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

public class JrtipoMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JButton btnGuardar;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 100, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(50, 146, 70, 14);
		contentPane.add(lblObservacion);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(169, 97, 149, 20);
		contentPane.add(txtNombre);
		
		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(169, 143, 149, 20);
		contentPane.add(txtObservacion);
		
		JLabel lblNewLabel = new JLabel("Tipos De Medios");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(151, 11, 129, 26);
		contentPane.add(lblNewLabel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {

				TipoMedios cr = new TipoMedios();
				cr.create(txtNombre.getText(), txtObservacion.getText());
				
			}
		});
		btnGuardar.setBounds(169, 203, 89, 23);
		contentPane.add(btnGuardar);
	}

}
