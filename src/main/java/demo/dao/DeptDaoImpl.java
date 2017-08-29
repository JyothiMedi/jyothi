package demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.model.Department;
@Repository
@Transactional
public class DeptDaoImpl implements DeptDao {

	@Autowired
	private HibernateTemplate ht;

	public int addDept(Department d) {
		return (Integer) ht.save(d);
	}

	public List<Department> getDepts() {
		List<Department> li = ht.loadAll(Department.class);
		return li;

	}

	public Department getRow(int id) {
		return ht.get(Department.class, id);
	}

	public void updateRow(Department d) {
		ht.update(d);
	}

	public void deleteDept(Department d) {
		ht.delete(d);
	}

}
