package ocp.problematicCode;

import java.util.List;

public class MakePayment {
	public static void makePayments(List<PaymentType> payments) {
		for(PaymentType type : payments) {
			if(type==PaymentType.Gpay) type.payByGpay();
			else if(type==PaymentType.Paytm) type.payByPaytm();
			else if(type==PaymentType.Phonepe) type.payByPhonepe();
			else if(type==PaymentType.DebitCard) type.payByDebitCard();
			
		}
	}
}
