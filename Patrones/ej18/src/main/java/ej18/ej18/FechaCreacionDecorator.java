package ej18.ej18;

public class FechaCreacionDecorator extends FileDecorator{
	public FechaCreacionDecorator(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint()+ " - " + this.getFechaCreacion().toString();
	}
}
