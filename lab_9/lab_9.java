package lab;

import java.util.Scanner;

public class Skeleton {
	    public static void main(String[] args) {
	    	Scanner scan=new Scanner(System.in);
	    	int attendance,midterm;
	        // Initialize array of integers
	    	int[] grades= new int [5];
	    
	        // for loop to get user input & store in array
	    	for(int i=0;i<5; i++) {
	    		System.out.println("input the grade of assignment "+(i+1));
	    	grades[i]=scan.nextInt();
	    	}
	  
	        // for loop to iterate over the array & perform calculations
	    	int avg=0;
	    	for(int i=0;i<5; i++) {
	    		avg+=grades[i];
	    	}
	    	int overallassignments= (int)((avg/(double) grades.length)*0.3);
	    	System.out.println("Input the number of attended labs");
			attendance = scan.nextInt();
			attendance=(int)((attendance*100*0.05)/7.0);
			System.out.println("Input the midterm grade");
			midterm = scan.nextInt();
			midterm*=0.3;

	        // display output to user

			System.out.println("Assignments (30%): "+ overallassignments);
			System.out.println("Attendance (5%): "+attendance);
			System.out.println("Midterm (30%): "+midterm);
	    	
	    }
	}