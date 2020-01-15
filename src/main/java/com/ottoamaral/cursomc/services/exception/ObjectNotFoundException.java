package com.ottoamaral.cursomc.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 480624253250369366L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
