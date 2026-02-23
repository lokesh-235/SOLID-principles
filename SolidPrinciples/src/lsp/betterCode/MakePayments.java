package lsp.betterCode;

import java.util.List;

public class MakePayments {
	public static void makeInternationalPayments(List<InternationalPaymentCompatibleCard> cards) {
		for(InternationalPaymentCompatibleCard card : cards)
			card.internationalPayment();
		
	}
	
	public static void makeUpiPayments(List<UpiCompatibleCard> cards) {
		for(UpiCompatibleCard card : cards)
			card.upiPayment();
		
	}
	
	
 }
