package functionalTests;

import static org.junit.Assert.assertEquals;
import java.io.File;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashFile.FkstHashFile;

class TestHashFileMethodWithAtLeastTwoLinesFile {

	@Test
	@Tag("TEST005")
	void test() {
		File file = new File("test.txt");
		FkstHashFile hashFile = new FkstHashFile(file);
		assertEquals("ad9252183c39cb5a17a0dad0254707b6dd9e69ff894f8cd51fec365409d02a1e8b5977ae8122349914142d6744763570a38a6d23b7cd399968f451b3c10cc1ba", hashFile.hashTextFile());
	}
}