package demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "testdept")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "dept_id")
	private int dept_id;

	@Column(name = "dname")
	private String dname;

	//@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	/*private Set<Employee> emps;
	
	public Set<Employee> getEmps() {
		return emps;
	}

	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}*/

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [id=" + ", dept_id=" + dept_id + ", dname=" + dname + "]";
	}

}
