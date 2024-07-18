package com.suchi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.model.Project;
import com.suchi.service.impl.ProjectServiceImpl;

@RestController
@RequestMapping("/restapi/projects")
public class ProjectController {
	@Autowired
	private ProjectServiceImpl serviceImpl;
	
	@PostMapping("/addPro")
	public ResponseEntity<String> saveProject(@RequestBody  Project project)
	{
		Project saveProject = serviceImpl.saveProject(project);
		String msg="";
		if(saveProject!=null)
		{
			msg="Data Inserted Successfully";
		}
		else
		{
			msg="Data Not Insetred Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);

	}
	@GetMapping("/fetchPro")
	public List<Project> getAllProjects()
	{
		return serviceImpl.getAllProjects();
	}
	

	
}
