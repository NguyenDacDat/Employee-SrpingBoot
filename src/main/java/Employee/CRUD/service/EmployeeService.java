package Employee.CRUD.service;

import Employee.CRUD.entity.EmployeeEntity;
import Employee.CRUD.repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService {
    List <EmployeeEntity> getAllEmployees();
    EmployeeEntity getEmployeeById(Integer id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployeeById(Integer id);
}
