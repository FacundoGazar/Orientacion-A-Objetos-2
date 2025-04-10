package ar.edu.unlp.info.oo1.ej8;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn() {
		this.pict = "And if my wishes came true It would've been you In my defense, I have none";
	}
	
	public String sendData(String data, Long crc) {
		return "Gracias por mandarnos data usando WifiConn, ahora sabemos que tu contraseña es 'aguantemoraylosmetegoles'";
	}
	
	public String pict() {
		return this.pict;
	}
}
