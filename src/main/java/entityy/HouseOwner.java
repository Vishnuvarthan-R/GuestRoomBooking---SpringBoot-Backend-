package entityy;

import jakarta.persistence.*;

@Entity
public class HouseOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String mobileNumber;
    
    // Add other fields, constructors, getters, and setters
}