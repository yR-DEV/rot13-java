
public class Algorithm {

	public static void rearrangeMessage(String message) {
		
//		System.out.println(message);
		String messageCypher;
		
		// Creating a character array comprised of the message passed to this method. 
		char[] messageToLetters = message.toCharArray();
		
		for (int i = 0; i < messageToLetters.length; i++) {
//			System.out.println(messageToLetters[i]);
			char letter = messageToLetters[i];
			
			// Checking lower case letters and rotating them
				// I am able to check values of letters because their unicode values
			if (letter >= 'a' && letter <= 'z') {
				// If letter has value greater than M we are going to subtract 13 letters
					// to move that letter back up the alphabet
					// Else we are going to add 13 to move it down the alphabet.
				if (letter > 'm') {
					letter -= 13;
				} else {
					letter += 13;
				}
			// Checking upper case letters and rotating them
			} else if (letter >= 'A' && letter <= 'Z') {
				if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
			} else if (Character.isWhitespace(letter)) {
				letter = ' ';
			} else {
				System.out.println("You entered a character that was not a letter/space.");
				System.out.println("Please try again!");
				Rot13.prompt();
			}
			messageToLetters[i] = letter;
		}
		// Converting the array to a new String
		messageCypher = new String(messageToLetters);
		System.out.println("YOUR MESSAGE CYPHER IS: ");
		System.out.println(messageCypher);
	}
	
}
