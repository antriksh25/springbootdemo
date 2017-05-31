package com.coviam.college.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectservice;

	@RequestMapping(value = "/save/{name}/{course}/{evaluation_done_by}/{submitted_by}/{credits}", method = RequestMethod.GET)
	public String save(@PathVariable("name") String name, @PathVariable("course") String course,
			@PathVariable("evaluation_done_by") String evaluation_done_by,
			@PathVariable("submitted_by") String submitted_by, @PathVariable("credits") String credits) {
		Project newObj = new Project();
		newObj.saveName(name);
		newObj.saveCourse(course);
		newObj.saveEvaluation_done_by(evaluation_done_by);
		newObj.saveSubmitted_by(submitted_by);
		newObj.saveCredits(credits);

		projectservice.save(newObj);
		return "Saved :" + newObj.toString();
	}

	@RequestMapping(value = "/update/{name}/{course}/{evaluation_done_by}/{submitted_by}/{credits}", method = RequestMethod.GET)
	public String update(@PathVariable("name") String name, @PathVariable("course") String course,
			@PathVariable("evaluation_done_by") String evaluation_done_by,
			@PathVariable("submitted_by") String submitted_by, @PathVariable("credits") String credits) {
		Project newObj = new Project();
		newObj.saveName(name);
		newObj.saveCourse(course);
		newObj.saveEvaluation_done_by(evaluation_done_by);
		newObj.saveSubmitted_by(submitted_by);
		newObj.saveCredits(credits);

		projectservice.update(newObj);
		return "Updated :" + newObj.toString();
	}

	@RequestMapping(value = "/delete/{name}", method = RequestMethod.GET)
	public String delete(@PathVariable("name") String name){ 
		Project newObj;
		newObj = projectservice.get(name);
	projectservice.delete(newObj);
		return "deleted :" + newObj.toString() ;
	}

	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
	public String get(@PathVariable("name") String name) {

		Project obj = projectservice.get(name);
		return "Got :" + obj.toString();
	}
}
