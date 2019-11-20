package automation.poc;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println(" Please enter the char:");
			
		 String c = sc.nextLine();
			c=c.toLowerCase();
			if(c.charAt(0)=='a'||c.charAt(0)=='e'||c.charAt(0)=='i'||c.charAt(0)=='o'||c.charAt(0)=='u')
			{
				System.out.println(" Yes Vowel");
			}
			else
			{
				System.out.println(" not vowel");
			}
				

	}

}
