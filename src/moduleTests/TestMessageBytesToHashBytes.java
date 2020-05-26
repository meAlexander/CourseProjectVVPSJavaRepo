package moduleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import shake256.Shake256Utilities;

class TestMessageBytesToHashBytes {

	@Test
	@Tag("TEST009")
	void test() {
		String text = "Test Program";
		byte[] messageBytes = Shake256Utilities.getMessageBytes(text);
		byte[] hashedMessageBytes = Shake256Utilities.getHashBytes(messageBytes);
				
		assertEquals("[84, 90, 94, 45, -71, -67, -107, 126, -73, -119, -76, 64, 70, -64, -91, -91, -38, -102, -10, 64, -43, 71, 86, -75, -46, 79, 19, -48, 46, 15, 74, 86, 78, 57, -128, -5, 4, 25, 17, 122, 29, -56, 6, 59, 63, 95, 106, -27, -65, 113, 34, -49, -107, -124, 123, -12, 60, 13, -77, 60, -124, -62, 74, 13]" 
				, Arrays.toString(hashedMessageBytes));
	}
}