package shake256;

public class CreateHashShake256 {	
	
	public static String hashMethod(String text) {
		byte[] messageBytes = Shake256Utilities.getMessageBytes(text);

		byte[] hashBytes = Shake256Utilities.getHashBytes(messageBytes);
		
		String hashHex = Shake256Utilities.getHashHexMessage(hashBytes);
		return hashHex;
	}
}