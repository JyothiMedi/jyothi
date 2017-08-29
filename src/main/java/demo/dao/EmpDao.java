package demo.dao;

import java.util.List;

import demo.model.Employee;

public interface EmpDao {

	// for adding Employee
	public int addEmployee(Employee e);

	// to get all employee records
	public List<Employee> getEmps();

	public Employee getRow(int id);

	public void updateRow(Employee e);

	public void deleteEmp(Employee emp);


}
