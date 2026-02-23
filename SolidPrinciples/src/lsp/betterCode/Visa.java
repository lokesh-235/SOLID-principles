package lsp.betterCode;

public class Visa extends CreditCard implements InternationalPaymentCompatibleCard {

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
	public void internationalPayment() {
		// TODO Auto-generated method stub
		System.out.println("International Payments through Visa");
	}
	
	

}
