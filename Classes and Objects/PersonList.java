
public class PersonList {
	
	/*
	 * This class will be used to hold a list of Persons.
	 *  When we say a list, could just be referring to an array.
	 */
	
	private Person [] personList;
	
	private static final int INITIAL_ARRAY_SIZE = 10;
	
	
	/*
	 * Once we have a list created, we want to be able to add new people to this 
	 * list.
	 * 
	 * And in the future, we will also want to remove people from this list.
	 * 
	 * We will also want to update information about existing people in the
	 * list.
	 * 
	 * We need to define operations for doing this. What are operations?
	 * The operations are methods.
	 * 
	 * When want to add a value to the list, we will need to know where to add.
	 * We need to know the index where to add the value.
	 * 
	 * We need to create a variable that we can use to hold an index value.
	 * Everyone we add a new value, the index will be incremented. 
	 */
	
	
	private int numPeople;
	
	public PersonList() {
		/*
		 * When the array is created, it is filled with the default initial value, which for an object type is null. 
		 */
		personList = new Person[INITIAL_ARRAY_SIZE];
		
		
		/*
		 * If we want person objects, we have to create them using the following process.
		 */
		for(int i = 0; i < personList.length; i++) {
			personList[i] = new Person();
		}
		this.numPeople = 0;
	}
	

}
