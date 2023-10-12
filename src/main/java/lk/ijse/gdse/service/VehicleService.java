package lk.ijse.gdse.service;

import lk.ijse.gdse.dto.VehicleDTO;

public interface VehicleService {
    VehicleDTO saveVehicle(VehicleDTO vehicleDTO);
    VehicleDTO getSelectedVehicle(String vehicle_id);
    void updateVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String vehicle_id);
}
