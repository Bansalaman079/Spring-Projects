package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.spring.model.Project;
import com.web.spring.repository.ProjectCrudRepository;
@Service
public class ProjectService {
	
	@Autowired
	private ProjectCrudRepository pcrud;
	
	static ArrayList<Project> plist=new ArrayList<>();
		
	static {
		plist.add(new Project(101,"Samsung",3));
		plist.add(new Project(102,"Fdex",5));
	}

	public List<Project> getProjects(){
		return plist;
		
	}
	
	public List<Project> getAllProj(){
		return (List<Project>) pcrud.findAll();
		
	}
	
	public void  addProject(Project proj){
		pcrud.save(proj);
		
	}
		
	public void upDateProject(Project proj) {
		Optional<Project> proj1 =pcrud.findById(proj.getId());
		proj1.get().setName(proj.getName());
		proj1.get().setDuration(proj.getDuration());
		pcrud.save(proj1.get());
	}
	
	public void deleteProject(Integer id) {
		pcrud.deleteById(id);
	}
	
}
