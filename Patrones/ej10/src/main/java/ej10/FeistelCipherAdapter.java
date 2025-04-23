package ej10;

public class FeistelCipherAdapter implements EncriptadorEstrategia{
	private FeistelCipher encriptador;
	
	public String encriptar(String message, String key) {
		this.encriptador = new FeistelCipher(key);
		
		return this.encriptador.encode(message);
	}
	
	public String desencriptar(String mensajeCifrado, String key) {
		this.encriptador = new FeistelCipher(key);
		
		return this.encriptador.encode(mensajeCifrado);
	}
}
