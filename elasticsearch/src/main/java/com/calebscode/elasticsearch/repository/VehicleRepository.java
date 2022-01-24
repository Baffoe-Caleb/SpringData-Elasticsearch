package com.calebscode.elasticsearch.repository;


import com.calebscode.elasticsearch.document.Vehicle;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface VehicleRepository extends ElasticsearchRepository<Vehicle, String> {
}
