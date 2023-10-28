package Assesment;

import java.util.Scanner;

public class Arithmeticop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ch;
		System.out.println("Choose one arithmetic operation:"+"\n + for Addition"+
		"\n - for Subraction"+"\n * for Multiplication"+"\n / for Division");
		ch=sc.next();
		switch(ch)
		{
		case "+":{
			int sum=a+b;
			System.out.println("Sum :"+sum);
			break;
		}
		case "-":{
			int sub=a-b;
			System.out.println("Difference :"+sub);
			break;
		}
		case "*":{
			int mul=a*b;
			System.out.println("Multiply :"+mul);
			break;
		}
		case "/":{
			int div=a/b;
			System.out.println("Division :"+div);
			break;
		}
		}
	}

}
