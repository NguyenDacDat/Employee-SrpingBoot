package Employee.CRUD.controller;

import Employee.CRUD.entity.EmployeeEntity;
import Employee.CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<EmployeeEntity>>getAllEmployees(){

        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity>getEmployeeById(@PathVariable Integer id){
        return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }
    @PostMapping("/")
    public ResponseEntity<EmployeeEntity>saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return ResponseEntity.ok().body(employeeService.saveEmployee(employeeEntity));
    }
    @PutMapping("/updateEmployee")
    public ResponseEntity<EmployeeEntity>updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return ResponseEntity.ok().body(employeeService.updateEmployee(employeeEntity));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteEmployeeById(@PathVariable Integer id){
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok().body("Delete Employee successfully!");
    }

}
