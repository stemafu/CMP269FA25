
public class Employee extends Person {
	private String title;
	private boolean isAFullTimer;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean getIsAFullTimer() {
		return isAFullTimer;
	}
	public void setIsAFullTimer(boolean isAFullTimer) {
		this.isAFullTimer = isAFullTimer;
	}
	
	public void display() {
		//System.out.println("Display in the person class");
		super.display();
		System.out.println("Title: " + this.getTitle());
		System.out.println("Is a full time employee? " + this.getIsAFullTimer());
		
	}
	
	
	

}
