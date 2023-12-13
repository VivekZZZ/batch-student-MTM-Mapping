package org.jsp.studentbatch.exception;

public class StudentAlreadyPresentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StudentAlreadyPresentException(String message) {
		super(message);
	}

}
