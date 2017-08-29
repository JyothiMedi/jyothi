package demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TESTEMP")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "eid")
	private int eid;

	@Column(name = "ename")
	private String ename;

	@Column(name = "salary")
	private float salary;

	//@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	/*private Department department;

	public Department getdepartment() {
		return department;
	}

	public void setdepartment(Department department) {
		this.department = department;
	}*/

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

}
