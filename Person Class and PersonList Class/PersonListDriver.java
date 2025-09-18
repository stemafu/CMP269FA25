
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
		
		Person p6 = new Person("Bedford Jerome", 100, 5.5);
		
		Person p7 = new Person("Eat Food", 50, 5.5);
		
		list.add(p6, 0);
		
		list.addFront(p7);
		list.get(1).display();
		
		
		Person p15 = new Person("Lady Liberty", 50, 5.5);
		list.replace(p15, 0).display();
		
		
		list.get(0).display();
		
		//System.out.println(list.isEmpty());
		//System.out.println(list.size());
	}

}
