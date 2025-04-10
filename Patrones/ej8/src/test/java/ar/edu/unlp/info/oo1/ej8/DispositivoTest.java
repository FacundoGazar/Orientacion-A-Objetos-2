package ar.edu.unlp.info.oo1.ej8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	Connection connection;
	CRCCalculator crcCalculator;
	Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() throws Exception {
		crcCalculator = new CRC16_Calculator();
		connection = new WifiConn();
		dispositivo = new Dispositivo();
	}
	
	@Test
	void sendConWifiConnTest() {
		assertEquals("Gracias por mandarnos data usando WifiConn, ahora sabemos que tu contraseña es 'aguantemoraylosmetegoles'", dispositivo.send("hola buenas tardes"));
	}
	
	@Test
	void sendConCuatroGTest() {
		dispositivo.conectarCon(new CuatroGConnectionAdapter());
		assertEquals("GRACIAS POR MANDARNOS TUS DATOS, SIEMPRE PODES CONFIAR EN 4GCONNECTION. SOMOS TUS BUENOS AMIGOS.", dispositivo.send("onepiece"));
	}
	
	@Test
	void configurarCRC() {
		assertEquals("Cambiaste de crc", dispositivo.configurarCRC(new CRC16_Calculator()));
		assertEquals("Cambiaste de crc", dispositivo.configurarCRC(new CRC32_Calculator()));
	}
	
	@Test
	void conectarConWifiConn() {
		assertEquals("And if my wishes came true It would've been you In my defense, I have none", dispositivo.conectarCon(new WifiConn()));
	}
	
	@Test
	void conectarConCuatroG() {
		assertEquals("And isn't it just so pretty to think All along there was some Invisible string Tying you to me?", dispositivo.conectarCon(new CuatroGConnectionAdapter()));
	}
}
