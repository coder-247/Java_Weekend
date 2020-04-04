package java4;

public class Lotte {

	public static void main(String[] args) {
		System.out.println("ÇÜ¹ö°Å ¼¼Æ®¸¦ ¸¸µé¾ú½À´Ï´Ù.");
		System.out.println("=============");

		BigBurger b1 = new BigBurger(4000, "ºò¹ö°Å");
		Coke c1 = new Coke(1500, "ÄÝ¶ó");
		FrenchFried f1 = new FrenchFried(1000, "°¨ÀÚÆ¢±è");
		System.out.println();

		BigBurgerSet set1 = new BigBurgerSet(

				new BigBurger(4000, "ºò¹ö°Å"), 
				new Coke(1500, "ÄÝ¶ó"), 
				new FrenchFried(1000, "°¨ÀÚÆ¢±è")
				);
		System.out.println(set1);
		System.out.println();
		
		BigBurgerSet set2= new BigBurgerSet(
						
				new BigBurger(), 
				new Coke(), 
				new FrenchFried()
				);
		System.out.println();
		
	
		
	}
	

}
