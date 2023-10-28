//1/1 + 2/4 + 3/9 + 4/16......

	package Assesment.SeriesSep14;
	
	import java.util.Scanner;
	
	public class seriesOfAddMul {
		double sum=0; 
		int i=1,j=1;
		public void up(int n) {
			for(i=1;i<n;i++) {
				System.out.print(i+"/"+(i*i));
				if(i<n) {
					System.out.print(" + ");
				}
				sum=sum+(i/(i*i));
			}
			System.out.print(" ="+sum);
			}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		seriesOfAddMul up=new seriesOfAddMul();
		up.up(n);
	}
	}
