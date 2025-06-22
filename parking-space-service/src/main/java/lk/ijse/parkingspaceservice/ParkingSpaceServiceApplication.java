package lk.ijse.parkingspaceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Chamath Dilshan
 * @created 6/18/2025
 * @github https://github.com/ChamathDilshanC
 * @project Smart-Parking-Management-System-Microservice-Based-Application
 */

@SpringBootApplication
@EnableEurekaClient
public class ParkingSpaceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ParkingSpaceServiceApplication.class, args);
    }
}