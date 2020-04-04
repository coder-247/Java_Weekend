package java2;

//
public class ForEx02 {
	
		static void forTest(int n1) {
			//
			for (int i=1; i<=9; i++) {
			System.out.println(n1+"*"+i+"="+(n1*i));
		}
		}
		
	public static void main(String[] args) {
		//
		for (int i=2; i<10; i++) {
		//
			for (int k =1; k<=9; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
		}
	}

}
