package lk.ijse.gdse.service;

import lk.ijse.gdse.dto.VehicleImageDTO;

public interface VehicleImageService {
    VehicleImageDTO saveVehicleImage(VehicleImageDTO imageDTO);
    VehicleImageDTO getSelectedVehicleImage(String image_id);
    void updateVehicleImage(VehicleImageDTO imageDTO);
    void deleteVehicleImage(String image_id);
}
