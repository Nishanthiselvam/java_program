// 1/1+ 1/2+ 1/3 = 1/n



package Assesment.SeriesSep14;

import java.util.Scanner;

public class addOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		double sum=0;
		for(double i=1;i<=n;i++) {
			System.out.print("1/"+i);
		if(i<n) {
			System.out.print(" + ");
		}
		sum=sum+(1/i);
		}
		System.out.print(" ="+sum);
	}
}
