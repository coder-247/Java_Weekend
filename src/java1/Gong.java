package java1;

public class Gong {

	public static void main(String[] args) {
		int a[] = {32,11,12,18, 36};
		int n1;
		int n2;
		int sum;
		for (int i = 0; i < 5 ; i++) {
			n1 = a[i] %3;
			n2 = a[i] %4;
			sum = n1+n2;
			if (sum == 0) {
				
				System.out.println(a[i]);
			}
				else {
					sum = 0;
					
				
			}
			
			
		}

	}

}
