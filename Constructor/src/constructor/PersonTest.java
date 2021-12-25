package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		Person personPark = new Person("박지윤");
		Person personOh = new Person("오경룡", 169.9F, 85.0F);
		
		System.out.println(personOh.name);
		System.out.println(personOh.height);
		System.out.println(personOh.weight);
	}

}
