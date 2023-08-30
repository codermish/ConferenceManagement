package ConferenceManagementSystem;

import java.util.Map;

public class ConferenceRoom {
	
	//constructor
	ConferenceRoom(int id, String name, int capacity, int buildingNo, int floorNo ){
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.buildingNo = buildingNo;
		this.floorNo = floorNo;
	}
	//fields
	int id;
	String name;
	int buildingNo;
	int floorNo;
	int capacity;
	Map<String, Boolean> bookingStatus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Map<String, Boolean> getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(Map<String, Boolean> bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	

}
