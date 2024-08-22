package servicee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entityy.Room;
import repositoryy.RoomRepository;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    // Method to retrieve all rooms
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    // Method to retrieve a room by its ID
    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    // Method to create a new room
    public Room createRoom(Room room) {
        // Validate minimum and maximum booking periods
        if (room.getMinBookingPeriod() <= 0 || room.getMaxBookingPeriod() <= 0 || room.getMinBookingPeriod() > room.getMaxBookingPeriod()) {
            throw new IllegalArgumentException("Invalid booking periods");
        }
        // Validate rent amount
        if (room.getRentAmountPerDay() <= 0) {
            throw new IllegalArgumentException("Invalid rent amount");
        }
        // Save the room to the database
        return roomRepository.save(room);
    }

    // Method to update an existing room
    public Room updateRoom(Long id, Room room) {
        // Validate minimum and maximum booking periods
        if (room.getMinBookingPeriod() <= 0 || room.getMaxBookingPeriod() <= 0 || room.getMinBookingPeriod() > room.getMaxBookingPeriod()) {
            throw new IllegalArgumentException("Invalid booking periods");
        }
        // Validate rent amount
        if (room.getRentAmountPerDay() <= 0) {
            throw new IllegalArgumentException("Invalid rent amount");
        }
        // Check if the room exists in the database
        if (!roomRepository.existsById(id)) {
            throw new RuntimeException("Room not found with id: " + id);
        }
        // Set the ID of the room to be updated
        room.setId(id);
        // Save the updated room to the database
        return roomRepository.save(room);
    }

    // Method to delete a room by its ID
    public void deleteRoom(Long id) {
        // Check if the room exists in the database
        if (!roomRepository.existsById(id)) {
            throw new RuntimeException("Room not found with id: " + id);
        }
        // Delete the room from the database
        roomRepository.deleteById(id);
    }
}