package shake256;

import uk.org.bobulous.java.crypto.keccak.FIPS202;
import uk.org.bobulous.java.crypto.keccak.KeccakSponge;

public class Shake256Utilities {
	private static KeccakSponge sponge = FIPS202.ExtendableOutputFunction.SHAKE256.withOutputLength(512);

	public static byte[] getMessageBytes(String text) {
		byte[] messageBytes = text.getBytes();
		
		return messageBytes;
	}
	
	public static byte[] getHashBytes(byte[] messageBytes) {
		byte[] hashBytes = sponge.apply(messageBytes);
		
		return hashBytes;
	}
	
	public static String getHashHexMessage(byte[] hashBytes) {
		String hashHexMessage = FIPS202.hexFromBytes(hashBytes).toLowerCase();
		
		return hashHexMessage;
	}
}