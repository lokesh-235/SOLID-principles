package lsp.problematicCode;

public class Visa extends CreditCard {

	@Override
	public void tapAndPay() {
		// TODO Auto-generated method stub
		System.out.println("Tap and pay through Visa");
	}

	@Override
	public void swipeAndPay() {
		// TODO Auto-generated method stub
		System.out.println("Swipe and pay through Visa");
	}

	@Override
	public void upiPayment() throws NoSuchMethodException {
		// TODO Auto-generated method stub
		throw new NoSuchMethodException("Visa does not support UPI payments");
	}

	@Override
	public void internationalPayments() throws NoSuchMethodException {
		// TODO Auto-generated method stub
		System.out.println("International Payments through Visa");
	}
	
	

}

