package isp.problematicCode;

public class Seller implements User {

	@Override
	public void canBuyProduct() {
		// TODO Auto-generated method stub
		System.out.println("Buying Product");
	}

	@Override
	public void canUploadProduct() {
		// TODO Auto-generated method stub
		System.out.println("Uploading Product");
	}

	@Override
	public void canUpdateProduct() {
		// TODO Auto-generated method stub
		System.out.println("Updating Product");
	}

	@Override
	public void canApproveProduct() {
		// TODO Auto-generated method stub
		System.out.println("No permission to use this Method");
	}
	
}
