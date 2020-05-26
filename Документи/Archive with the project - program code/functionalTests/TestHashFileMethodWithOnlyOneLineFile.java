package functionalTests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashFile.FkstHashFile;

class TestHashFileMethodWithOnlyOneLineFile {

	@Test
	@Tag("TEST007")
	void test() {
		File file = new File("testFileWithOneLine.txt");
		FkstHashFile hashFile = new FkstHashFile(file);
		assertEquals("a3d3baf91495ad21119744574c27eabfa4c0c6276da19149da021c4ff9645cba90a5482875c79d53b6ff92fcdef8684553e3441222dbb6128ee32a67ba8e3178", hashFile.hashTextFile());
	}
}