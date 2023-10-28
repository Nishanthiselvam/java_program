//print student total grade

package Assesment;

import java.util.Scanner;

public class gradewitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Sutent Details:");
		Scanner s1 = new Scanner(System.in);
		int studid= s1. nextInt();
		String studName=s1.next();
		System.out.println("Enter three subject marks:");
		int subMath= s1.nextInt();
		int subEnglish= s1.nextInt();
		int subHindi= s1.nextInt();
		int total= subMath+subEnglish+subHindi;
		double avg= total/3;
		System.out.println("ID:"+studid+"\nName:"+studName+"\nSubjectMarks: "
				+subMath+"\n"+subEnglish+"\n"+subHindi+"\n"
				+ "\nTotal: "+total+"\nAverage Mark: "+ avg);;
		if(avg>=90) {
			System.out.println("He secured A Grade");
		}
		else if(avg>=70) {
			System.out.println("He secured B Grade");
		}
		else if(avg>=60) {
			System.out.println("He secured C Grade");
		}
		else if(avg>=50) {
			System.out.println("He secured D Grade");
		}
		else if(avg>=45) {
			System.out.println("He secured E Grade");
		}
		else {
			System.out.println("Fail");
		}
	}

}


		


