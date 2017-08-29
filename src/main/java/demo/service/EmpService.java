package demo.service;

import java.util.List;

import demo.model.Employee;

public interface EmpService {

	// for adding Employee
	public int addEmployee(Employee e);

	// to get all employee records
	public List<Employee> getEmps();

	// to get the existed record based on id
	public Employee getRow(int eid);

	// to update record
	public void updateRow(Employee e);

	public void deleteEmp(Employee emp);

}
