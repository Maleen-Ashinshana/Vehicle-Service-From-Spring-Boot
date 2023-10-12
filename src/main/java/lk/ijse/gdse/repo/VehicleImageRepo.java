package lk.ijse.gdse.repo;

import lk.ijse.gdse.entity.VehicleImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleImageRepo extends JpaRepository<VehicleImageEntity,String> {
  /*  VehicleImageEntity save(VehicleImageEntity imageEntity);
    VehicleImageEntity getVehicleImageEntityByVehicle_image_id(String image_id);
    void deleteByVehicle_image_id(String image_id);*/

}
