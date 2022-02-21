import java.util.*;
import java.text.*;
public class EntryPoint {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please input the employee's first name:");
	String FirstName=scan.nextLine();
	System.out.println("Please input the employee's last name:");
	String LastName=scan.nextLine();
	System.out.println("Please input the employee's age:");
	int age=scan.nextInt();
	System.out.println("Please input the employee's monthly salary:");
	Double Monthlysalary=scan.nextDouble();
	DecimalFormat fmt= new DecimalFormat("#,###.###");
	System.out.println("Employee information: "+ FirstName +
			" "+ LastName+ ", "+ age +", "+ fmt.format(Monthlysalary));
	Random generator=new Random();
	int x=generator.nextInt(10)+1;
	System.out.println("You have "+x+" insertions left.");
	for(int i=0;i<x;i++) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please input the employee's first name:");
		String FirstName2=scn.nextLine();
		System.out.println("Please input the employee's last name:");
		String LastName2=scn.nextLine();
		System.out.println("Please input the employee's age:");
		int age2=scn.nextInt();
		System.out.println("Please input the employee's monthly salary:");
		Double Monthlysalary2=scn.nextDouble();
		DecimalFormat fmt1= new DecimalFormat("#,###.###");
		System.out.println("Employee information: "+ FirstName2 +
				" "+ LastName2+ ", "+ age2 +", "+ fmt1.format(Monthlysalary2));}
	
	
	scan.close();
	
	
	}
}
