package alphabet;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
        	System.out.println("Character Is A Vowel :" +ch);
        }
        else
        {
        	System.out.println("Character Is A Consonant " +ch);
        }
	}

}
