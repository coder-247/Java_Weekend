package java4;

public class FrenchFried {
	private int price;
	
	public FrenchFried() {
		
	}
	public FrenchFried(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}
	private String desc;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
