/**
 * 
 */
package com.cognizant.gpd.exception;

/**
 * @author USER
 *
 */
public class GpdException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpdException(String msg) {
		super(msg);
	}
	
	public GpdException(Exception e) {
		super(e);
	}
}
