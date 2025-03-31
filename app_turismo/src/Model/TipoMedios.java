package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class TipoMedios {
	public int idtipomedio;
	public String nombre;
	public String observacion;
	public TipoMedios(int idtipomedio, String nombre, String observacion) {
		super();
		this.idtipomedio = idtipomedio;
		this.nombre = nombre;
		this.observacion = observacion;
	}
	
	public TipoMedios() {
		super();
	}

	public int getIdtipomedio() {
		return idtipomedio;
	}
	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	Conexion conectar = new Conexion();
	
	public void create(String nombre, String observacion) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tbltipomedios (nombre, observacion) values (?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
