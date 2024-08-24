package Employee.CRUD.service;

import Employee.CRUD.entity.EmployeeEntity;
import Employee.CRUD.exception.EmployeeNotFoundException;
import Employee.CRUD.exception.testException;
import Employee.CRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImplement(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeById(Integer id) {
        Optional<EmployeeEntity> optionalEmployeeEntity = employeeRepository.findById(Long.valueOf(id));
        if(optionalEmployeeEntity.isPresent()){
            return optionalEmployeeEntity.get();
        }
        throw  new EmployeeNotFoundException();

    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity saveEmployee = employeeRepository.save(employeeEntity);
        return saveEmployee;
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
       EmployeeEntity updateEmployee = employeeRepository.save(employeeEntity);
       return updateEmployee;
    }
    @Override
    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(Long.valueOf(id));
        throw  new testException();
    }
}
