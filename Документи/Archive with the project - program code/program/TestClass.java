package program;

import java.io.File;

import hashConsoleInput.FkstHashStringConsole;
import hashFile.FkstHashFile;
import hashString.FkstHashString;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("-----------SHAKE256(Output bits 512)-PROGRAM------------");
		System.out.println("Първо, ще трябва да въведете съобщение, което да се хешира");
		System.out.println("Второ, ще видите хеша на съобщението \"Test Program\"");
		System.out.println("Трето, ще видите хеша на файла \"test.txt\"");
		System.out.println("За справка коректността на алгоритъма: \"https://emn178.github.io/online-tools/shake_256.html\"+\n");
		
		FkstHashStringConsole stringConsole = new FkstHashStringConsole();
		String hashStringConsole = stringConsole.hashStringConsoleInput();
		
		FkstHashString string = new FkstHashString("Test Program");
		String hashString = string.hashString();

		File file = new File("test.txt");
		FkstHashFile stringFile = new FkstHashFile(file);
		String hashStringFile = stringFile.hashTextFile();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("1)След хеширане на конзолата: " + hashStringConsole);
		System.out.println("2)След хеширане на \"Test Program\": " + hashString);
		System.out.println("3)След хеширане на \"test.txt\" файла: " + hashStringFile);
	}
}