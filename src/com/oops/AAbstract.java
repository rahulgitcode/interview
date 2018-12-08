package com.oops;

public abstract class AAbstract {
	
	public String encryptPassword(String passwd) {
		return passwd.toUpperCase();
	}
	
	public boolean checkIfUserExists(String usernm) {
		return true;
	}

}
