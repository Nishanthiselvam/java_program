//Simple interest s=p*r*t/100

package Assesment;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle amount:");
		int p = sc.nextInt();
		System.out.println("Enter the Rate per annum:");
		double r = sc.nextDouble();
		System.out.println("Enter the Time value:");
		int t = sc.nextInt();
		double SI = p*r*t/100;
		System.out.println("Simple Interest:"+SI);
	}

}
