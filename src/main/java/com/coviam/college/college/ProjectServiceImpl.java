package com.coviam.college.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectRepository labObj;
	@Override
	public Project save(Project project) {
		// TODO Auto-generated method stub
		labObj.save(project);
		return project;
	}

	@Override
	public Project get(String name) {
		// TODO Auto-generated method stub
		Project find=labObj.findOne(name);
		return find;
	}

	@Override
	public Project update(Project lab) {
		// TODO Auto-generated method stub
		
		return labObj.save(lab);
	}

	@Override
	public String delete(Project lab) {
		// TODO Auto-generated method stub
		labObj.delete(lab);
		return "Deleted";
	}

}
