package main;

import java.util.ArrayList;

import java.util.List;

import lsp.problematicCode.CreditCard;
import lsp.problematicCode.MakePayments;
import lsp.problematicCode.MasterCard;
import lsp.problematicCode.Rupay;
import lsp.problematicCode.Visa;
//import ocp.betterCode.MakePayment;
import ocp.problematicCode.MakePayment;


import ocp.problematicCode.PaymentType;
import ocp.betterCode.DebitCard;
import ocp.betterCode.Gpay;
import ocp.betterCode.MakeBetterPayment;
import ocp.betterCode.Payment;
import ocp.betterCode.Phonepe;
import srp.betterCode.CalculateEmployeeSalary;
import srp.betterCode.Employee;
import srp.problematic.ProblematicEmployee;



public class Main {
	public static void main(String[] args) {
//		SRP
//		ProblematicEmployee emp1 = new ProblematicEmployee(1,"lokesh",20000);
//		
//		double lokeshSalary = emp1.calculateSalary(30);
//		
//		System.out.println(lokeshSalary);
//		
//		Employee emp2 = new Employee(1,"ramesh",80000);
//		CalculateEmployeeSalary calculateEmployeeSalary = new CalculateEmployeeSalary();
//		
//		double rameshSalary = calculateEmployeeSalary.calculate(30, emp2);
//		
//		System.out.println(rameshSalary);
		
//		OCP
		
//		List<PaymentType> paymentTypes = new ArrayList<>();
//		
//		paymentTypes.add(PaymentType.Gpay);
//		paymentTypes.add(PaymentType.Phonepe);
//		paymentTypes.add(PaymentType.Paytm);
//		paymentTypes.add(PaymentType.DebitCard);
//		paymentTypes.add(PaymentType.Phonepe);
//		
//		MakePayment.makePayments(paymentTypes);
//		
//		List<Payment> payments = new ArrayList<>();
//		
//		payments.add(new Gpay());
//		payments.add(new Phonepe());
//		payments.add(new DebitCard());
//		
//		MakeBetterPayment.makePayments(payments);
		
		
//		LSP
		
		List<CreditCard> cards = new ArrayList<>();
		
		cards.add(new Visa());
		cards.add(new MasterCard());
		cards.add(new Rupay());
		try {
		MakePayments.makeInternationalPayments(cards);
		}catch(NoSuchMethodException e) {
			System.out.println("Does not support International payments");
		}
		
		try {
			MakePayments.makeUpiPayments(cards);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			System.out.println("Does not support UPI payments");
		}
	}
}
