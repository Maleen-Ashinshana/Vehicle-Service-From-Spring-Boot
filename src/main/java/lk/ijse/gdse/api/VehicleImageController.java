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

import java.util.Base64;

@RestController
@RequestMapping("/api/v1/vehicleImage")
@CrossOrigin("*")
public class VehicleImageController {
    private final VehicleImageService vehicleImageService;

    public VehicleImageController(VehicleImageService vehicleImageService) {
        this.vehicleImageService = vehicleImageService;

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/{vehicle_id}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveVehicleImage(

            @RequestPart byte[] vehicle_image,
            @PathVariable String vehicle_id){

        String VImag= Base64.getEncoder().encodeToString(vehicle_image);

        VehicleImageDTO vehicleImageDTO=new VehicleImageDTO();
        vehicleImageDTO.setVehicle_image(VImag);

        System.out.println(vehicle_id+"vehicleId");
        return vehicleImageService.saveVehicleImage(vehicle_id,vehicleImageDTO).getVehicle_id();
    }
    @GetMapping(value = "/{image_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<VehicleImageDTO> getVehicle(@Valid @PathVariable String image_id){
        VehicleImageDTO selectedVehicleImage = vehicleImageService.getSelectedVehicleImage(image_id);

        return new ResponseEntity<>(selectedVehicleImage,HttpStatus.OK);
    }

    @DeleteMapping("/{image_id}")
    void deleteVehicleImage( @PathVariable String image_id){
     vehicleImageService.deleteVehicleImage(image_id);
    }

    @PatchMapping("/{image_id}")
    public String updateVehicleImage(
            @RequestPart byte[] vehicle_image,
            @PathVariable String image_id
    ){
        String VImag= Base64.getEncoder().encodeToString(vehicle_image);

        VehicleImageDTO vehicleImageDTO=new VehicleImageDTO();
        vehicleImageDTO.setVehicle_image(VImag);

        vehicleImageService.updateVehicleImage(image_id,vehicleImageDTO);
        return String.valueOf(new ResponseEntity<>(HttpStatus.OK));

    }
}
