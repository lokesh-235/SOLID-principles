package lsp.betterCode;

public class Rupay extends CreditCard implements UpiCompatibleCard {

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
	public void upiPayment() {
		// TODO Auto-generated method stub
		System.out.println("UPI payment through Rupay");
	}

}
