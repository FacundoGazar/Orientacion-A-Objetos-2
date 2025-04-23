package ej10;

public interface EncriptadorEstrategia {
	public String encriptar(String message, String key);
	public String desencriptar(String mensajeCifrado, String key);
}
