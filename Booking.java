package ConferenceManagementSystem;

import java.util.*;

public class Booking {

	int id;
	String slot;

	// by this map we will get all the available rooms in the given time slot
	Map<String, List<Integer>> bookingDetail = new HashMap<>();

	public List<Integer> getBookingDetail(String slot) {
		if (bookingDetail.get(slot) != null) {
			return bookingDetail.get(slot);
		} else {
			// if rooms are not there then return the complete list of all the rooms
			// available
			List<ConferenceRoom> allRooms = new ArrayList<>();
			ConferenceRoom a1 = new ConferenceRoom(101, "a1", 10, 5, 19);
			ConferenceRoom a2 = new ConferenceRoom(102, "a2", 200, 6, 20);
			ConferenceRoom a3 = new ConferenceRoom(103, "a3", 30, 7, 21);
			ConferenceRoom a4 = new ConferenceRoom(104, "a4", 35, 8, 22);
			allRooms.add(a1);
			allRooms.add(a2);
			allRooms.add(a3);
			allRooms.add(a4);
			List<Integer> allRoomsId = new ArrayList<>();
			for (int i = 0; i < allRooms.size(); i++) {
				allRoomsId.add(allRooms.get(i).getId());
			}
			return allRoomsId;

		}
	}

	public void createBooking(int roomId, String slot) {

		// 12 hrs check to book the room
		String[] arr = slot.split(":");
		if (Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]) > 12) {
			System.out.println("error: time slot selected for more than 12 hrs");
		} else {

			if (bookingDetail.get(slot) != null && bookingDetail.get(slot).equals(roomId)) {
				System.out.println("error: room already booked for the given time slot");

			} else {

				List<Integer> rooms = new ArrayList<>();
				rooms.add(roomId);
				bookingDetail.put(slot, rooms);

			}
		}

	}

	public void cancelBooking(int roomId, String slot) {
		if (bookingDetail.get(slot) != null && bookingDetail.get(slot).equals(roomId)) {
			bookingDetail.remove(slot);
		}

	}

}
