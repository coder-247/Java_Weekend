package java1;


//�߻����� ��
class People {
	String name;
	int age;
	char gender;
	int height;
	int weight;

}

public class VarEx04 {

	public static void main(String[] args) {
		System.out.println("------1983-------");
		People jeongrim = new People();
		jeongrim.name = "������";
		jeongrim.age = 38;
		jeongrim.gender = '��';
		jeongrim.height =160; 
		jeongrim.weight = 53;
		
		System.out.println(jeongrim.name);
		System.out.println(jeongrim.age);
		System.out.println(jeongrim.gender);
		System.out.println(jeongrim.height);
		System.out.println(jeongrim.weight);

	}

}
