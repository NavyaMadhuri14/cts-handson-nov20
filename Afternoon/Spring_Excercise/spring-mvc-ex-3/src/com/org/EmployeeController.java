package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByNameNormal", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInNoramlOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInNormalOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByIdDesc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesIdInDescOrder());
		return mav;
	}
    @RequestMapping(value = "/sortByIdAsc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesIdInAscOrder());
		return mav;
	}
	@RequestMapping(value = "/sortBySalAsc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesSalInAscOrder());
		return mav;
	}
	@RequestMapping(value = "/sortBySalDesc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesSalInDescOrder());
		return mav;
	}

}

