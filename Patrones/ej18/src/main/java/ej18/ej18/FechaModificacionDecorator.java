package ej18.ej18;

public class FechaModificacionDecorator extends FileDecorator{
	public FechaModificacionDecorator(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint()+ " - " + this.getFechaModificacion().toString();
	}
}
