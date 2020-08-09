import java.util.Scanner;

public class Rot13 {

	public static void main(String[] args) {
		prompt();
	}
	
	public static void prompt() {
		
		Scanner scanner = new Scanner(System.in);
		String promptSelection;
		
		System.out.println("------------------------------------------------");
		System.out.println("WELCOME TO MY ROT13 ALGO");
		System.out.println("------------------------------------------------");
		
		promptSelection = scanner.nextLine().trim().toLowerCase();
		
		switch(promptSelection) {
			case "create":
				System.out.println("MAKE NEW ONE");
				createRot13();
				scanner.close();
				break;
			case "decrypt": 
				System.out.println("DECRYPT ONE!");
				decryptRot13();
				scanner.close();
				break;
			case "quit":
				System.out.println("QUIT");
				System.out.println("THANK YOU FOR USING THIS EPIC CLI APPLICATION.");
				scanner.close();
				break;
			case "exit":
				System.out.println("EXITexi");
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
		String messageToEncrypt;
		
		System.out.println("hellowearecreating");
		System.out.println("Please enter the message you wish to encrypt: ");
		
		messageToEncrypt = scanner.nextLine().trim().toLowerCase();
		Algorithm.rearrangeMessage(messageToEncrypt);
		
		scanner.close();
	}
	
	public static void decryptRot13() {
		
		Scanner scanner = new Scanner(System.in);
		String messageToDecrypt;
		
		System.out.println("hellowearDECRYPTIN");
		System.out.println("Please enter the message you wish to decrypt: ");
		
		messageToDecrypt = scanner.nextLine().trim().toLowerCase();
		Algorithm.rearrangeMessage(messageToDecrypt);
		
		scanner.close();
	}
}
