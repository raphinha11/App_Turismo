package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JrPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JrPrincipal frame = new JrPrincipal();
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
	public JrPrincipal() {
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		setTitle("App Turismo");
		//setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 249, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencias = new JButton("Agencias");
		btnAgencias.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAgencias.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\agencia-de-mercadeo.png"));
		btnAgencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JrAgencias agencia = new JrAgencias();
				agencia.setVisible(true);
			}
		});
		btnAgencias.setBounds(346, 96, 239, 137);
		contentPane.add(btnAgencias);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\personas.png"));
		btnClientes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrClientes cliente = new JrClientes();
				cliente.setVisible(true);
			}
		});
		btnClientes.setBounds(603, 96, 242, 137);
		contentPane.add(btnClientes);
		
		JButton btnCompaias = new JButton("Compañias");
		btnCompaias.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\compania.png"));
		btnCompaias.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCompaias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrCompanias compania = new JrCompanias();
				compania.setVisible(true);
			}
		});
		btnCompaias.setBounds(80, 96, 242, 137);
		contentPane.add(btnCompaias);
		
		JButton btnMedios = new JButton("Medios");
		btnMedios.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\medios-de-comunicacion-social.png"));
		btnMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrMedios medios = new JrMedios();
				medios.setVisible(true);
			}
		});
		btnMedios.setBounds(866, 96, 239, 137);
		contentPane.add(btnMedios);
		
		JButton btnOperadores = new JButton("Operadores");
		btnOperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\conductor.png"));
		btnOperadores.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrOperadores operador = new JrOperadores();
				operador.setVisible(true);
			}
		});
		btnOperadores.setBounds(80, 303, 242, 137);
		contentPane.add(btnOperadores);
		
		JButton btnPaquetes = new JButton("Paquetes");
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\excursion.png"));
		btnPaquetes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPaquetes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrPaquetes paquete = new JrPaquetes();
				paquete.setVisible(true);
			}
		});
		btnPaquetes.setBounds(346, 303, 239, 137);
		contentPane.add(btnPaquetes);
		
		JButton btnPromotores = new JButton("Promotores");
		btnPromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\promotor.png"));
		btnPromotores.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPromotores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrPromotores promotor = new JrPromotores();
				promotor.setVisible(true);
			}
		});
		btnPromotores.setBounds(603, 303, 242, 137);
		contentPane.add(btnPromotores);
		
		JButton btnTipoMedios = new JButton("Tipo Medios");
		btnTipoMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\medios-de-comunicacion-en-masa.png"));
		btnTipoMedios.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnTipoMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrtipoMedios tipomedio = new JrtipoMedios();
				tipomedio.setVisible(true);
			}
		});
		btnTipoMedios.setBounds(866, 303, 239, 137);
		contentPane.add(btnTipoMedios);
		
		JButton btnTipoDeTransporte = new JButton("Tipo De Transporte");
		btnTipoDeTransporte.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\coche.png"));
		btnTipoDeTransporte.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnTipoDeTransporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrTipoTransporte transporte = new JrTipoTransporte();
				transporte.setVisible(true);
			}
		});
		btnTipoDeTransporte.setBounds(318, 514, 267, 137);
		contentPane.add(btnTipoDeTransporte);
		
		JButton btnVehiculos = new JButton("Vehiculos");
		btnVehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\88255_fiat_car_icon.png"));
		btnVehiculos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnVehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JrVehiculos vehiculo = new JrVehiculos();
				vehiculo.setVisible(true);
			}
		});
		btnVehiculos.setBounds(603, 514, 235, 137);
		contentPane.add(btnVehiculos);
		
		JLabel lblNewLabel = new JLabel("APP TURISMO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(454, 19, 239, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\java.png"));
		lblNewLabel_1.setBounds(1100, 620, 62, 64);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1891027_circle_global_globe_international_language_icon.png"));
		lblNewLabel_2.setBounds(395, 19, 56, 54);
		contentPane.add(lblNewLabel_2);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btnAgencias, btnClientes, btnCompaias, btnMedios, btnOperadores, btnPaquetes, btnPromotores, btnTipoMedios, btnTipoDeTransporte, btnVehiculos, lblNewLabel, lblNewLabel_1, lblNewLabel_2}));
	}
}
