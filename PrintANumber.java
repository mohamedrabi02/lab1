package basic;

import java.util.Scanner;

public class PrintANumber {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=reader.nextInt();
		System.out.println("the entered number is:"+number);
	}

}
