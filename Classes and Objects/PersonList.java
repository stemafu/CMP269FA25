
public class PersonList {
	
	/*
	 * This class will be used to hold a list of Persons (people).
	 *  When we say a list, could just be referring to an array.
	 */
	
	private Person [] personList;
	private static final int INITIAL_ARRAY_SIZE = 5;
	
	
	/*
	 * We can be able to create a list representing people.
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
	 * 
	 * 
	 * What is a data type or what does a data type do?
	 * 
	 * A data type specifies what value can be stored in a variable.
	 * 
	 * Anytime we create our own class, we are creating our own custom data type.
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
	
	
	/*
	 * The following method will return the amount of people (persons)that are are currently stored 
	 * in the list. 
	 */
	
	public int size() {
		return numPeople;
	}
	
	/*
	 * The following method will return true if our list is empty. 
	 * Otherwise, false. 
	 */
	public boolean isEmpty() {
		/*if( this.numPeople == 0) {
			return true;
		}else {
			return false;
		}*/
		
		return (this.numPeople == 0);
	}
	
	
	/*
	 * The following method will be used to add a person to the back of the list.
	 * 
	 * 
	 * The parameter is the person to be added to the list.
	 * Eventually, we will also need to throw some exceptions....
	 * 
	 * Notice that this list is based an array object. We know that array
	 * have sizes that are not dynamic. What should when we add a person and 
	 * our array is full?
	 * 1. We could increase the capacity and add the new person. The moment we do this, our list
	 * become dynamic. 
	 * 2. We could choose not to add the new person to the list because it is full. The
	 * size is said to be fixed.
	 * 
	 * Another case that we have to thing about is a situation when the parameter is null.
	 * We do want to add anything that is null because that is not a person object.
	 */
	public void add(Person person) {
		
		/*
		 * Eventually, we will address this using exceptions.
		 */
		if(person == null) {
			System.out.println("Person is null");
			return;
		}
		
		
		/*
		 * Check if the list if full. If our list size is fixed, then we can use the following
		 * to inform the users that the list if full.
		 */
		/*
		if(this.isFull()) {
			System.out.println("You cannot add more people because the list is full.");
			return;
		}*/
		
		
	
		/*If we want a dynamic list rather than a fixed size list, then we have to resize
		 * our array when it is full.
		 */
		if(this.isFull()) {
			
			// resize the array personList because it is currently full
			this.resize();
			
		}
		
		// Now let us add the person to the list.
		personList[this.numPeople] = person;
		this.numPeople++;
	}
	
