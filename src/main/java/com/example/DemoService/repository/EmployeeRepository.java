package com.example.DemoService.repository;

import com.example.DemoService.model.EmployeeDoc;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<EmployeeDoc,String> {

}
