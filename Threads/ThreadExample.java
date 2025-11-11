/*
 * In Java we can implement threads in two ways.
 * 1. implementing the runnable interface and overriding the
 * run method.
 * 
 * 2. extending the Thread class.
 * 
 * No 1 is the recommended way of implementing threads in Java
 * 
 */
public class ThreadExample implements Runnable{

	public static void main(String[] args) {

		// The following is a runnable object
		// The object of the runnable class
		ThreadExample runnableObject = new ThreadExample();

		// Thread of the given runnable object
		Thread thread1 = new Thread(runnableObject, "Thread 1");
		Thread thread2 = new Thread(runnableObject, "Thread 2");
		Thread thread3 = new Thread(runnableObject, "Thread 3");

		// Once as thread has been created, it must be started.
		System.out.println("The main method");
		try {
			thread1.start();
			thread2.start();
			thread3.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}


		try {
			thread1.join();
			thread2.join();
			thread3.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}


		System.out.println("Back in the main method");

	}

	@Override
	public void run() {


		if(Thread.currentThread().getName().equals("Thread 1")) {
			int total = 0;
			for(int i = 0; i < 10_000; i++) {
				total = total + i;
			}
			System.out.println("Total is " + total);
			System.out.println(Thread.currentThread().getName());
		}else if(Thread.currentThread().getName().equals("Thread 2")) {
			System.out.println(Thread.currentThread().getName());
		}else if(Thread.currentThread().getName().equals("Thread 3")) {
			System.out.println(Thread.currentThread().getName());
		}

	}


}
