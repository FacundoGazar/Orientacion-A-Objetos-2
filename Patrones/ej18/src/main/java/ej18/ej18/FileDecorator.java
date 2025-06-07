package ej18.ej18;

import java.time.LocalDate;
import java.util.List;

public class FileDecorator implements FileComponent{
	private FileComponent component;
	
	public FileDecorator(FileComponent component) {
		this.component = component;
	}
	
	public String prettyPrint() {
		return this.component.prettyPrint();
	}
	
	public FileComponent getComponent() {
		return this.component;
	}
	
	public String getNombre() {
		return this.component.getNombre();
	}

	public String getExtension() {
		return this.component.getExtension();
	}

	public Double getTamano() {
		return this.component.getTamano();
	}

	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	public List<String> getPermisos() {
		return this.component.getPermisos();
	}
}
