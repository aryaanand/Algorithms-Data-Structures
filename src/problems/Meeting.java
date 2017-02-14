package problems;

public class Meeting {
	
	int startTime;
	int endTime;
	
	public Meeting(int startTime, int endTime) {
		
		this.startTime = startTime;
		this.endTime = endTime;
		
	}

	public String toString() {
		return String.format("(%d, %d)", startTime, endTime);
	}
}
