package ConferenceManagementSystem;
import java.util.*;
public class ManageConference {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		//Manager update
		BuildingManager manager = new BuildingManager();
		//creating rooms
		ConferenceRoom a1 = new ConferenceRoom(101,"a1",10,5,19);
		ConferenceRoom a2 = new ConferenceRoom(102,"a2",200,6,20);
		ConferenceRoom a3 = new ConferenceRoom(103,"a3",30, 7, 21);
		ConferenceRoom a4 = new ConferenceRoom(104,"a4",35,8, 22);
		List<ConferenceRoom> confRoomsForAlpha = new ArrayList<>();
		//adding rooms to the building
		manager.confRoomsInBuilding.put("alpha", confRoomsForAlpha);
		confRoomsForAlpha.add(a1);
		confRoomsForAlpha.add(a2);
		confRoomsForAlpha.add(a3);
		confRoomsForAlpha.add(a4);
		manager.confRoomsInBuilding.put("alpha", confRoomsForAlpha);		
		
		//Register new user
		System.out.println("Hello! please enter your name so we can add u as user");
		String name = obj.nextLine();	
		User user = new User(Math.random(), name);
		System.out.println("user add: "+ user.getUserId()+" "+ user.getName() );
		
		//check all the conference rooms in a given building
		System.out.println("Enter the building where u want to check the conference rooms:");
		String buildingName = obj.nextLine();	
		if(manager.getConfRoomsInBuilding(buildingName)!= null) {
			List<ConferenceRoom> rooms = manager.getConfRoomsInBuilding(buildingName);
			
			System.out.println("Conference rooms in building " +buildingName+" are " );
			for(int i=0;i<rooms.size();i++) {
				System.out.print(rooms.get(i).getName()+" ");
			}
	
		}
		else {
			System.out.println("No conference rooms in the entered building");

		}
		System.out.println();
		//check rooms for the given slot
		System.out.println("Enter the slot u want to check the required rooms for:");
		String slot = obj.next();
		Booking booking = new Booking();
		List<Integer> availableRooms = booking.getBookingDetail(slot);
		System.out.println("available rooms for that slot are: " + availableRooms);
		
		
		//make the booking for the given slot and room Id
		System.out.println("Enter the room id amongst the available list to make booking:");
		int roomId = obj.nextInt();
		if(availableRooms.contains(roomId)) {
			booking.createBooking(roomId, slot);
		}
		else {
			System.out.println("entered room id is not free");
		}
		   //check status for the slot
		List<Integer> bookedRoom = booking.getBookingDetail(slot);
		System.out.println("for the given slot, room ids which are booked are: "+bookedRoom );
		
		
		//Booking made by the given user
		Map<String, List<Integer>> userBookings = new HashMap<>();
		userBookings.put(user.getName(), booking.getBookingDetail(slot));	
		System.out.println("rooms booked by " +user.getName()+" are "+userBookings.get(user.getName()) );

	}

}
