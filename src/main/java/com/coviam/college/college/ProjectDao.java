package com.coviam.college.college;

public interface ProjectDao {
	String save(Project project);

	Project get(String project);

	String update(Project project);

	Project delete(Project project);

}