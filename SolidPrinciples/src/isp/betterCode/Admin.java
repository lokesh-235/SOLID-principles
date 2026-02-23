package isp.betterCode;

public class Admin implements ICanBuy,ICanSell,ICanApprove {

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		System.out.println("Approving Product");
	}

	@Override
	public void upload() {
		// TODO Auto-generated method stub
		System.out.println("Uploading Product");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Updating Product");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Buying Product");
	}

}
