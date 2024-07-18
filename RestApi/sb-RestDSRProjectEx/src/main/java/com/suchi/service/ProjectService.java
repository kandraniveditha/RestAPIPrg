package com.suchi.service;

import java.util.List;

import com.suchi.model.Project;

public interface ProjectService {

public Project saveProject(Project p);
	
	public List<Project> getAllProjects();
}
