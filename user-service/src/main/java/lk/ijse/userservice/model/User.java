package lk.ijse.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Chamath Dilshan
 * @created 6/17/2025 8:19 PM
 * @github https://github.com/ChamathDilshanC
 * @project Smart-Parking-Management-System-Microservice-Based-Application
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String userType; // DRIVER, OWNER //CUSTOMER
}