package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.model.Employee;
import demo.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;

	@RequestMapping("/home2")
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/addEmp")
	public ModelAndView add() {
		System.out.println("Hellooo");
		return new ModelAndView("addEmp");
	}

	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee e, ModelMap m) {
		System.out.println(e.getEid());
		System.out.println(e.getEname());

		int a = empService.addEmployee(e);
		m.addAttribute("data", a);
		return "success";
	}

	@RequestMapping(value = "/listEmp", method = RequestMethod.GET)
	public ModelAndView getting(ModelMap m) {
		System.out.println("helloo");
		List<Employee> list = empService.getEmps();
		m.addAttribute("employee", list);
		return new ModelAndView("empList");
	}

	@RequestMapping(value = "/editEmp")
	public ModelAndView editUser(@RequestParam("id") int eid) {
		/* Employee emp = empService.getRow(eid); */
		return new ModelAndView("editEmp", "eid", eid);
	}

	@RequestMapping(value = "/updateEmp")
	public ModelAndView updateUser(@ModelAttribute Employee employee) {
		System.out.println("helllllllloooo");
		/*Employee e=new Employee();
		e.setEid(employee.getEid());
		e.setEname(employee.getEname());
		e.setSalary(employee.getSalary());*/
		System.out.println(employee);
		empService.updateRow(employee);
		//empService.updateRow(e);
		return new ModelAndView("redirect:listEmp");
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@RequestParam("id") int empid, ModelMap map) {
		Employee emp = new Employee();
		emp.setEid(empid);
		empService.deleteEmp(emp);
		return new ModelAndView("redirect:listEmp");
	}

}
