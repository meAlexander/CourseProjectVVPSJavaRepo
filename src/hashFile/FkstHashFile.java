package hashFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import exceptions.NotTextFileException;
import shake256.CreateHashShake256;

public class FkstHashFile {
	private StringBuilder stringBuilder;
	private Scanner scanner;
	private File file;

	public FkstHashFile(File file) {
		this.file = file;
	}

	public String hashTextFile() {
		try {
			if (file == null) {
				throw new NullPointerException();
			}
			if (!file.getName().endsWith(".txt")) {
				throw new NotTextFileException();
			}
			if (!file.exists()) {
				throw new FileNotFoundException();
			}
			
			scanner = new Scanner(file);
			stringBuilder = new StringBuilder();
			
//			 Scanner scanner1 = new Scanner(new File("test.txt"), "UTF-8");
//			 String text = scanner.useDelimiter("\\A").next();
//			 scanner1.close();

			while (scanner.hasNextLine()) {
				String lineOfFile = scanner.nextLine();
				stringBuilder.append(lineOfFile);
				
				if (scanner.hasNextLine()) {
					stringBuilder.append("\n");
				}
			}
			scanner.close();
			return CreateHashShake256.hashMethod(stringBuilder.toString());
		} catch (FileNotFoundException е) {
			return "The File not found!";
		} catch (NotTextFileException е) {
			return "The File is not in text format!";
		} catch (NullPointerException e) {
			return "File null pointer!";
		}
	}
}