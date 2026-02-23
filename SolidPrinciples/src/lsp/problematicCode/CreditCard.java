package lsp.problematicCode;

public abstract class CreditCard {
	
	private String userName;
	private String cardNumber;
	private String passCode;
	
	
	public abstract void tapAndPay();
	public abstract void swipeAndPay();
	public abstract void upiPayment() throws NoSuchMethodException;
	public abstract void internationalPayments() throws NoSuchMethodException;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	
	public void getCardDetails() {
		System.out.println("user name = "+this.getUserName()+"\ncard number = "+this.getCardNumber());
	}
	
}
