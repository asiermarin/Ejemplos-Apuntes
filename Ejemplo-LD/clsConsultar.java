package LD;

//import java.sql.* ---->importamos todas las clases del paquete java.sql
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ignacio Chapero
 * 		   Alvaro Husillos
 * 
 *La clase sirve para ejecutar una consulta en la base de datos. Previamente, realiza una
 *conexi�n con la base de datos, y despu�s de realizar la consulta, vuelve a cerrar la conexi�n.
 */
public class clsConsultar {
	
	public void consultarBD() {
		// Instancias la clase que hemos creado anteriormente
	    clsConexionBD SQL = new clsConexionBD();
	    
		// Llamas al m�todo que tiene la clase y te devuelve una conexi�n
	    Connection objConn = SQL.conectarBD();
	    
	    try { 
		    if ( objConn != null ) {
		    	// Preparamos la consulta 
		    	Statement st = objConn.createStatement(); 
		    	ResultSet rs = st.executeQuery ("select * from alumno");
		    	
		    	System.out.println("ALUMNOS RECUPERADOS");
		    	System.out.println("-------------------");
		    	
		    	// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
		    	while (rs.next()) 
		    	{ 
		    	    System.out.println (rs.getInt ("id") + " " + rs.getString ("nombre") + " " + 
		    	    		rs.getString("apellido")  + " " + rs.getString("dni")); 
		    	}
		    	
		    	//Cerramos el resulset
		    	rs.close();
		    	//Cerramos el statement
		    	st.close();
		    	//Cerramos la conexi�n
		    	objConn.close();
		    	
		    } else {
		    	System.out.println("No existe conexi�n");
		    }
	    
	    } catch (SQLException e) {
	        System.out.println("Ha fallado la consulta: " + e);
	    }
	}

}
