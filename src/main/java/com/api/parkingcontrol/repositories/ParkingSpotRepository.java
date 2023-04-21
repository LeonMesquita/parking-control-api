package com.api.parkingcontrol.repositories;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.parkingcontrol.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
    
    boolean existsByLicensePlateCar(String licensePlateCar);

    ParkingSpotModel findByLicensePlateCar(String licensePlateCar);

    ParkingSpotModel findByParkingSpotNumber(String parkingSpotNumber);
    
    ParkingSpotModel findByApartment(String apartment);

}
