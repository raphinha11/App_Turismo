package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Clientes {
	public int codigocliente;
	public String tipodocumento;
	public int numerodocumento;
	public String nombre;
	public String apellido;
	public String direccion;
	public String eps;
	public String alergias;
	public String fechanacimiento;
	public String telefono;
	public String estadocivil;
	public String correo;

	public Clientes(int codigocliente, String tipodocumento, int numerodocumento, String nombre, String apellido,
			String direccion, String eps, String alergias, String fechanacimiento, String telefono, String estadocivil,
			String correo) {
		super();
		this.codigocliente = codigocliente;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.estadocivil = estadocivil;
		this.correo = correo;
	}

	public Clientes() {
		super();
	}

	public int getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigocliente = codigocliente;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public int getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(int numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	Conexion conectar = new Conexion();

	public void create(String tipodocumento, int numerodocumento, String nombre, String apellido, String direccion,
			String eps, String alergias, String fechanacimiento, String telefono, String estadocivil, String correo) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblclientes (tipodocumento, numerodocumento, nombre, apellido, direccion, eps, alergias, fechanacimiento, telefono, estadocivil, correo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnetion = conectar.conectarBD(); // abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, eps);
			pst.setString(7, alergias);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			pst.setString(10, estadocivil);
			pst.setString(11, correo);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// Eliminar registro de la table agencias
	public void delete(int codigocliente) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tblclientes WHERE codigocliente = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, codigocliente);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigocliente + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + codigocliente + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
	
	public void update(String tipodocumento, int numerodocumento, String nombre, String apellido, String direccion,
			String eps, String alergias, String fechanacimiento, String telefono, String estadocivil, String correo) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "UPDATE tblclientes SET tipodocumento = ?, numerodocumento = ?, nombre = ?, apellido = ?, direccion = ?, eps = ?,alergias = ?, fechanacimiento = ?, telefono = ?, estadocivil = ?, correo = ? WHERE codigocliente = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo

			pst.setString(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, eps);
			pst.setString(7, alergias);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			pst.setString(10, estadocivil);
			pst.setString(11, correo);
			
			
			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿desea actualizar esta fila?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila actualizada");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void read(int codigocliente, JTextField tipodocumento, JTextField numerodocumento, JTextField nombre, JTextField apellido, JTextField direccion, JTextField eps, JTextField alergias, JTextField fechanacimiento, JTextField telefono, JTextField estadocivil, JTextField correo ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "SELECT * FROM tblclientes WHERE codigocliente = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, codigocliente);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				numerodocumento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				eps.setText(rs.getString(7));
				alergias.setText(rs.getString(8));
				fechanacimiento.setText(rs.getString(9));
				telefono.setText(rs.getString(10));
				estadocivil.setText(rs.getString(11));
				correo.setText(rs.getString(12));
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}


}
