package lsp.betterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCard {

	@Override
	public void tapAndPay() {
		// TODO Auto-generated method stub
		System.out.println("Tap and pay through MasterCard");
	}

	@Override
	public void swipeAndPay() {
		// TODO Auto-generated method stub
		System.out.println("Swipe and pay through MasterCard");
	}


	@Override
	public void internationalPayment() {
		// TODO Auto-generated method stub
		System.out.println("International payments through MasterCard");
	}

}
