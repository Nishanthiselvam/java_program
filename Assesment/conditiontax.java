package Assesment;

import java.util.Scanner;

public class conditiontax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary:");
		int sal=sc.nextInt();
		int tax_amount=0;
		if(sal<25000) {
			tax_amount=10*sal/100;
			System.out.println("Tax amount is: "+tax_amount);
		}
		else {
			tax_amount=15*sal/100;
			System.out.println("Tax amount is: "+tax_amount);
		}
	}

}
