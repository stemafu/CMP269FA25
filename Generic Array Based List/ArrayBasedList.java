
public class ArrayBasedList<T> implements ListInterface<T> {

	private static final int INITIAL_ARRAY_SIZE = 5;
	private Object [] elements = new Object[INITIAL_ARRAY_SIZE];
	private int numElements = 0;
	
	
	public  ArrayBasedList() {
		elements = new Object[INITIAL_ARRAY_SIZE];
		numElements = 0;
	}
	
	public  ArrayBasedList(int size) {
		elements = new Object[size];
		numElements = 0;
	}	
	
	@Override
	public boolean isEmpty() {
		return (this.numElements == 0);
	}

	@Override
	public int size() {
		
		return numElements;
	}

	@Override
	public void add(T element) {
		
		if(element == null) {
			System.out.println("element cannot be null");
			return;
		}
		
		if(this.isFull()) {
			this.resize();
		}
		
		this.elements[this.numElements] = element;
		this.numElements++;
		
	}

	@Override
	public void add(T element, int index) {
		if(element == null) {
			System.out.println("element cannot be null");
			return;
		}
		
		if(index < 0 || index > this.numElements) {
			System.out.println("Invalid index " + index);
			return;
		}
		
		if(this.isFull()) {
			this.resize();
		}
		
		
		if(this.isEmpty() || index == numElements) {
			this.add(element);
		}else {
			
			
			//Shift values
			for(int i = this.numElements; i > index; i--) {
				this.elements[i] = this.elements[i - 1];
			}
			
			this.elements[index] = element;
			this.numElements++;
		}
		
	}

	@Override
	public void addFront(T element) {
		if(element == null) {
			System.out.println("element cannot be null");
			return;
		}
		
	}

	@Override
	public T get(int index) {
		
		if(index < 0 || index >= this.numElements) {
			return null;
		}
		
		
		return (T)elements[index];
	}

	@Override
	public T replace(T element, int index) {
		
		if(element == null) {
		
			return null;
		}
		
		if(index < 0 || index >= this.numElements) {
			return null;
		}
			
		T replacedElement = (T)elements[index];
		elements[index] = element;
		
		return replacedElement;
	}

	@Override
	public T remove(int index) {
		
		if(index < 0 || index >= this.numElements) {
			return null;
		}
		
		
		T removedElement = (T)elements[index];
		
		
		if(this.numElements == 1) {
			this.removeAll();
		}else if(index == this.numElements - 1) {
			this.numElements--;
		}else {
			// shift first to the to the front
			
			for(int i = index; i < this.numElements; i++) {
				this.elements[i] = this.elements[i + 1];
			}
			this.numElements--;
		}
		
		return removedElement;
	}

	@Override
	public void removeAll() {
		this.elements = new Object[this.elements.length];
		this.numElements = 0;
		
	}
	
	public boolean isFull() {
		return (this.numElements == this.elements.length);
	}
	
	private void resize() {
		Object [] elementsCopy = new Object[elements.length * 2];
		
		for(int i = 0; i < this.numElements; i++) {
			elementsCopy[i] = elements[i];
		}
		elements = elementsCopy;
		
	}

}
