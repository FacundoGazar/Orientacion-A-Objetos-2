package ej10;

public class Mensajero {
	private EncriptadorEstrategia encriptadorEstrategia;
	
	public Mensajero() {
		this.encriptadorEstrategia = new RC4();
	}
	
	public void setEstrategia(EncriptadorEstrategia encriptadorEstrategia) {
		this.encriptadorEstrategia = encriptadorEstrategia;
	}
	
	public String enviar(String mensaje, String key) {
		return this.encriptadorEstrategia.encriptar(mensaje, key);
	}
	
	public String recibir(String mensaje, String key) {
		return this.encriptadorEstrategia.desencriptar(mensaje, key);
	}
}
