package ConferenceManagementSystem;

import java.util.List;

public class Building {

	String buildingName;
	List<ConferenceRoom> conferenceRooms;

	
	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	
	
	public List<ConferenceRoom> getConferenceRooms() {
		return conferenceRooms;
	}

	public void setConferenceRooms(List<ConferenceRoom> conferenceRooms) {
		this.conferenceRooms = conferenceRooms;
	}

	
	
	
}
