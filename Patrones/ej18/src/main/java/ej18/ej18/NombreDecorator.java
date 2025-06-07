package ej18.ej18;

public class NombreDecorator extends FileDecorator{
	public NombreDecorator(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint();
	}
}
