package lsp.problematicCode;

public class MasterCard extends CreditCard {

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
	public void upiPayment() throws NoSuchMethodException {
		// TODO Auto-generated method stub
		throw new NoSuchMethodException("MatserCard does not support UPI payments");
	}

	@Override
	public void internationalPayments() {
		// TODO Auto-generated method stub
		System.out.println("International payments through MasterCard");
	}
	
	

}

