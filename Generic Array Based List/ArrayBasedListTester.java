
public class ArrayBasedListTester {

	public static void main(String[] args) {
		
		ArrayBasedList<Integer> list;
		list = new ArrayBasedList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(300);
		list.add(700);
		list.add(800);
		list.add(1000, 3);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println("index 0 has a 100 = " + list.get(0));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("get at " + i + " "+ list.get(i));
		}
		
		
		Integer x = list.replace(2000, 3);
		System.out.println(x);
		
		
		 x = list.replace(2000, -3);
		System.out.println(x);
		
		 x = list.replace(2000, 30);
		System.out.println(x);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		x = list.remove(0);
		System.out.println(x);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		x = list.remove(0);
		System.out.println(x);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}

}
