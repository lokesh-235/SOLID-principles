package lsp.problematicCode;

import java.util.List;


public class MakePayments {
	public static void makeInternationalPayments(List<CreditCard> cards) throws NoSuchMethodException {
		for(CreditCard card : cards)
			card.internationalPayments();
		
	}
	
	public static void makeUpiPayments(List<CreditCard> cards) throws NoSuchMethodException {
		for(CreditCard card : cards)
			card.upiPayment();
		
	}
	
	
 }

