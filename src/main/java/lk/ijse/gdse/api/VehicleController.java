package lk.ijse.gdse.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.dto.VehicleDTO;
import lk.ijse.gdse.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    VehicleDTO saveVehicle(@Valid @RequestBody VehicleDTO vehicleDTO, Errors errors){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<VehicleDTO> getVehicle(@Valid @PathVariable String vehicle_id){
        return null;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping()
    void deleteVehicle(@Valid @PathVariable String vehicle_id,@RequestBody VehicleDTO vehicleDTO,Errors errors){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void updateVehicle(@Valid @PathVariable String vehicle_id,@RequestBody VehicleDTO vehicleDTO,Errors errors){

    }
}
