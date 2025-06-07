package ej18.ej18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class FileComponentTest {
	private FileComponent fileoo2;
	private FileComponent decoradorNombre;
	private FileComponent decoradorTamano;
	private FileComponent decoradorExtension;
	private FileComponent decoradorFechaCreacion;
	private FileComponent decoradorFechaModificacion;
	private FileComponent decoradorPermisos;
	private List<String> permisos;
	private FileComponent decoradorConTodos;
	
	@BeforeEach
	void setUp() throws Exception {
		this.permisos = new ArrayList<>();
		permisos.add("Permiso 1");
		permisos.add("Permiso 2");
		this.fileoo2 = new FileOO2("the lucky one", "mp3", 7.0, permisos);
		this.decoradorNombre = new NombreDecorator(this.fileoo2);
		this.decoradorTamano = new TamanoDecorator(this.fileoo2);
		this.decoradorExtension = new ExtensionDecorator(this.fileoo2);
		this.decoradorFechaCreacion = new FechaCreacionDecorator(this.fileoo2);
		this.decoradorFechaModificacion = new FechaModificacionDecorator(this.fileoo2);
		this.decoradorPermisos = new PermisosDecorator(this.fileoo2);
		this.decoradorConTodos = new NombreDecorator(new TamanoDecorator(new ExtensionDecorator(new FechaCreacionDecorator(new FechaModificacionDecorator(new PermisosDecorator(this.fileoo2))))));
	}
	
	@Test
	public void prettyPrintTest() {
		assertEquals("the lucky one", this.decoradorNombre.prettyPrint());
		assertEquals("the lucky one - mp3", this.decoradorExtension.prettyPrint());
		assertEquals("the lucky one - 7.0", this.decoradorTamano.prettyPrint());
		assertEquals("the lucky one - 2025-06-06", this.decoradorFechaCreacion.prettyPrint());
		assertEquals("the lucky one - 2025-06-06", this.decoradorFechaModificacion.prettyPrint());
		assertEquals("the lucky one - [Permiso 1, Permiso 2]", this.decoradorPermisos.prettyPrint());
		assertEquals("the lucky one - [Permiso 1, Permiso 2] - 2025-06-06 - 2025-06-06 - mp3 - 7.0", this.decoradorConTodos.prettyPrint());
	}
}
