package functionalTests;

import static org.junit.Assert.assertEquals;
import java.io.File;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashFile.FkstHashFile;

class TestHashFileMethodWithInCorrectFormat {

	@Test
	@Tag("TEST004")
	void test() {
		File file = new File("test.docx");
		FkstHashFile hashFile = new FkstHashFile(file);
		assertEquals("The File is not in text format!", hashFile.hashTextFile());
	}
}