package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.DeptDao;
import demo.model.Department;
@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;
	
	public int addDept(Department d) {
		return dao.addDept(d);
	}

	public List<Department> getDepts() {
		List<Department> li=dao.getDepts();
		return li;
	}

	public Department getRow(int id) {
		return  dao.getRow(id);
	}

	public void updateRow(Department d) {
		dao.updateRow(d);
	}

	public void deleteDept(Department d) {
		dao.deleteDept(d);
	}

}
