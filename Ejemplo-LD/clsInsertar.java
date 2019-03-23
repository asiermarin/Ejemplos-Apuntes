package LD;

//import java.sql.* ---->importamos todas las clases del paquete java.sql
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Ignacio Chapero
 * 		   Alvaro Husillos
 * 
 *La clase sirve para insertar un registro en la base de datos. Previamente, realiza una
 *conexi�n con la base de datos, y despu�s de realizar el insert, vuelve a cerrar la conexi�n.
 */
public class clsInsertar {
	
	public void insertarBD(int id, String nombre, String apellido, String dni) {
		
		// Instancias la clase que hemos creado anteriormente
	    clsConexionBD SQL = new clsConexionBD();
	    
		// Llamas al m�todo que tiene la clase y te devuelve una conexi�n
	    Connection objConn = SQL.conectarBD();
	    
	    try { 
		    if ( objConn != null ) {
		    	// Preparamos la insert 
		    	String query = "insert into alumno (id, nombre, apellido, dni) values (?, ?, ?, ?)";
		    	
		    	//Creamos las preparedstaments
		    	PreparedStatement objSt = objConn.prepareStatement(query);
		    	objSt.setInt(1, id);
		    	objSt.setString(2, nombre);
		    	objSt.setString(3, apellido);
		    	objSt.setString(4, dni);
		    	
		    	//Ejecutamos la query que hemos preparado
		  		objSt.execute();
		    	
		    	System.out.println("Se ha insertado el registro correctamente");
		    	
		    	//Cerramos el preparedStatement
		    	objSt.close();
		    	
		    	//Cerramos la conexi�n
		    	objConn.close();
		    	
		    } else {
		    	System.out.println("No existe conexi�n");
		    }
	    
	    } catch (SQLException e) {
	        System.out.println("No se ha podido realizar el insert: " + e);
	    }
	}

}

