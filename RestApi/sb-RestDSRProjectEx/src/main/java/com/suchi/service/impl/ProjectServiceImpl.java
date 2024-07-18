package com.suchi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchi.Entity.ProjectEntity;
import com.suchi.model.Project;
import com.suchi.repo.ProjectRepository;
import com.suchi.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository daoImpl;

	@Override
	public Project saveProject(Project p) {
		// TODO Auto-generated method stub
		ProjectEntity proEn=new ProjectEntity();
		BeanUtils.copyProperties(p, proEn);
		ProjectEntity pro = daoImpl.save(proEn);
		//Copy Entity object to Product Object
		Project pr=new Project();
		BeanUtils.copyProperties(pro, pr);
		return pr;
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		List<ProjectEntity> findAllProjects = daoImpl.findAll();
		List<Project> addProjects=new ArrayList<Project>();
		findAllProjects.forEach(p->
		{
			Project pro=new Project();
			BeanUtils.copyProperties(p, pro);
			addProjects.add(pro);
		}
				);
		return addProjects;
	}
	}
	
	

