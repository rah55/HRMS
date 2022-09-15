package First.HRMS;
import java.util.Scanner;
public class main {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		entity e1 = new entity();
		dao o1 = new dao();
		System.out.println("-----THIS IS HR MANAGEMENT SYSTEM----");
		
		System.out.println("select operation: ");
		System.out.println(" press 1. ADD ACCOUNT");
		System.out.println("press  2. REMOVE ACCOUNT");
		System.out.println("press  3.  ACCOUNT INCREMENT");
		
		int op = sc.nextInt();
		switch(op) {
		case 1->{
		
		
		System.out.println("ENTER THE ACCOUNT DETAILS THAT YOU WANT TO ADD");
		
		System.out.print("EMPLOYEE NAME");
		String empName=sc.next();
		
		System.out.print("EMPLOYEE DOMAIN");
		String empDomain=sc.next();
		
		System.out.print("EMPLOYEE LOCATION");
		String empLocation=sc.next();
		
		System.out.print("EMPLOYEE SALARY");
		int empSalary=sc.nextInt();
		
		System.out.print("EMPLOYEE CONTACT NUMBER");
		String empPhone =sc.next();
		
		e1.empName = empName;
		e1.empDomain = empDomain;
		e1.empLocation=empLocation;
		e1.empSalary=empSalary;
		e1.empPhone=empPhone;
		
		o1.connect();
		int res=o1.addAccount(e1);
		if(res!=0) {
			System.out.println("ACCOUNT IS CREATED");
					}
		else {
			System.out.println("SOMETHING WENT WRONG ");
			}
		}
		
		case 2->{
			
			System.out.println("ENTER THE DEATIL OF  THE ACCOUNT  YOU WANT TO REMOVE");
			System.out.print("EMPLOYEE NAME");
			String empName=sc.next();
			e1.empName = empName;
			
			o1.connect();
			int res=o1.removeAccount(e1);
			if(res!=0) {
				System.out.println("ACCOUNT IS REMOVED");
						}
			else {
				System.out.println("SOMETHING WENT WRONG");
				}
			}
			
		case 3->{
			
			System.out.print(" ENTER THE EMPLOYEE NAME");
			String empName=sc.next();
			e1.empName=empName;
			
			o1.connect();
			
			int res=o1.increment(e1);
			if(res!=0) {
				System.out.println("INCREMENT IS DONE");
						}
			else {
				System.out.println("SOMETHING WENT WRONG");
				}
			
		}
			
		
		
		
		
		
		
		
		}
		}
		}
