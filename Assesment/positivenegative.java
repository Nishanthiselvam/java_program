package Assesment;

import java.util.Scanner;
public class positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a = sc.nextInt();
		if(a>0){
			System.out.println(a+" is Positive");
		}
		else if(a<0){
			System.out.println(a+" is Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}

	