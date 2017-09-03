package com.future.bbetter.exception.customize;

public class ValidateFailException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ValidateFailException(String str){
		super(str);   
    }

	@Override
	public String toString() {
		return getMessage();
	}
	
}
