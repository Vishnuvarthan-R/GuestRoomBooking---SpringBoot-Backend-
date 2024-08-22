package entityy;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int floorSize;
    private int numberOfBeds;
    private int minBookingPeriod; // Minimum booking period in days
    private int maxBookingPeriod; // Maximum booking period in days
    private double rentAmountPerDay; // Rent amount per day
    // Add more attributes as needed

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFloorSize() {
        return floorSize;
    }

    public void setFloorSize(int floorSize) {
        this.floorSize = floorSize;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getMinBookingPeriod() {
        return minBookingPeriod;
    }

    public void setMinBookingPeriod(int minBookingPeriod) {
        this.minBookingPeriod = minBookingPeriod;
    }

    public int getMaxBookingPeriod() {
        return maxBookingPeriod;
    }

    public void setMaxBookingPeriod(int maxBookingPeriod) {
        this.maxBookingPeriod = maxBookingPeriod;
    }

    public double getRentAmountPerDay() {
        return rentAmountPerDay;
    }

    public void setRentAmountPerDay(double rentAmountPerDay) {
        this.rentAmountPerDay = rentAmountPerDay;
    }
}