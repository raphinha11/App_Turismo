package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Operadores {
	public int idpromotor;
	public String tipodocumento;
	public int documento;
	public String nombre;
	public String apellido;
	public String direccion;
	public String telefono;
	public String correo;
	public int idvehiculos;
	public Operadores(int idpromotor, String tipodocumento, int documento, String nombre, String apellido,
			String direccion, String telefono, String correo, int idvehiculos) {
		super();
		this.idpromotor = idpromotor;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.idvehiculos = idvehiculos;
	}
	
	
	public Operadores() {
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
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getIdvehiculos() {
		return idvehiculos;
	}
	public void setIdvehiculos(int idvehiculos) {
		this.idvehiculos = idvehiculos;
	}
	
Conexion conectar = new Conexion();
	
	public void create(String tipodocumento, int documento, String nombre, String apellido,
			String direccion, String telefono, String correo, int idvehiculos) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tbloperadores (tipodocumento, documento, nombre, apellido, direccion, telefono, correo, idvehiculos) values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setString(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, telefono);
			pst.setString(7, correo);
			pst.setInt(8, idvehiculos);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}


}
