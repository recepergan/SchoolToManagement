package com.bilgeadam.recepergan.app.util;

import java.io.Serializable;

public class ExceptionMustNotMarried extends Exception implements Serializable {
	
	private static final long serialVersionUID = -7346267423418882961L;

	public ExceptionMustNotMarried(String message) {
		super(message);
		
	}
	
	
}
