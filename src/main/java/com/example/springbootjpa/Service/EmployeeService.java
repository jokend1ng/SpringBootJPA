package com.example.springbootjpa.Service;






import com.example.springbootjpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmloyee(int id);
    public void deleteEmployee(int id);
    public List<Employee>findAllByName(String name);
}
