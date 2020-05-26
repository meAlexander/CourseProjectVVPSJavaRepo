package hashConsoleInput;
import java.util.Scanner;

import shake256.CreateHashShake256;

public class FkstHashStringConsole {
	private String message;
	private Scanner scanner;
	
	public FkstHashStringConsole() {
		
	}
	
	public String hashStringConsoleInput() {
		scanner = new Scanner(System.in);
		
        System.out.println("Въведете съобщение, което ще се хешира с SHAKE256:");
		message = scanner.nextLine();
		scanner.close();
		
		return CreateHashShake256.hashMethod(message);
	}
}