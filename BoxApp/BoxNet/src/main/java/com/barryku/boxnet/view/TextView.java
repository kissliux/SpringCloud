package com.barryku.boxnet.view;

public class TextView{
	private String message;
	
	public String display() {
		return "*****  " + message + "  *****";
	}
	
	public void setMessage(String msg) {
		message = msg;
	}

}
