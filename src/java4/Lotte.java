package java4;

public class Lotte {

	public static void main(String[] args) {
		System.out.println("�ܹ��� ��Ʈ�� ��������ϴ�.");
		System.out.println("=============");

		BigBurger b1 = new BigBurger(4000, "�����");
		Coke c1 = new Coke(1500, "�ݶ�");
		FrenchFried f1 = new FrenchFried(1000, "����Ƣ��");
		System.out.println();

		BigBurgerSet set1 = new BigBurgerSet(

				new BigBurger(4000, "�����"), 
				new Coke(1500, "�ݶ�"), 
				new FrenchFried(1000, "����Ƣ��")
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
