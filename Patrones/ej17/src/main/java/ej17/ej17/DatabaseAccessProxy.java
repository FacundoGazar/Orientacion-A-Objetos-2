package ej17.ej17;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess{
	private DatabaseRealAccess databaseRealAccess;
	
	public DatabaseAccessProxy(DatabaseRealAccess aRealDatabaseAccess) {
		this.databaseRealAccess= aRealDatabaseAccess; 
	}
	
	
	//Aca deberia hacer un login y eso pero supongamos que el usuario no tiene permiso
	public Boolean checkAccess() {
		return false;
	}
	
	public int insertNewRow(List<String> rowData) {
		if(!this.checkAccess()) {
			throw new RuntimeException("No tiene acceso a la base de datos, inicie sesion!"); 
		}
		return this.databaseRealAccess.insertNewRow(rowData);
	}
	
	public Collection<String> getSearchResults(String queryString){
		if(!this.checkAccess()) {
			throw new RuntimeException("No tiene acceso a la base de datos, inicie sesion!");
		}
		return this.databaseRealAccess.getSearchResults(queryString);
	}
}
