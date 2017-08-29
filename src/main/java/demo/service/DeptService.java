package demo.service;

import java.util.List;

import demo.model.Department;

public interface DeptService {

	public int addDept(Department e);

	public List<Department> getDepts();

	public Department getRow(int id);

	public void updateRow(Department d);

	public void deleteDept(Department d);

}
