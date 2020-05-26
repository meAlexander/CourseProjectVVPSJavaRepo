package functionalTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashString.FkstHashString;

class TestHashStringMethod {

	@Test
	@Tag("TEST001")
	void test() {
		FkstHashString hashString = new FkstHashString("Test Program");
		assertEquals("545a5e2db9bd957eb789b44046c0a5a5da9af640d54756b5d24f13d02e0f4a564e3980fb0419117a1dc8063b3f5f6ae5bf7122cf95847bf43c0db33c84c24a0d", hashString.hashString());
	}
}