import java.util.Scanner;

public class Rot13 {

	public static void main(String[] args) {
		prompt();
	}
	
	public static void prompt() {
		
		Scanner scanner = new Scanner(System.in);
		String promptSelection;
		
		System.out.println("------------------------------------------------");
		System.out.println("------      WELCOME TO MY ROT13 ALGO      ------");
		System.out.println("------------------------------------------------");
		System.out.println("------ Please enter:                           -");
		System.out.println("------     encode - to create message cypher   -");
		System.out.println("------     decode - to decode a rot13 cypher   -");
		System.out.println("------     exit/quit - to exit CLI application -");
		System.out.println("------------------------------------------------");
		
		promptSelection = scanner.nextLine().trim().toLowerCase();
		
		switch(promptSelection) {
			case "encode":
				System.out.println("You selected: ENCODE");
				createRot13();
				scanner.close();
				break;
			case "decode": 
				System.out.println("You selected: DECODE");
				decodeRot13();
				scanner.close();
				break;
			case "quit":
				System.out.println("- QUIT");
				System.out.println("THANK YOU FOR USING THIS EPIC CLI APPLICATION.");
				scanner.close();
				break;
			case "exit":
				System.out.println("- EXIT");
				System.out.println("THANK YOU FOR USING THIS EPIC CLI APPLICATION.");
				scanner.close();
				break;
			default:  
				System.out.println("Invalid option, try again");
				prompt();
		}
	}
	
	public static void createRot13() {
		Scanner scanner = new Scanner(System.in);
		String messageToEncode;
		
		System.out.println("------------------------------------------------");
		System.out.println("Please enter the message you wish to encode: ");
		System.out.println("Characters and spaces accepted.");
		
		// Getting message from user to encrypt
		messageToEncode = scanner.nextLine().trim().toLowerCase();
		
		// Sending message to method to be arranged into ROT13 sequencing
		Algorithm.rearrangeMessage(messageToEncode);
		
		scanner.close();
	}
	
	public static void decodeRot13() {
		
		Scanner scanner = new Scanner(System.in);
		String messageToDecode;
		
		System.out.println("------------------------------------------------");
		System.out.println("Please enter the message you wish to decode: ");
		System.out.println("Characters and spaces accepted.");
		
		
		// Getting message from user to decrypt
		messageToDecode = scanner.nextLine().trim().toLowerCase();
		
		// Sending message to method to arrange from ROT13 
		Algorithm.rearrangeMessage(messageToDecode);
		
		scanner.close();
	}
}
