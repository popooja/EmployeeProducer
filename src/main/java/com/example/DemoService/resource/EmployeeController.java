package com.example.DemoService.resource;

import com.example.DemoService.model.EmployeeDoc;
import com.example.DemoService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }
    @GetMapping
    public Flux<EmployeeDoc> getAllEmployee() {
        return empService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Mono<EmployeeDoc> getEmployee(@PathVariable String id) {
        return empService.getEmployee(id);
    }

    @PostMapping
    public Mono<EmployeeDoc> addEmployee(@RequestBody EmployeeDoc employee) {
        return empService.addEmployee(employee);
    }

    @PutMapping
    public Mono<EmployeeDoc> updateEmployee(@RequestBody EmployeeDoc employee) {
        return empService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteEmployee(@PathVariable String id) {
        return empService.deleteEmployee(id);

    }
}
