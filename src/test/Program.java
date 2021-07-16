package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int option = 0;
		
		Scanner opp = new Scanner(System.in);
		System.out.print("Enter the option(1 or 2): ");
		option = opp.nextInt();
		
		Person personObject = new Person();
		Box boxObject = new Box();
		
		if(option == 1) {
			Scanner userName = new Scanner(System.in);
			System.out.print("Enter the name: ");
			String uname = userName.next();
			personObject.setName(uname);
			
			Scanner basic = new Scanner(System.in);
			System.out.print("Enter the Basic Salary: ");
			double BasicSalary = basic.nextDouble();
			personObject.setBasicSal(BasicSalary);
			
			Scanner otRa = new Scanner(System.in);
			System.out.print("Enter the OT Rate: ");
			double OT = otRa.nextDouble();
			personObject.setOtRate(OT);
			
			Scanner hours = new Scanner(System.in);
			System.out.print("Enter the OT Hours: ");
			double OTH = hours.nextDouble();
			personObject.setOtHrs(OTH);
			
			personObject.calculate();
			personObject.display();
			
		}else if(option == 2) {
			Scanner len = new Scanner(System.in);
			System.out.print("Length: ");
			int length = len.nextInt();
			boxObject.setLength(length);
			
			Scanner wid = new Scanner(System.in);
			System.out.print("Width: ");
			int width = wid.nextInt();
			boxObject.setWidth(width);
			
			Scanner hei = new Scanner(System.in);
			System.out.print("Height: ");
			int height = hei.nextInt();
			boxObject.setHeight(height);
			
			boxObject.calculate();
			boxObject.display();
			
		}else {
			System.out.println("Invalid option");
		}
		
	
		
		
		
	}

}
