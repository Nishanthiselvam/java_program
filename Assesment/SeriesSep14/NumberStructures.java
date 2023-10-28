package Assesment.SeriesSep14;

	import java.util.Scanner;

	public class NumberStructures {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read three numbers as input
	        int[] num1 = new int[3];
	       for(int i=0;i<num1;i++) {
	    	   num1[i]=num1;
	       }
	        // Generate and print the structures based on the input
	        generateStructures(num1);

	        scanner.close();
	    }

	    // Method to generate and print the structures
	    public static void generateStructures(int num ) {
	    	
	        for(int i=0;i<num.length;i++) {
	        for(int i=1;i<=num;i++) {			                        // i=1; row=5;[1<=5]==True
				for(int space=1;space<=num-i;space++) {                   //s=space
					System.out.print(" ");
				}
				for(int j=0;j<i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
	    }
	}
	}
	