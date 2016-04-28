package com.rakuten.eam.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.eam.dao.EmployeeDAO;
import com.rakuten.eam.model.Employee;
import com.rakuten.eam.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	private EmployeeDAO employeeDAO;
	

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	//
	}

	@Override
	@Transactional
	public void createEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee p) {
		employeeDAO.updateEmployee(p);
	}


	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);
	}

	@Override
	@Transactional
	public List<Employee> getEmployeeByKeyword(String searchKeyword) {
		return employeeDAO.getEmployeeBySearchKeyword(searchKeyword);
	}

}
