package com.midhun.employee.dal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midhun.employee.dal.entities.Employee;
import com.midhun.employee.dal.repos.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee editEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		repo.deleteById(id);	
	}

	@Override
	public int countEmployee() {
		// TODO Auto-generated method stub
		return (int) repo.count();
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public EmployeeRepository getRepo() {
		return repo;
	}

	public void setRepo(EmployeeRepository repo) {
		this.repo = repo;
	}

}
