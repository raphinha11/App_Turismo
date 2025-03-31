package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Medios {
	public int idmedio;
	public String nombre;
	public String obsrvacion;
	public int idtipomedio;
	public Medios(int idmedio, String nombre, String obsrvacion, int idtipomedio) {
		super();
		this.idmedio = idmedio;
		this.nombre = nombre;
		this.obsrvacion = obsrvacion;
		this.idtipomedio = idtipomedio;
	}
	
	
	public Medios() {
		super();
	}


	public int getIdmedio() {
		return idmedio;
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return obsrvacion;
	}
	public void setObservacion(String observacion) {
		this.obsrvacion = observacion;
	}
	public int getIdtipomedio() {
		return idtipomedio;
	}
	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}
	
Conexion conectar = new Conexion();
	
	public void create(String nombre, String obsrvacion, int idtipomedio) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tblmedios (nombre, obsrvacion, idtipomedio) values (?, ?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, nombre);
			pst.setString(2, obsrvacion);
			pst.setInt(3, idtipomedio);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	// Eliminar registro de la table agencias
	public void delete(int idmedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tblmedios WHERE idmedio = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idmedio);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedio + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idmedio + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
