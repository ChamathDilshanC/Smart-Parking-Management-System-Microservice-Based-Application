package lk.ijse.vehicleservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Chamath Dilshan
 * @created 6/17/2025 11:08 PM
 * @github https://github.com/ChamathDilshanC
 * @project Smart-Parking-Management-System-Microservice-Based-Application
 */

@Data                    // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor       // Generates default constructor
@AllArgsConstructor      // Generates constructor with all fields
public class Vehicle {
    private String vehicleId;
    private String userId;
    private String licensePlate;
    private String vehicleType; // CAR, MOTORCYCLE, VAN
    private String brand;
    private String model;
    private String color;
    private String status; // ACTIVE, INACTIVE, PARKED

    // Custom constructor for your specific use case
    public Vehicle(String vehicleId, String userId, String licensePlate,
                   String vehicleType, String brand, String model, String color) {
        this.vehicleId = vehicleId;
        this.userId = userId;
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.status = "ACTIVE";
    }
}