package test;

import java.util.Scanner;

public class Person implements IComputer{

	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getOtRate() {
		return otRate;
	}

	public void setOtRate(double otRate) {
		this.otRate = otRate;
	}

	public double getOtHrs() {
		return otHrs;
	}

	public void setOtHrs(double otHrs) {
		this.otHrs = otHrs;
	}

	public double getNetSal() {
		return netSal;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	
	public void calculate() {
		
		netSal = basicSal + otHrs * otRate;
		setNetSal(netSal);
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(basicSal);
		System.out.println(otRate);
		System.out.println(otHrs);
		System.out.println(getName()+ "'s Salary is: " + getNetSal());
	
	}
}
