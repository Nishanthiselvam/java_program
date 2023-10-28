//CubeSeries===   1 8 27 64 ....

package Assesment.SeriesSep14;

import java.util.Scanner;

public class cubeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		int cube=1;
		for(int i=1;i<=n;i++) {
			cube=i*i*i;
			System.out.println(cube+" ");
		}
	}

}
