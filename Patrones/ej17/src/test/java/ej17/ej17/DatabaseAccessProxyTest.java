package ej17.ej17;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessProxyTest {
	private DatabaseAccess databaseProxy;
	
	@BeforeEach
	void setUp() throws Exception{
		this.databaseProxy = new DatabaseAccessProxy(new DatabaseRealAccess());
	}
	
	//Como no hice el login estos dos metodos van a devolver una Excepcion en vez de un String de fallo pero bueno imaginemos que devuelven un Stirng porque van a fallar si o si
	@Test
    void testGetSearchResults() {
        assertEquals("No tiene acceso a la base de datos, inicie sesion!", this.databaseProxy.getSearchResults("select * from comics where id=1"));    
	}

    @Test
    void testInsertNewRow() {
        assertEquals("No tiene acceso a la base de datos, inicie sesion!", this.databaseProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}
