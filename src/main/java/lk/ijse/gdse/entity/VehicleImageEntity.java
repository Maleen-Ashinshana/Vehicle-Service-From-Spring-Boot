package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vehicleImage")
public class VehicleImageEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicle_image_id;
    @Column(nullable = false,columnDefinition = "LongText")
    @Lob
    private String vehicle_image_name;

    @ManyToOne
    @JoinColumn(name = "vehicle_id",referencedColumnName = "vehicle_id")
    private VehicleEntity vehicle;

    public VehicleImageEntity(int vehicle_image_id, String vehicle_image_name) {
        this.vehicle_image_id = vehicle_image_id;
        this.vehicle_image_name = vehicle_image_name;
    }
}
