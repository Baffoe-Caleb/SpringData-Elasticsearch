package com.calebscode.elasticsearch.controller;


import com.calebscode.elasticsearch.document.Vehicle;
import com.calebscode.elasticsearch.service.helper.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    private final VehicleService service;

    @Autowired
    public VehicleController(VehicleService service){
        this.service = service;
    }

    //Endpoints for saving vehicles and for quering it

    @PostMapping
    public void save(@RequestBody final Vehicle vehicle){
        service.save(vehicle);
    }

    @GetMapping("/{brand}")
    public Vehicle findById(@PathVariable final String brand){
        return service.findByBrand(brand);
    }
}
