
public class Person {

	/* An instance variable is a variable defined within a class
	 * but outside of any method and does not contain the keyword static.
	 * 
	 * When you look at the following variables, you will observe that
	 * their values would change from person to person. Their values are
	 * unique to each person.
	 */
	private int emplid;
	private int age;
	private String name;
	private double height;
	private double weight;
	private int idNumber;
	
	
	private static int personsCount = 0;
	
	/*
	 * Constructors
	 * 
	 * A constructor is special method that does not have any return type at all and has the 
	 * same name as the class.
	 * 
	 * A constructor is used to create an object.
	 * 
	 * We do have two main types of constructors. 
	 * 
	 * 1. A default constructor (No-argument constructor).
	 * If you do not define any constructor, Java give one and this is the default constructor.
	 * 
	 * This is just a constructor that does not take any parameters.
	 * 
	 * 2. Parameterized constructor(s)
	 * These types of constructors take parameters.
	 */
	
	public Person() {
		this.emplid = -1;
		this.age = 0;
		this.name = "Unknown name";
		this.weight = 0.0;
		this.height = 0.0;
		this.idNumber = personsCount;
		personsCount++;
	}
	
	
	public Person(String name, int age) {	
		this.setAge(age);
		this.setName(name);
		this.emplid = -1;
		this.weight = 0.0;
		this.height = 0.0;
		personsCount++;
	}
	
	public Person(String name, int age,  double weight) {	
		//this.setAge(age);
		//this.setName(name);
		
		this(name, age);
		this.setWeight(weight);
		this.emplid = -10;
		this.height = 0.0;
		personsCount++;
	}	
	
	
	
	
	
	
	/*
	 *  Setter methods 
	 *  A setter method is called a mutator. 
	 *  Setters are used to change a value of a variable.
	 *  
	 *  Setters usually do not return a value but they take a parameter or parameters.
	 */
	
	public void setAge(int age) {
		if(age <= 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
	}
	
	public void setEmplid(int emplid) {
		if(emplid <= 0) {
			this.emplid = 0;
		}else {
			this.emplid = emplid;
		}
	}
	
	public void setName(String name) {
		if(name == null || name.length() == 0) {
			this.name = "Unknown name";
		}else {
			this.name = name;
		}
	}
	
	public void setWeight(double weight) {
		if(weight <= 0.0) {
			this.weight = 1.0;
		}else {
			this.weight = weight;
		}
	}
	
	public void setHeight(double height) {
		if(height <= 0.0) {
			this.height = 1.0;
		}else {
			this.height = height;
		}
	}
	
	
	// Getters
	
	/*
	 * Getters are used to retrieve a value of a variable.
	 * Getters return a value. usually getter have not parameters.
	 */
	
	public int getEmplid() {
		return emplid;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	public int getIdNumber() {
		return idNumber;
	}
	
	/*
	 * The following method returns the amount of the persons
	 * that have been created using this class.
	 */
	
	public static int getPersonCount() {
		return personsCount;
	}
	
	
	public void display() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.age);
		System.out.println("Weight: " + this.weight);
		System.out.println("Height: " + this.height);
		System.out.println("Emplid: " + this.emplid);
	}
	
	
	
	
}
