package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Paquetes {
	public int codigos;
	public int iddestino;
	public int idorigen;
	public String fechaventa;
	public String horaventa;
	public String horasalida;
	public String fechaejecucion;
	public String observacion;
	public int codigocliente;
	public int idpromotor;
	public int idmedio;
	public int idagencia;
	public int idvehiculos;
	public double precio;

	public Paquetes(int codigos, int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion, int codigocliente, int idpromotor, int idmedio, int idagencia,
			int idvehiculos, double precio) {
		super();
		this.codigos = codigos;
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.horasalida = horasalida;
		this.fechaejecucion = fechaejecucion;
		this.observacion = observacion;
		this.codigocliente = codigocliente;
		this.idpromotor = idpromotor;
		this.idmedio = idmedio;
		this.idagencia = idagencia;
		this.idvehiculos = idvehiculos;
		this.precio = precio;
	}

	public Paquetes() {
		super();
	}

	public int getCodigos() {
		return codigos;
	}

	public void setCodigos(int codigos) {
		this.codigos = codigos;
	}

	public int getIddestino() {
		return iddestino;
	}

	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}

	public int getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}

	public String getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}

	public String getHoraventa() {
		return horaventa;
	}

	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getFechaejecucion() {
		return fechaejecucion;
	}

	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigocliente = codigocliente;
	}

	public int getIdpromotor() {
		return idpromotor;
	}

	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}

	public int getIdmedio() {
		return idmedio;
	}

	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public int getIdvehiculos() {
		return idvehiculos;
	}

	public void setIdvehiculos(int idvehiculos) {
		this.idvehiculos = idvehiculos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	Conexion conectar = new Conexion();

	public void create(int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion, int codigocliente, int idpromotor, int idmedio, int idagencia,
			int idvehiculos, double precio) {
		Connection dbConnetion = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblpaquetes ( iddestino, idorigen, fechaventa, horaventa, horasalida, fechaejecucion, observacion, codigocliente, idpromotor, idmedio, idagencia, idvehiculos, precio) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnetion = conectar.conectarBD(); // abrir la conexion
			pst = dbConnetion.prepareStatement(script);
			//
			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observacion);
			pst.setInt(8, codigocliente);
			pst.setInt(9, idpromotor);
			pst.setInt(10, idmedio);
			pst.setInt(11, idagencia);
			pst.setInt(12, idvehiculos);
			pst.setDouble(13, precio);
			//
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// Eliminar registro de la table agencias
	public void delete(int codigos) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "DELETE FROM tblpaquetes WHERE codigos = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, codigos);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigos + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + codigos + "eliminado");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
	
	public void update(int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion, int codigocliente, int idpromotor, int idmedio, int idagencia,
			int idvehiculos, double precio, int codigos) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "UPDATE tblpaquetes SET iddestino = ?, idorigen = ?, fechaventa = ?, horaventa = ?, horasalida = ?, fechaejecucion = ?, observacion = ?, codigocliente = ?, idpromotor = ?, idagencia = ?, idvehiculos = ?, precio = ? WHERE codigos = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo

			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observacion);
			pst.setInt(8, codigocliente);
			pst.setInt(9, idpromotor);
			pst.setInt(10, idmedio);
			pst.setInt(11, idagencia);
			pst.setInt(12, idvehiculos);
			pst.setDouble(13, precio);
			pst.setInt(14, codigos);
			
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

	public void read(int codigos, JTextField fechaventa, JTextField horaventa, JTextField horasalida, JTextField fechaejecucion, JTextField observacion, JTextField precio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "SELECT * FROM tblpaquetes WHERE codigos = ?";

		try {
			dbConnection = conectar.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script);

			pst.setInt(1, codigos);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				fechaventa.setText(rs.getString(4));
				horaventa.setText(rs.getString(5));
				horasalida.setText(rs.getString(6));
				fechaejecucion.setText(rs.getString(7));
				observacion.setText(rs.getString(8));
				precio.setText(rs.getString(14));
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}


}
