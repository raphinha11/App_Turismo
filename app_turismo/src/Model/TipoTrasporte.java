package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class TipoTrasporte {
	public int idtipotransporte;
	public String nombre;
	public String descrpcion;
	public TipoTrasporte(int idtipotransporte, String nombre, String descrpcion) {
		super();
		this.idtipotransporte = idtipotransporte;
		this.nombre = nombre;
		this.descrpcion = descrpcion;
	}
	
	
	public TipoTrasporte() {
		super();
	}



	public int getIdtipotransporte() {
		return idtipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescrpcion() {
		return descrpcion;
	}
	public void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}
	
Conexion conectar = new Conexion();
	
	public void create(String nombre, String descrpcion) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tbltipotransporte (nombre, descrpcion) values (?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, nombre);
			pst.setString(2, descrpcion);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	// Eliminar registro de la table agencias
	public void delete(int idtipotransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tbltipotransporte WHERE idtipotransporte = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idtipotransporte);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipotransporte + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idtipotransporte + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}


}
