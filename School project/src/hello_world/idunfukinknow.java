package hello_world;

import java.util.Scanner;

public class idunfukinknow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i1 = input.nextInt();
		int i2 = input.nextInt();
		String trash = input.nextLine();
		String s1 = input.nextLine();
		
		
		if(s1 == "+"){
			System.out.println(i1 + i2);
		}
		else if(s1 == "-"){
			System.out.println(i1 - i2);
		}
	}
}
