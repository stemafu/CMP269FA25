
public class StatisticsExample {
	
	private int [] nums = {50, 20, 30, 100, 40, 70, 25, 41, 16, 69};
	private int max;
	private int min;
	private int range;
	
	private int total1;
	private int total2;
	
	class Max implements Runnable{
		
		public void run() {
			
			max = nums[0];
			
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] > max) {
					max = nums[i];
				}
			}
		}
	}
	
	class Min implements Runnable{
		
		
		public void run() {
			
			min = nums[0];
			
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] < min) {
					min = nums[i];
				}
			}
		}
	}
	
	class Range implements Runnable{
		
		public void run() {
			
			// We need to compute max
			// we need to compute min
			
			Min rangeMinRunnable = new Min();
			Max rangeMaxRunnable = new Max();
			
			Thread maxThread = new Thread(rangeMinRunnable);
			Thread minThread = new Thread(rangeMaxRunnable);
			
			try {
				
				maxThread.start();
				minThread.start();
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			try {
				maxThread.join();
				minThread.join();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			range = max - min;
		}
	}
	
	
	class Sum1 implements Runnable{

		@Override
		public void run() {
			total1 = 0;
			for(int i = 0; i < nums.length/2; i++) {
				total1 = total1 + nums[i];
			}
			
		}
		
	}

	class Sum2 implements Runnable{

		@Override
		public void run() {
			total2 = 0;
			for(int i = nums.length/2; i < nums.length; i++) {
				total2 = total2 + nums[i];
			}
			
		}
		
	}	
	
	
	public static void main(String[] args) {
		
		
		StatisticsExample statObject2 = new StatisticsExample();
		StatisticsExample statObject = new StatisticsExample();
		// Create runnables
		Min minRunnable = statObject.new Min();
		Max maxRunnable = statObject.new Max();
		Range rangeRunnable = statObject.new Range();
		
		Sum1 sum1Runnable = statObject.new Sum1(); 
		Sum2 sum2Runnable = statObject.new Sum2(); 
		// Create threads
		
		Thread maxThread = new Thread(maxRunnable);
		Thread minThread = new Thread(minRunnable);
		Thread rangeThread = new Thread(rangeRunnable);
		
		Thread sum1Thread = new Thread(sum1Runnable);
		Thread sum2Thread = new Thread(sum2Runnable);
		
		// We need to start the threads
		try {
			
			maxThread.start();
			minThread.start();
			rangeThread.start();
			
			sum1Thread.start();
			sum2Thread.start();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		
		/* We are going to wait for the two threads to finish
		their computation because we want to display the result
		of the computation.
		
		*/
		try {
			maxThread.join();
			minThread.join();
			rangeThread.join();
			sum1Thread.join();
			sum2Thread.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Range " + statObject.range);
		System.out.println("Max " + statObject.max);
		System.out.println("Min " + statObject.min);
		
		System.out.println("total " + (statObject.total1 + statObject.total2));
		
	}

}
