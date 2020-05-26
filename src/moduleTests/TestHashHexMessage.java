package moduleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import shake256.Shake256Utilities;

class TestHashHexMessage {

	@Test
	@Tag("TEST010")
	void test() {
		String text = "Test Program";
		byte[] messageBytes = Shake256Utilities.getMessageBytes(text);
		byte[] hashedMessageBytes = Shake256Utilities.getHashBytes(messageBytes);
		String hashHexMessage = Shake256Utilities.getHashHexMessage(hashedMessageBytes);
				
		assertEquals("545a5e2db9bd957eb789b44046c0a5a5da9af640d54756b5d24f13d02e0f4a564e3980fb0419117a1dc8063b3f5f6ae5bf7122cf95847bf43c0db33c84c24a0d" , hashHexMessage);
	}
}