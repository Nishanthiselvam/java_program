package Assesment;

import java.util.Scanner;

public class discountoffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your purchased amount:");
		int pa = sc.nextInt();
		int dis=0;
		if(pa>=10000)
		{
			dis=(pa*10)/100;
			System.out.println("Your Offer amount is: "+dis);
		}
		else {
			dis=(pa*2)/100;
			System.out.println("Your Offer amount is: "+dis);
		}
	}

}
