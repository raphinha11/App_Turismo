package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Companias {
	public int idcompania;
	public String razonsocial;
	public String direccion;
	public String telefono;
	public String correo;
	public String fechacreacion;
	public String web;

	public Companias(int idcompania, String razonsocial, String direccion, String telefono, String correo,
			String fechacreacion, String web) {
		super();
		this.idcompania = idcompania;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.fechacreacion = fechacreacion;
		this.web = web;
	}

	public Companias() {
		super();
	}

	public int getIdcompanias() {
		return idcompania;
	}

	public void setIdcompanias(int idcompania) {
		this.idcompania = idcompania;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	Conexion conectar = new Conexion();

	public void create(String razonsocial, String direccion, String telefono, String correo, String fechacreacion,
			String web) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblcompanias (razonsocial, direccion, telefono, correo, fechacreacion, web) values (?, ?, ?, ?, ?, ?)";

		try {
			dbConnetion = conectar.conectarBD(); // abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, telefono);
			pst.setString(4, correo);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);

			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// Eliminar registro de la table agencias
	public void delete(int idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tblcompanias WHERE idcompania = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idcompania);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idcompania + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idcompania + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}
