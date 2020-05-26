package functionalTests;

import static org.junit.Assert.assertEquals;
import java.io.File;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashFile.FkstHashFile;

class TestHashFileMethodWithMissingFile {

	@Test
	@Tag("TEST003")
	void test() {
		File file = new File("test2.txt");
		FkstHashFile hashFile = new FkstHashFile(file);
		assertEquals("The File not found!", hashFile.hashTextFile());
	}
}