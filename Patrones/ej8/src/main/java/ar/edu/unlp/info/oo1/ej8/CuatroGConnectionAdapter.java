package ar.edu.unlp.info.oo1.ej8;

public class CuatroGConnectionAdapter implements Connection{
	private CuatroGConnection cuatroGConnection;
	
	public CuatroGConnectionAdapter() {
		this.cuatroGConnection = new CuatroGConnection();
	}
	
	public String sendData(String data, Long crc) {
		return this.cuatroGConnection.transmit(data,crc);
	}
	
	public String pict() {
		return this.cuatroGConnection.symb();
	}
}
