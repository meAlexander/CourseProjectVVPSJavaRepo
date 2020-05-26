package functionalTests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashFile.FkstHashFile;

class TestHashFileMethodWithEmptyFile {

	@Test
	@Tag("TEST006")
	void test() {
		File file = new File("testFileEmpty.txt");
		FkstHashFile hashFile = new FkstHashFile(file);
		assertEquals("46b9dd2b0ba88d13233b3feb743eeb243fcd52ea62b81b82b50c27646ed5762fd75dc4ddd8c0f200cb05019d67b592f6fc821c49479ab48640292eacb3b7c4be", hashFile.hashTextFile());
	}
}