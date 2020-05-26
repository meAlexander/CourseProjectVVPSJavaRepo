package moduleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import shake256.Shake256Utilities;

class TestMessageToBytes {

	@Test
	@Tag("TEST008")
	void test() {
		String text = "Test Program";
		byte[] actual = Shake256Utilities.getMessageBytes(text);
				
		assertEquals("[84, 101, 115, 116, 32, 80, 114, 111, 103, 114, 97, 109]", Arrays.toString(actual));
	}
}