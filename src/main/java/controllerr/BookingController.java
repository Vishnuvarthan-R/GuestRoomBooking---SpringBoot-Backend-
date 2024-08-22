package controllerr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import servicee.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService = new BookingService();

	public BookingService getBookingService() {
		return bookingService;
	}
    
    // Constructor
    
    // REST endpoints for bookings
}