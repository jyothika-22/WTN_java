package Wpn;

import java.util.Scanner;

public class eighteen {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			sb.append(n);
			String rev = sb.reverse().toString();
			System.out.println(rev.equals(n) ? "Palindrome" : "Not Palindrome");
		}
	}
}
