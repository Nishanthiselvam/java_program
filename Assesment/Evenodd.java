// even or odd

package Assesment;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" Its even number");
		}
		else {
			System.out.println(n+" Its a Odd number");
		}
	}

}
