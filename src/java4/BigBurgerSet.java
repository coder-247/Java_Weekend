package java4;

//컴포지션(결합)
public class BigBurgerSet {

	private BigBurger bigburger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	
	public BigBurger getBigburger() {
		return bigburger;
	}


	public void setBigburger(BigBurger bigburger) {
		this.bigburger = bigburger;
	}


	public Coke getCoke() {
		return coke;
	}


	public void setCoke(Coke coke) {
		this.coke = coke;
	}


	public FrenchFried getFrenchFried() {
		return frenchFried;
	}


	public void setFrenchFried(FrenchFried frenchFried) {
		this.frenchFried = frenchFried;
	}


	public BigBurgerSet(BigBurger bigburger, Coke coke, FrenchFried frenchFried) {
		this.bigburger = bigburger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}
	
	

}
