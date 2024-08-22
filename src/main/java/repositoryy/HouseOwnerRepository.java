package repositoryy;

import org.springframework.data.jpa.repository.JpaRepository;

import entityy.HouseOwner;

public interface HouseOwnerRepository extends JpaRepository<HouseOwner, Long> {
    // Add custom methods if needed
}