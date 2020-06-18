/**
 *
 */
package com.rahul.helloservice.controller.dto;

/**
 * @author rahuldeore
 *
 */
public class Message {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(String message) {
		super();
		this.message = message;
	}	

}
