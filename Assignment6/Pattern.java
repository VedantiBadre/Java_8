package Assignment6;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the character :");

		// int rows = scanner.nextInt();
		// String ch =scanner.nextLine();

		String ch = scanner.next();

		/* System.out.println("## Printing the pattern ##"); */

		int charcter = 65;

		for (int i = 0; i <= ch.length(); i++) {
			for (int j = 0; j <= ch.length() - i; j++) {
				System.out.print((char) (65 + j));
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int l = ch.length() - i; l >= 0; l--) {
				if (l != ch.length())
					System.out.print((char) (65 + l));
			}
			System.out.println();
		}
		scanner.close();
	}

}
