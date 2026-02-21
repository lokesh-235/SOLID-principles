package ocp.betterCode;

import java.util.List;



public class MakeBetterPayment {
	public static void makePayments(List<Payment> payments) {
		for(Payment type : payments) {
			type.makePayment();
		}
	}
}
