package Learning;

import java.util.Scanner;

public class Vowel_Consonant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Alphabet: ");
		char ch = sc.next().toLowerCase().charAt(0);

		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Charater is Vowel");
				break;
				
			default:
				if(ch>='a' && ch<='z')
					System.out.println("It is Consonant");
				else
					System.out.println("invali Input! not an Alphabet");
			
		}

	}

}
