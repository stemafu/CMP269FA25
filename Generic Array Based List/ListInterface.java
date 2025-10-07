

/**
 * This is a ListInterface that will be implemented by all List Classes
 * @param <T> - data type for a specified list
 */

public interface ListInterface<T> {
	
	/** 
	 * Java Doc comment
	 * This method checks to see if the list is empty.
	 * @return  true - if the list is empty. Otherwise, false.
	 */
	public boolean isEmpty();
	
	/**
	 * This method returns the total amount of the elements in
	 * the list
	 * @return - amount of elements in the list
	 */
	public int size();
	
	/**
	 * The following method is used to add the specified element at the end of 
	 * the list.
	 * Please remember that the values in the list array
	 * are stored in a contiguous way. The elements are not scattered all over.
	 * We do not expect the element to be null. If the element provided as a 
	 * parameter is null, that value should not be added to the list
	 * @param element - th
	 */
	public void add(T element);
	
	/**
	 * The following method is used to add the specified element
	 *  at the specified index in the list.
	 * We expect the index to valid. 
	 * Please remember that the values in the list array
	 * are stored in a contiguous way. The elements are not scattered all over.
	 * We do not expect the element to be null. 
	 * If the element provided as a parameter is null, that value should not be added to the list
	 * @param element - the
	 * @param index - the
	 */
	public void add(T element, int index);
	
	/**
	 * The following method is used to add a new element to the front of the list. 
	 * This means that we will always add a new element at index 0.
	 * If the list does not contain any elements, we just add the new person.
	 * 
	 * If the list contains some elements then we have to shift the elements to create
	 * room at the first index.
	 * 
	 * After shifting, we can now add the new element to the list.
	 * 
	 * @param element - element
	 */
	public void addFront(T element);
	
	/**
	 * The following method is used to get an element at the specified index.
	 * 
	 * If the index is not valid, we will return a null. Otherwise, we will return
	 * the element at the specified index.
	 * @param index - index
	 * @return - element at the given index
	 */
	public T get(int index);
	
	/**
	 * The following method will be used to replace an element at
	 * the specified index with the specified element.
	 * 
	 * The parameter element cannot be null and the index has to be valid
	 * 
	 * 
	 * The method returns the element that has been replaced. If the index is not valid,
	 * the method returns null and if the parameter is null return null.
	 *
	 * @param element - d
	 * @param index - 3
	 * @return removed element
	 */
	public T replace(T element, int index);
	
	/**
	 * The following method removes and returns the element at the specified
	 * index in the list.
	 * 
	 * If the index is not valid, we return null.
	 * 
	 * 
	 * If we remove the element from the back of the list, no shifting is needed.
	 * However, if it is any other index before the last index, then we need to shift.
	 * Also, if the list only contains one item, then we just need to remove everything.
	 * @param index - w
	 * @return removed element
	 */
	public T remove(int index);
	
	/**
	 * This method removes all elements in the list.
	 */
	public void removeAll();

}
