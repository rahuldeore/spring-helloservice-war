/**
 *
 */
package com.rahul.helloservice.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.helloservice.controller.dto.Message;

/**
 * @author rahuldeore
 *
 */
@RestController
public class HelloServiceController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public Message hello() {
		return new Message("Hello from Rahul !");
	}
	
	@GetMapping("/todo")
	public Map<Integer, String> todo() {
		Map<Integer, String> todoList = new HashMap<Integer, String>();
		todoList.put(1, "Work on Spring 5 Application");
		todoList.put(2, "Plan for OCI Certification Exam Prep");
		return todoList;
	}
	
	@GetMapping("/todolist")
	public List<String> todoList() {
		return new LinkedList<String>(Arrays.asList("Work on Spring 5 Application","Plan for OCI Certification Exam Prep"));
	}

}
