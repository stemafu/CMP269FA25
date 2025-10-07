
/*
 * <T> in the following class is a generic type variable.
 * It is a placeholder for an actual data type. It is standing
 * in for some data type.
 */
public class Box<T> {
	private T data;
	
	

	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}



	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<Integer>();
		
		box1.setData(2);
		
		Box<String> box2 = new Box<String>();
		
		Box<Double> box3 = new Box<Double>();
		box3.setData(2.5);
		box3.setData(7.54);
	}

}
