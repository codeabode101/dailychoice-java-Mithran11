package HomeWork;

import java.util.Scanner;

public class MyDailyHelper {

	public static void main(String[] args) {
		
		System.out.println("What are you doing today? ((w)ork/(p)lay)");
		
		Scanner scanner= new Scanner(System.in);
		String choice = scanner.next();
		
		if (choice.equals("w")) {
			System.out.println("work nooooooooooooooooooo");
		}
		
		if (choice.equals("p")) {
			System.out.println("play happy me good");
		}
		
	}

}
