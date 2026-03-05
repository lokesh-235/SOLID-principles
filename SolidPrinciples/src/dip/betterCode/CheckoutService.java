package dip.betterCode;

public class CheckoutService {
	private final PaymentMethod paymentMethod;

    public CheckoutService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void checkout() {
        paymentMethod.pay();
    }
}
