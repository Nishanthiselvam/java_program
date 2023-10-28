//calculate tax amount at 12% of salary

package Assesment;

import java.util.Scanner;

public class calcutax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Salary:");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		double tax_amount=12*salary/100;
		System.out.println("12% Tax amount is:"+tax_amount);
	}

}
