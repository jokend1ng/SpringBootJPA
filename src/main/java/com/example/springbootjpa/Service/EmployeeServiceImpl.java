package com.example.springbootjpa.Service;



import com.example.springbootjpa.dao.EmployeeRepository;
import com.example.springbootjpa.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmloyee(int id) {
        Employee employee =null;
        Optional<Employee>optional=employeeRepository.findById(id);
        if(optional.isPresent()){
            employee =optional.get();
    }
        return employee;
    }


    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
