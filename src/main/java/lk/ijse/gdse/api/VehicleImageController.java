package lk.ijse.gdse.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.dto.VehicleDTO;
import lk.ijse.gdse.dto.VehicleImageDTO;
import lk.ijse.gdse.service.VehicleImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/vehicleImage")
public class VehicleImageController {
    private final VehicleImageService vehicleImageService;

    public VehicleImageController(VehicleImageService vehicleImageService) {
        this.vehicleImageService = vehicleImageService;

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    VehicleImageDTO saveVehicleImage(@Valid @RequestBody VehicleImageDTO imageDTO, Errors errors){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<VehicleImageDTO> getVehicle(@Valid @PathVariable String image_id){
        return null;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping()
    void deleteVehicleImage(@Valid @PathVariable String image_id,@RequestBody VehicleImageDTO imageDTO,Errors errors){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void updateVehicleImage(@Valid @PathVariable String image_id,@RequestBody VehicleImageDTO imageDTO,Errors errors){

    }
}
