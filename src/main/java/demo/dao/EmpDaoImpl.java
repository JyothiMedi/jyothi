package demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.model.Employee;

@Repository
@Transactional
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private HibernateTemplate ht;

	public int addEmployee(Employee e) {
		return (Integer) ht.save(e);
	}

	public List<Employee> getEmps() {
		List<Employee> list = ht.loadAll(Employee.class);
		return list;
	}

	public Employee getRow(int id) {
		return ht.get(Employee.class, id);
	}

	public void updateRow(Employee e) {
		System.out.println("hiii--"+e.getEid());
		ht.update(e);
		System.out.println(e);

	}

	public void deleteEmp(Employee emp) {
		ht.delete(emp);
	}

}
