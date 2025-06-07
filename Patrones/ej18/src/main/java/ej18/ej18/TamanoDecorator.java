package ej18.ej18;

public class TamanoDecorator extends FileDecorator{
	public TamanoDecorator(FileComponent component) {
		super(component);
	}
	
	public String prettyPrint() {
		return this.getComponent().prettyPrint()+ " - " + this.getTamano();
	}
}
