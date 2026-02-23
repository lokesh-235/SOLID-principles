package isp.problematicCode;

public class Buyer implements User {

	@Override
	public void canBuyProduct() {
		// TODO Auto-generated method stub
		System.out.println("Buying Product");
	}

	@Override
	public void canUploadProduct() {
		// TODO Auto-generated method stub
		System.out.println("No permission to use this Method");
	}

	@Override
	public void canUpdateProduct() {
		// TODO Auto-generated method stub
		System.out.println("No permission to use this Method");
	}

	@Override
	public void canApproveProduct() {
		// TODO Auto-generated method stub
		System.out.println("No permission to use this Method");
	}

}
