package Assesment;

import java.util.Scanner;

public class callbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		System.out.println("Enter your total calls: ");
		int call=sc.nextInt();
		if(call<=200) {
			System.out.println("Ur Bill amount:"+ 1*call);
		}
		else {
			System.out.println("Ur Bill amount: "+ 3*call);
		}
	}

}
