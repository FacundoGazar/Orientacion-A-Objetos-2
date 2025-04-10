package ar.edu.unlp.info.oo1.ej8;

public class CuatroGConnection{
	private String symb;
	
	public CuatroGConnection() {
		this.symb = "And isn't it just so pretty to think All along there was some Invisible string Tying you to me?";
	}
	
	public String transmit(String data, Long crc) {
		return "GRACIAS POR MANDARNOS TUS DATOS, SIEMPRE PODES CONFIAR EN 4GCONNECTION. SOMOS TUS BUENOS AMIGOS.";
	}
	
	public String symb() {
		return this.symb;
	}
}
