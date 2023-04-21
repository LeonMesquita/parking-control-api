package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
    
    @Autowired
    private ParkingSpotRepository repository;

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return repository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return repository.findByLicensePlateCar(licensePlateCar) != null;
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return repository.findByParkingSpotNumber(parkingSpotNumber) != null;
    }

    public boolean existsByApartment(String apartment) {
        return repository.findByApartment(apartment) != null;
    }

    public List<ParkingSpotModel> findAll() {
        return repository.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return repository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        repository.delete(parkingSpotModel);
    }


}
