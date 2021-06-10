package com.work.model.dto;

/**
 * 
 * @author ±èÇöÁø
 *
 */
public class SpecialMember extends Member {
	private String manager;
	
	public SpecialMember() {}

	/**
	 * @param manager
	 */
	public SpecialMember(String manager) {
		this.manager = manager;
	}

	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	};
	
	
	
}
