package controllerr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import servicee.HouseOwnerService;

@RestController
@RequestMapping("/houseOwners")
public class HouseOwnerController {
    private final HouseOwnerService houseOwnerService = new HouseOwnerService();

	public HouseOwnerService getHouseOwnerService() {
		return houseOwnerService;
	}
    
    // Constructor
    
    // REST endpoints for house owners
}