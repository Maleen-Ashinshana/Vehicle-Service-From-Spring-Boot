package lk.ijse.gdse.util;


import lk.ijse.gdse.dto.VehicleDTO;
import lk.ijse.gdse.dto.VehicleImageDTO;
import lk.ijse.gdse.entity.VehicleEntity;
import lk.ijse.gdse.entity.VehicleImageEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Converter {
    private final ModelMapper modelMapper;

    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public VehicleEntity toVehicleEntity(VehicleDTO vehicleDTO){
        return modelMapper.map(vehicleDTO, VehicleEntity.class);
    }
    public  VehicleDTO toVehicleDTO(VehicleEntity  vehicleEntity){
        return modelMapper.map(vehicleEntity, VehicleDTO.class);
    }
    public VehicleImageEntity toVehicleImageEntity(VehicleImageDTO vehicleImageDTO){


        VehicleImageEntity map = modelMapper.map(vehicleImageDTO, VehicleImageEntity.class);
    map.setVehicle_image(Base64.getEncoder().encodeToString(vehicleImageDTO.getVehicle_image()));
    return map;

    }
    public  VehicleImageDTO toVehicleImageDTO(VehicleImageEntity  vehicleImageEntity){

        return modelMapper.map(vehicleImageEntity, VehicleImageDTO.class);
    }
}
