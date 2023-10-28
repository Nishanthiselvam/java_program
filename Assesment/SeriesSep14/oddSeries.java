// 1 3 5 7 9 ....

package Assesment.SeriesSep14;

import java.util.Scanner;

public class oddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
