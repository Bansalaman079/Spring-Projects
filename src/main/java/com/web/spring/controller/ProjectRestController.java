package com.web.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.web.spring.model.Project;
import com.web.spring.service.ProjectService;
@RestController
@RequestMapping("dbservice")
public class ProjectRestController {
	@Autowired
	private ProjectService projDao;
	@RequestMapping(value="greet",method=RequestMethod.GET,produces="text/plain")
	public String greet() {
		return "Welcome to Project Api....";
	}
@RequestMapping(value="getprojlist",method=RequestMethod.GET,produces={"application/json","application/xml"})
public List<Project> getProjects() {
return projDao.getProjects();
}

@RequestMapping(value="getproj",method=RequestMethod.GET,produces={"application/json","application/xml"})
public List<Project> getAllProjects() {
return projDao.getAllProj();
}

@RequestMapping(value="addproj",method=RequestMethod.POST,
produces="application/json",consumes="application/json")
public List<Project> addProject(@RequestBody Project proj) throws Exception{
	projDao.addProject(proj);
	return projDao.getAllProj();

}

@RequestMapping(value="updateproj",method=RequestMethod.PUT,
produces="application/json",consumes="application/json")
public List<Project> upDateProject(@RequestBody Project proj) throws Exception{
	projDao.upDateProject(proj);
	return projDao.getAllProj();

}
@RequestMapping(value="delproj/{id}",method=RequestMethod.DELETE,produces="text/plian")
public String deleteProject(@PathVariable("id") Integer id) {
	projDao.deleteProject(id);
	return "Project Deleted..";
}



}
