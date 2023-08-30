package ConferenceManagementSystem;
import java.util.*;
public class BuildingManager {
	
	
	Map<String, List<ConferenceRoom>> confRoomsInBuilding = new HashMap<>();

	public List<ConferenceRoom> getConfRoomsInBuilding(String buildingName) {
		if(confRoomsInBuilding.get(buildingName)!= null) {
			return confRoomsInBuilding.get(buildingName);

		}
		return null;
	}
	
	public void addRoomToBuilding(String buildingName, List<ConferenceRoom> rooms) {
		confRoomsInBuilding.put(buildingName, rooms);
		
	}
	
	

}
