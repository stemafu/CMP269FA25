
public class PersonListDriver {

	public static void main(String[] args) {
		
		PersonList list = new PersonList();
		
		
		Person p1 = new Person("Drink Water", 15, 7.0);
		Person p3 = new Person("Shadow", 25, 4.0);
		Person p5 = new Person("Hedgehog", 30, 5.5);
		
		list.add(p5);
		list.add(p1);
		list.add(p3);
		
		list.add("Ocean Man", 40, 5);
		list.add("Wonderwoman", 30, 5.2);
		list.add("Mary", 31, 5.2);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}

}
