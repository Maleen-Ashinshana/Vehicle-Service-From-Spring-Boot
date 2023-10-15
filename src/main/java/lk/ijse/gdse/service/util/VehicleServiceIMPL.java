package lk.ijse.gdse.service.util;


import lk.ijse.gdse.dto.VehicleDTO;
import lk.ijse.gdse.entity.VehicleEntity;
import lk.ijse.gdse.repo.VehicleRepo;
import lk.ijse.gdse.service.VehicleService;
import lk.ijse.gdse.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleServiceIMPL implements VehicleService {

    private final Converter convert;

    private final VehicleRepo vehicleRepo;
    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {
        return convert.toVehicleDTO(vehicleRepo.save(convert.toVehicleEntity(vehicleDTO)));
    }

    @Override
    public VehicleDTO getSelectedVehicle(String vehicle_id) {
        return convert.toVehicleDTO(vehicleRepo.findById(vehicle_id).get());
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        Optional<VehicleEntity> vehicleEntity=vehicleRepo.findById(vehicleDTO.getVehicle_id());
        if (vehicleEntity.isPresent()){
            vehicleEntity.get().setDriver_name(vehicleDTO.getDriver_name());
            vehicleEntity.get().setVehicle_brand(vehicleDTO.getVehicle_brand());
            vehicleEntity.get().setVehicle_category(vehicleDTO.getVehicle_category());
            vehicleEntity.get().setFuel_type(vehicleDTO.getFuel_type());
            vehicleEntity.get().setFuel_usage(vehicleDTO.getFuel_usage());
            vehicleEntity.get().setSeat_capacity(vehicleDTO.getSeat_capacity());
            vehicleEntity.get().setTransmission(vehicleDTO.getTransmission());
        }

    }

    @Override
    public void deleteVehicle(String vehicle_id) {
      vehicleRepo.deleteById(vehicle_id);
    }
}
