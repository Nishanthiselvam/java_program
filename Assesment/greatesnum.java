//Greatest number

package Assesment;

import java.util.Scanner;

public class greatesnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a>b)&&(a>c)){
			System.out.println(a+" is greatest");
		}
		else if((b>c)&&(b>c)){
			System.out.println(b+" is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}
	}

}
