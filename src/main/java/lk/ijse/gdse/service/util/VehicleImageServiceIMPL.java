package lk.ijse.gdse.service.util;


import lk.ijse.gdse.dto.VehicleImageDTO;
import lk.ijse.gdse.repo.VehicleImageRepo;
import lk.ijse.gdse.service.VehicleImageService;
import lk.ijse.gdse.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VehicleImageServiceIMPL implements VehicleImageService {
    @Autowired
    private Converter converter;
    @Autowired
    private VehicleImageRepo vehicleImageRepo;


    @Override
    public VehicleImageDTO saveVehicleImage(VehicleImageDTO imageDTO) {
        return null;
    }

    @Override
    public VehicleImageDTO getSelectedVehicleImage(String image_id) {
        return null;
    }

    @Override
    public void updateVehicleImage(VehicleImageDTO imageDTO) {

    }

    @Override
    public void deleteVehicleImage(String image_id) {

    }
}
