package servicee;

import org.springframework.stereotype.Service;

import repositoryy.BookingRepository;

@Service
public class BookingService {
    private final BookingRepository bookingRepository = null;

	public BookingRepository getBookingRepository() {
		return bookingRepository;
	}
    
    // Constructor
    
    // Methods for managing bookings
}