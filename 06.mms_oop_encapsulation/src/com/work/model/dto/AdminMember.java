/**
 * 
 */
package com.work.model.dto;

/**
 * @author ±èÇöÁø
 *
 */
public class AdminMember extends Member {
	public AdminMember() {};
	
	private String position;

	/**
	 * @param position
	 */
	public AdminMember(String position) {
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
