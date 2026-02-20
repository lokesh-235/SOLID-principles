package main;

import srp.betterCode.CalculateEmployeeSalary;
import srp.betterCode.Employee;
import srp.problematic.ProblematicEmployee;

public class Main {
	public static void main(String[] args) {
		ProblematicEmployee emp1 = new ProblematicEmployee(1,"lokesh",20000);
		
		double lokeshSalary = emp1.calculateSalary(30);
		
		System.out.println(lokeshSalary);
		
		Employee emp2 = new Employee(1,"ramesh",80000);
		CalculateEmployeeSalary calculateEmployeeSalary = new CalculateEmployeeSalary();
		
		double rameshSalary = calculateEmployeeSalary.calculate(30, emp2);
		
		System.out.println(rameshSalary);
		
	}
}
