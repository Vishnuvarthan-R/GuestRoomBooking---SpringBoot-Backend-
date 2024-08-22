package servicee;

import org.springframework.stereotype.Service;

import repositoryy.HouseOwnerRepository;

@Service
public class HouseOwnerService {
    private final HouseOwnerRepository houseOwnerRepository = null;

	public HouseOwnerRepository getHouseOwnerRepository() {
		return houseOwnerRepository;
	}
    
    // Constructor
    
    // Methods for registering, editing, and deleting house owners
}