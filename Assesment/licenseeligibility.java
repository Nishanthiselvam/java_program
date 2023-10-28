//check the user have license eligibility or not

package Assesment;

import java.util.Scanner;

public class licenseeligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Congrats your eligible for license!");
		}
		else {
			System.out.println("Sorry your not eligible for license...");
		}
	}

}
