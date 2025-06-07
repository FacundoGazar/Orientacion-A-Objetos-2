package ej18.ej18;

import java.time.LocalDate;
import java.util.List;

public interface FileComponent {
	public String getNombre();
	public String getExtension();
	public Double getTamano();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public List<String> getPermisos();
	public String prettyPrint();
}
