package lsp.problematicCode;

public class Rupay extends CreditCard {

	@Override
	public void tapAndPay() {
		// TODO Auto-generated method stub
		System.out.println("Tap and pay through Rupay");
	}

	@Override
	public void swipeAndPay() {
		// TODO Auto-generated method stub
		System.out.println("Swipe and pay through Rupay");
	}

	@Override
	public void upiPayment() throws NoSuchMethodException {
		// TODO Auto-generated method stub
		System.out.println("UPI payment through Rupay");
	}

	@Override
	public void internationalPayments() throws NoSuchMethodException {
		// TODO Auto-generated method stub
		throw new NoSuchMethodException("Rupay does not support International Payments");
	}
	
	

}
