package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.model.Department;
import demo.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping("/home1")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/addDept")
	public String addDept() {
		return "addDept";
	}

	@RequestMapping(value = "/saveDept", method = RequestMethod.POST)
	public String saveDept(@ModelAttribute("department") Department department, Model m) {
		int a = deptService.addDept(department);
		m.addAttribute("dd", a);
		return "success1";

	}

	@RequestMapping(value = "/deptList", method = RequestMethod.GET)
	public ModelAndView getting(ModelMap m) {
		System.out.println("helloo");
		List<Department> list = deptService.getDepts();
		m.addAttribute("department", list);
		return new ModelAndView("deptList");
	}

	@RequestMapping(value = "/editDept")
	public String editDept(@RequestParam("dept_id") int dept_id) {
		return "editDept";
	}

	@RequestMapping(value = "/updateDept")
	public ModelAndView updateDept(@ModelAttribute Department department) {
		System.out.println("helllllllloooo");
		deptService.updateRow(department);
		return new ModelAndView("redirect:deptList");
	}

	@RequestMapping(value = "/deleteDept", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@RequestParam("dept_id") int dept_id, ModelMap map) {
		Department d = new Department();
		d.setDept_id(dept_id);
		deptService.deleteDept(d);
		return new ModelAndView("redirect:deptList");
	}

}
