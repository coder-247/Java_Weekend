package java4;

public class BigBurger {

	private int price;
	private String desc;

	public BigBurger(){
		
	}
	public BigBurger(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}

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
