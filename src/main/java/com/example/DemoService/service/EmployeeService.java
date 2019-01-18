package com.example.DemoService.service;

import com.example.DemoService.model.EmployeeDoc;
import com.example.DemoService.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

    private EmployeeRepository empRepository;

    public EmployeeService(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }

    public Flux<EmployeeDoc> getAllEmployee() {
        return empRepository.findAll();
    }

    public Mono<EmployeeDoc> getEmployee(String id) {
        return empRepository.findById(id);

    }

    public Mono<EmployeeDoc> addEmployee(EmployeeDoc employee) {
        return empRepository.insert(employee);

    }

    public Mono<EmployeeDoc> updateEmployee(EmployeeDoc employee) {
        return empRepository.save(employee);
    }

    public Mono<Void> deleteEmployee(String id) {
       return  empRepository.deleteById(id);

    }
}
