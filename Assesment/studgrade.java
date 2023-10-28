package Assesment;

import java.util.Scanner;

public class studgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter three subject marks:");
	Scanner sc = new Scanner (System.in);
	int stud1[]=new int[3];
	int total=0;
	double percentage;
	for(int i=0;i<3;i++) {
		stud1[i]=sc.nextInt();
		total+=stud1[i];
	}
	percentage=total/3;
	System.out.println("Percentage:"+percentage);
	}

}
