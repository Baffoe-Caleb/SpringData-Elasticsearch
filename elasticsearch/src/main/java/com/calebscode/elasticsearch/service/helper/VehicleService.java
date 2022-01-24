package com.calebscode.elasticsearch.service.helper;

import com.calebscode.elasticsearch.document.Vehicle;
import com.calebscode.elasticsearch.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private final VehicleRepository repository;

    @Autowired
    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

     //method to save vehicle
    public void save(final Vehicle vehicle){
        repository.save(vehicle);
    }
    //method to run queries based on its brand
    public Vehicle findByBrand(final String brand){
        return repository.findById(brand).orElse(null);
    }
}
