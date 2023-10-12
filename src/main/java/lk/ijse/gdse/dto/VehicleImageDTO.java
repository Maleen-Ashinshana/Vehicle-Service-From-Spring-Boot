package lk.ijse.gdse.dto;


import lk.ijse.gdse.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleImageDTO {

    private String vehicle_image_id;

    private String vehicle_image_name;

    private VehicleEntity vehicleEntity;

    public VehicleImageDTO(String vehicle_image_id, String vehicle_image_name) {
        this.vehicle_image_id = vehicle_image_id;
        this.vehicle_image_name = vehicle_image_name;
    }
}
