package com.coviam.college.college;

import org.springframework.beans.factory.annotation.Autowired;

public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	ProjectRepository probj;

	@Override
	public String save(Project project) {
		probj.save(project);
		return "Data Saved " +project.toString();
	}

	@Override
	public Project get(String project) {
		Project find = probj.findOne(project);
		return find;
	}

	@Override
	public String update(Project project) {
		probj.save(project);
		return "Data Updated "+project.toString();
	}

	@Override
	public Project delete(Project project) {
		probj.delete(project);
		return project;
	}

}