package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Agencias {
	public int idagencia;
	public String nombre;
	public String dirccion;
	public String tlefono;
	public String correo;
	public String web;
	public int idcompania;
	public Agencias(int idagencia, String nombre, String direccion, String telefono, String correo,
			String web, int idcompania) {
		super();
		this.idagencia = idagencia;
		this.nombre = nombre;
		this.dirccion = direccion;
		this.tlefono = telefono;
		this.correo = correo;
		this.web = web;
		this.idcompania = idcompania;
	}
	
	
	public Agencias() {
		super();
	}


	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return dirccion;
	}
	public void setDireccion(String direccion) {
		this.dirccion = direccion;
	}
	public String getTelefono() {
		return tlefono;
	}
	public void setTelefono(String telefono) {
		this.tlefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	
Conexion conectar = new Conexion();
	
	public void create( String nombre, String dirccion, String tlefono, String correo,
			String web, int idcompania) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tblagencias (nombre, dirccion, tlefono, correo, web, idcompania) values (?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, nombre);
			pst.setString(2, dirccion);
			pst.setString(3, tlefono);
			pst.setString(4, correo);
			pst.setString(5, web);
			pst.setInt(6, idcompania);
			
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
