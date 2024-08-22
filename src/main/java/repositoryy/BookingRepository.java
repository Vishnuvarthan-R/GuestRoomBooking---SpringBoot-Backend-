package repositoryy;

import org.springframework.data.jpa.repository.JpaRepository;

import entityy.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Add custom methods if needed
}