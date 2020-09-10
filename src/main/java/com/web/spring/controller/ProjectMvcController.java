	package com.web.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.spring.model.Project;
@Controller
@RequestMapping("webapp")
public class ProjectMvcController {
	@RequestMapping(value="/greet")
	public ModelAndView hello(){
		return new ModelAndView("greeting", "msg", "WElcome to Spring MVC Using Boot");
		}
	
	@RequestMapping(value="/project")
	public ModelAndView project() {
		return new ModelAndView("projectinput","command",new Project());
	}

	@RequestMapping(value="/addproject", method=RequestMethod.POST)
	public ModelAndView addProject(Project proj,ModelAndView model) {
		model.addObject("id", proj.getId());
		model.addObject("name", proj.getName());
		model.addObject("duration", proj.getDuration());
		model.setViewName("projectinfo");
		return  model;
	}
	
}
