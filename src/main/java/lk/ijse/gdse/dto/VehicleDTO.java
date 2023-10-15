package lk.ijse.gdse.dto;

import lk.ijse.gdse.entity.VehicleImageEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleDTO {
    private String vehicle_id;
    private String driver_name;
    private String vehicle_brand;
    private String vehicle_category;
    private String vehicle_image;
    private String fuel_type;
    private String fuel_usage;
    private int seat_capacity;
    private String transmission;

}
