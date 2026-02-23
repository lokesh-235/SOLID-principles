package isp.betterCode;

public class Seller implements ICanBuy,ICanSell {

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
