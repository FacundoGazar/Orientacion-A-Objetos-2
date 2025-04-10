package ar.edu.unlp.info.oo1.ej8;

public class Dispositivo {
	private CRCCalculator crcCalculatorStrategy;
	private Connection connectionStrategy;
	private Ringer ringer;
	private Display display;
	
	public Dispositivo() {
		this.crcCalculatorStrategy = new CRC16_Calculator();
		this.connectionStrategy = new WifiConn();
		this.ringer = new Ringer();
		this.display = new Display();
	}
	
	public String send(String data) {
		long crc = this.crcCalculatorStrategy.crcFor(data);
		return this.connectionStrategy.sendData(data, crc);
	}
	
	public String conectarCon(Connection conecctionStrategy) {
		this.connectionStrategy = conecctionStrategy;
		this.display.showBanner(conecctionStrategy.pict());
		this.ringer.ring();
		return connectionStrategy.pict();
	}
	
	public String configurarCRC(CRCCalculator crcCalculatorStrategy) {
		this.crcCalculatorStrategy = crcCalculatorStrategy;
		return "Cambiaste de crc";
	}
}
