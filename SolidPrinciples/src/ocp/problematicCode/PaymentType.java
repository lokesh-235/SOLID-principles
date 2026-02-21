package ocp.problematicCode;

public enum PaymentType {
	Gpay,
	Phonepe,
	Paytm,
	DebitCard;
	
	public void payByGpay() {
		System.out.println("Making payment through gpay");
	}
	public void payByPhonepe() {
		System.out.println("Making payment through Phonepe");
	}
	public void payByPaytm() {
		System.out.println("Making payment through Paytm");
	}
	public void payByDebitCard() {
		System.out.println("Making payment through Debit Card");
	}
	
	
	
}
