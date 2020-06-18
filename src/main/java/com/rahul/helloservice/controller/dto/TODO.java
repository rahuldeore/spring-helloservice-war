/**
 *
 */
package com.rahul.helloservice.controller.dto;

import java.util.Map;

/**
 * @author rahuldeore
 *
 */
public class TODO {
	
	Map<Integer, String> task;

	public Map<Integer, String> getTask() {
		return task;
	}

	public void setTask(Map<Integer, String> task) {
		this.task = task;
	}

	public TODO(Map<Integer, String> task) {
		super();
		this.task = task;
	}
	
	
	
}