	/*
	 * Method overloading.
	 * 
	 * What is method overloading?
	 * 
	 * Method overloading describes a process where by we can define multiple methods with the
	 * same name but different parameters.
	 * 
	 * We would like to define a method add a person to the list given the parameters
	 * name, age, height.
	 */
	public void add(String name, int age, double height) {
		if(name == null) {
			System.out.println("You cannnot add a person without a name");
			return;
		}
		
		// We need to create a person
		
		Person person = new Person(name, age, height);
		
		// Now we can the above add method
		this.add(person);
	}
	
	
	
	
	/**
	 * The following method is used to add the specified person at the specified index.
	 * We expect the index to valid. Please remember that the values in the personList array
	 * are stored in a contiguous way. The elements are not scattered all over.
	 * We do not expect the person to be null. If the person provided as a parameter is null,
	 * that value should not be added to the list
	 * @return
	 */
	public void add(Person person, int index) {
		
		// Parameter checking
		
		if(person == null) {
			System.out.println("Person cannot be null");
			return;
		}
		
		
		if(index < 0 || index > this.numPeople) {
			System.out.println("Please use a valid index");
			return;
		}
		
		/*
		 * Add to the back of the list
		 */
		if(index == this.numPeople) {
			this.add(person);
		}else {
			/*
			 * If our list already contains elements and we are adding at any other index 
			 * before the last index, then we have to shift the elements to create room for the new person 
			 * person at the specified index in the list.
			 * 
			 * Once we have shifted the values, we can insert the new person at the specified index
			 * in the list.
			 */
			
			/*
			 * What if the array is full? 
			 */
			
			if(this.isFull()) {
				this.resize();
			}
			
			// Shift
			for(int i = this.numPeople; i > index; i-- ) {
				this.personList[i] = this.personList[i - 1];
			}
			
			this.personList[index] = person;
		}
		
	}
	
	
	/*
	 * The following method is used to add a new person to the front of the list. 
	 * This means that we will always add a new person via index 0.
	 * If the list does not contain any elements, we just add the new person.
	 * 
	 * If the list contains some elements then we have to shift the elements to create
	 * room at the first index.
	 * 
	 * After shifting, we can now add the new person to the list.
	 * 
	 */
	public void addFront(Person person) {
		
		
		if(person == null) {
			System.out.println("Person cannot be null");
			return;
		}
		
		if(this.size() == 0) {
			this.add(person);
		}else {
			
			this.add(person, 0);
			
//			if(this.isFull()) {
//				this.resize();
//			}
//			
//			for(int i = this.numPeople; i > 0; i-- ) {
//				this.personList[i] = this.personList[i - 1];
//			}
//			
//			this.personList[0] = person;
		}
	}
	
	
	/* 
	 * The following method is used to get a person at the specified index.
	 * 
	 * If the index is not valid, we will return a null. Otherwise, we will return
	 * the person at the specified index.
	 */
	public Person get(int index) {
		
		if(index < 0 || index >= this.numPeople) {
			return null;
		}else {
			return personList[index];
		}
		
	}
	
	
	/*
	 * The following method will be used to replace a person at an index with the specified 
	 * person.
	 * 
	 * The parameter person cannot be null and the index has to be valid
	 * 
	 * 
	 * The method returns the person that has been replaced. If the index is not valid,
	 * the method returns null and if the person parameter is null return null.
	 *
	 */
	
	public Person replace(Person person, int index) {
		if(index < 0 || index >= this.numPeople || person == null) {
			return null;
		}
		
		
		Person replacedPerson = personList[index];
		
		personList[index] = person;
		
		return replacedPerson;
	}
	
	/*
	 * The following method removes and returns the person at the specified
	 * index in the list.
	 * 
	 * If the index is not valid, we return null.
	 * 
	 * 
	 * If we remove the person from the back of the list, no shifting is needed.
	 * However, if it is any other index before the last index, then we need to shift.
	 * Also, if the list only contains one item, then we just need to remove everything.
	 */
	public Person remove(int index) {
		
		if(index < 0 || index >= this.numPeople) {
			return null;
		}else {
			
			Person removedPerson = null;
			if (this.numPeople == 1) {
				removedPerson = this.personList[0];
				this.removeAll();
				//return removedPerson;
			}else if(index == (this.numPeople - 1)) {
				removedPerson = this.personList[index];
				this.numPeople--;
				//return removedPerson;
			}else {
				removedPerson = this.personList[index];
				
				for(int i = index; i <this.numPeople - 1; i++) {
					this.personList[i] = this.personList[i + 1];
				}
				//return removedPerson;
			}
			
			return removedPerson;
		}
		
	}
	
	
	public void removeAll() {
		this.numPeople = 0;
		this.personList = new Person[this.personList.length];
	}
	
	
	
	
	/*
	 * The following method returns true if the current list is full.
	 * Otherwise, it returns false.
	 */
	public boolean isFull() {
		return this.numPeople == this.personList.length;
	}
	
	
	private void resize() {
		// resize
		Person [] personListCopy = new Person[personList.length * 2];
		
		for(int i = 0; i < personList.length; i++) {
			personListCopy[i] = personList[i];
		}
		
		
		personList = personListCopy;
	}
	

}
