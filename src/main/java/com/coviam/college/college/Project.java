package com.coviam.college.college;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Projects")
public class Project implements Serializable {

	@Id
	@Column(name = "project_name")
	private String name;
	@Column(name = "course")
	private String course;
	@Column(name = "evaluated_by")
	private String evaluation_done_by;
	@Column(name = "submission_by")
	private String submitted_by;
	@Column(name = "credits")
	private String credits;

	public String getCredits() {
		return credits;
	}

	public void saveCredits(String credits) {
		this.credits = credits;
	}
	

	@Override
	public String toString() {
		return "Project [name=" + name + ", course=" + course + ", evaluation_done_by=" + evaluation_done_by
				+ ", submitted_by=" + submitted_by + ", credits=" + credits + "]";
	}

	public String getName() {
		return name;
	}

	public void saveName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void saveCourse(String course) {
		this.course = course;
	}

	public String getEvaluation_done_by() {
		return evaluation_done_by;
	}

	public void saveEvaluation_done_by(String evaluation_done_by) {
		this.evaluation_done_by = evaluation_done_by;
	}

	public String getSubmitted_by() {
		return submitted_by;
	}

	public void saveSubmitted_by(String submitted_by) {
		this.submitted_by = submitted_by;
	}
}
