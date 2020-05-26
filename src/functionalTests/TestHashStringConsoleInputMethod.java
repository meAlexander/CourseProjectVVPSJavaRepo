package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hashConsoleInput.FkstHashStringConsole;

class TestHashStringConsoleInputMethod {

	@Test
	@Tag("TEST002")
	void test() {
		FkstHashStringConsole hashConsole = new FkstHashStringConsole();
		assertEquals("95c348ba46c523f093e1ceda1fa433facd1d667e49be313a8bee8995425e5ba40f2b9045dedcdefdacb43b88de9e48020d0a7d6a880bd53825cc155ca2ab8228", hashConsole.hashStringConsoleInput());
	}
}