package dip.problematicCode;

public class CheckoutService {
	 private PayPalPayment payment = new PayPalPayment();

	 public void checkout(double amount) {
	        payment.pay(amount);
	    }
}
