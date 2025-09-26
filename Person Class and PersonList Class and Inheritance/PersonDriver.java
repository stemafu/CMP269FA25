
public class PersonDriver {
	
	public static void main(String [] args) {
		
		Person p1 = new Person();
		Person p10 = new Person();
		Person p2 = new Person();
		
		//p1.age = -10; // This is directly accessing the variable age
		
		p1.setAge(10);
		p1.setEmplid(12345678);
		p1.setHeight(4.0);
		p1.setWeight(150.0);
		p1.setName("Drink Water");
		
		System.out.println(Person.getPersonCount());
	}

}
