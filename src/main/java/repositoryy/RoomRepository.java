package repositoryy;

import org.springframework.data.jpa.repository.JpaRepository;

import entityy.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    // Add custom methods if needed
}