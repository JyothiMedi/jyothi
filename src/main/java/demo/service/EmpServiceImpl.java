package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.EmpDao;
import demo.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;

	public int addEmployee(Employee e) {

		return empDao.addEmployee(e);
	}

	public List<Employee> getEmps() {

		List<Employee> list = empDao.getEmps();
		return list;
	}

	public Employee getRow(int e) {
		System.out.println("jyothi");
		return empDao.getRow(e);
	}

	public void updateRow(Employee e) {
		System.out.println("jyoooooooooooooo");
		empDao.updateRow(e);
	}

	public void deleteEmp(Employee emp) {
		empDao.deleteEmp(emp);
	}
}
