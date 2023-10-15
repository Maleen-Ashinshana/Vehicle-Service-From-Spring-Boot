package lk.ijse.gdse.service.util;


import lk.ijse.gdse.dto.VehicleImageDTO;
import lk.ijse.gdse.entity.VehicleEntity;
import lk.ijse.gdse.entity.VehicleImageEntity;
import lk.ijse.gdse.repo.VehicleImageRepo;
import lk.ijse.gdse.repo.VehicleRepo;
import lk.ijse.gdse.service.VehicleImageService;
import lk.ijse.gdse.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleImageServiceIMPL implements VehicleImageService {

    private final Converter converter;

    private final VehicleImageRepo vehicleImageRepo;
    private  final VehicleRepo vehicleRepo;


    @Override
    public VehicleImageDTO saveVehicleImage(String vehicle_id,VehicleImageDTO imageDTO) {
        VehicleEntity vehicleEntity = vehicleRepo.findById(vehicle_id).orElseThrow();
        VehicleImageEntity imageEntity= converter.toVehicleImageEntity(imageDTO);
        imageEntity.setVehicle(vehicleEntity);
        VehicleImageDTO vehicleImageDTO = converter.toVehicleImageDTO(vehicleImageRepo.save(imageEntity));
        System.out.println(vehicleImageDTO);
        return vehicleImageDTO;
    }

    @Override
    public VehicleImageDTO getSelectedVehicleImage(String image_id) {
        VehicleImageEntity vehicleImageEntity = vehicleImageRepo.findById(image_id).orElseThrow();
        VehicleImageDTO vehicleImageDTO = converter.toVehicleImageDTO(vehicleImageEntity);
        vehicleImageDTO.setVehicle_id(vehicleImageEntity.getVehicle().getVehicle_id());
        return vehicleImageDTO;
    }

    @Override
    public void updateVehicleImage(VehicleImageDTO imageDTO) {
        Optional<VehicleImageEntity> imageEntity=vehicleImageRepo.findById(imageDTO.getImage_id());
        if (!imageEntity.isPresent()){
            imageEntity.get().setVehicle_image(imageDTO.getVehicle_image());
        }

    }

    @Override
    public void deleteVehicleImage(String image_id) {
        vehicleImageRepo.deleteById(image_id);

    }
}
