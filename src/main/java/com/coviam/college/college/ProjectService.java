package com.coviam.college.college;

public interface ProjectService {
	Project save(Project project);

	Project get(String name);

	Project update(Project project);

	String delete(Project project);

}