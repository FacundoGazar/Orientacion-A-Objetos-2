package ar.edu.unlp.info.oo1.ej8;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRCCalculator{
	
	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		crc.update(data.getBytes());
		long result = crc.getValue();
		return result;
	}
}
