package lk.ijse.gdse.service;

import lk.ijse.gdse.dto.VehicleImageDTO;

public interface VehicleImageService {
    VehicleImageDTO saveVehicleImage(String vehicle_id,VehicleImageDTO imageDTO);
    VehicleImageDTO getSelectedVehicleImage(String image_id);
    void updateVehicleImage(String image_id,VehicleImageDTO imageDTO);
    void deleteVehicleImage(String image_id);
}
