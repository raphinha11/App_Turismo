package Model;

import java.util.Collection;

import javax.swing.JOptionPane; 

import Controller.Conexion; 

public class test {

	public static void main(String[] args) {
		Conexion test = new Conexion(); 
		
		if (test.conectarBD() != null) { 
			JOptionPane.showConfirmDialog(null, "Conectado a la BD"); 	 
			} else { 
				JOptionPane.showConfirmDialog(null, "No Conectado a la BD"); 
			}
		
	}

}
