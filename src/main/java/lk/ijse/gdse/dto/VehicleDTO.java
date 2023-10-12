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
    private String vehicle_brand;
    private String vehicle_category;
    private String vehicle_image;
    private String fuel_type;
    private String fuel_usage;
    private int seat_capacity;
    private String transmission;

    private List<VehicleImageEntity> vehicle_image_id;

    public VehicleDTO(String vehicle_id, String vehicle_brand, String vehicle_category, String vehicle_image, String fuel_type, String fuel_usage, int seat_capacity, String transmission) {
        this.vehicle_id = vehicle_id;
        this.vehicle_brand = vehicle_brand;
        this.vehicle_category = vehicle_category;
        this.vehicle_image = vehicle_image;
        this.fuel_type = fuel_type;
        this.fuel_usage = fuel_usage;
        this.seat_capacity = seat_capacity;
        this.transmission = transmission;
    }
}
