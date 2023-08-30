package ConferenceManagementSystem;

public class User {
	
	User(double userId, String name){
		this.userId = userId;
		this.name = name;
	}
	
	double userId;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	
	public double getUserId() {
		return userId;
	}

	public void setUserId(double userId) {
		this.userId = userId;
	}
	

	
//	listAllBooking()
//	makeBooking()
//	cancelBooking()
//	listAllRooms(int capacity, slot)
//	checkCapacity(int id)
	
	
}
