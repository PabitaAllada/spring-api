package io.projects.api.service;

import java.util.List;

import io.projects.api.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findOne(String id);

	public Employee create(Employee emp);

	public Employee update(String id, Employee emp);

	public void delete(String id);
}
