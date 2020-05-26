package hashString;

import shake256.CreateHashShake256;

public class FkstHashString {
	private String message;

	public FkstHashString(String message) {
		this.message = message;
	}

	public String hashString() {
		return CreateHashShake256.hashMethod(message);
	}
}