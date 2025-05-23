package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Vehiculos {
	public int idvehiculos;
	public int Matricula;
	public String Marca;
	public String capacidad;
	public String modelo;
	public String categoria;
	public int idtipotransporte;
	public Vehiculos(int idvehiculos, int matricula, String marca, String capacidad, String modelo, String categoria,
			int idtipotransporte) {
		super();
		this.idvehiculos = idvehiculos;
		Matricula = matricula;
		Marca = marca;
		this.capacidad = capacidad;
		this.modelo = modelo;
		this.categoria = categoria;
		this.idtipotransporte = idtipotransporte;
	}
	
	
	public Vehiculos() {
		super();
	}


	public int getIdvehiculos() {
		return idvehiculos;
	}
	public void setIdvehiculos(int idvehiculos) {
		this.idvehiculos = idvehiculos;
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdtipotransporte() {
		return idtipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}
	
Conexion conectar = new Conexion();
	
	public void create(int matricula, String marca, String capacidad, String modelo, String categoria,
			int idtipotransporte) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; //preparar la trx
		
		String script = "INSERT INTO tblvehiculos (matricula, marca, capacidad, modelo, categoria, idtipotransporte) values (?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnetion  = conectar.conectarBD(); //abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setInt(1, matricula);
			pst.setString(2, marca);
			pst.setString(3, capacidad);
			pst.setString(4, modelo);
			pst.setString(5, categoria);
			pst.setInt(6, idtipotransporte);
			
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	// Eliminar registro de la table agencias
	public void delete(int idvehiculos) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tblvehiculos WHERE idvehiculos = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idvehiculos);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idvehiculos + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idvehiculos + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public void update(int matricula, String marca, String capacidad, String modelo, String categoria,
			int idtipotransporte, int idvehiculos) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "UPDATE tblvehiculos SET matricula = ?, marca = ?, capacidad = ?, modelo = ?, categoria = ?, idtipotransporte = ?  WHERE idvehiculos = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo

			pst.setInt(1, matricula);
			pst.setString(2, marca);
			pst.setString(3, capacidad);
			pst.setString(4, modelo);
			pst.setString(5, categoria);
			pst.setInt(6, idtipotransporte);
			pst.setInt(7, idvehiculos);
	
			
			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿desea actualizar esta fila?");

			if (resp == JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila actualizada");
			}else {
				JOptionPane.showConfirmDialog(null, "Operacion Cancelada!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void read(int idvehiculos, JTextField matricula, JTextField marca, JTextField capacidad, JTextField modelo, JTextField categoria ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "SELECT * FROM tblvehiculos WHERE idvehiculos = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, idvehiculos);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				matricula.setText(rs.getString(2));
				marca.setText(rs.getString(3));
				capacidad.setText(rs.getString(4));
				modelo.setText(rs.getString(5));
				categoria.setText(rs.getString(6));
				
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

 
}
