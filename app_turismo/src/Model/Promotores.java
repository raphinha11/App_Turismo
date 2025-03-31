package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Promotores {
	public int idpromotor;
	public String tipodocumento;
	public int numerodocumento;
	public String nombre;
	public String apellido;
	public String direccion;
	public String telefono;
	public String correoperonal;
	public String correocorp;
	public String fechanacimiento;
	public Promotores(int idpromotor, String tipodocumento, int numerodocumento, String nombre, String apellido,
			String direccion, String telefono, String correoperonal, String correocorp, String fechanacimiento) {
		super();
		this.idpromotor = idpromotor;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoperonal = correoperonal;
		this.correocorp = correocorp;
		this.fechanacimiento = fechanacimiento;
	}
	
	
	public Promotores() {
		super();
	}


	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoperonal() {
		return correoperonal;
	}
	public void setCorreoperonal(String correoperonal) {
		this.correoperonal = correoperonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
Conexion conectar = new Conexion();
	
	public void create(String tipodocumento, int numerodocumento, String nombre, String apellido,
			String direccion, String telefono, String correoperonal, String correocorp, String fechanacimiento) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tblpromotores (tipodocumento, numerodocumento, nombre, apellido, direccion, telefono, correoperonal, correocorp, fechanacimiento) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, telefono);
			pst.setString(7, correoperonal);
			pst.setString(8, correocorp);
			pst.setString(9, fechanacimiento);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// Eliminar registro de la table agencias
	public void delete(int idpromotor) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tblpromotores WHERE idpromotor = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idpromotor);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idpromotor + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idpromotor + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}


}
