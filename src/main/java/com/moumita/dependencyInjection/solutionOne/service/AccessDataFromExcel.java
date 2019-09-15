/**
 * 
 */
package com.moumita.dependencyInjection.solutionOne.service;

/**
 * @author DELL
 *
 */
public class AccessDataFromExcel implements AccessDataService{

	public void accessDataFromInput(String dataTag) {
		System.out.println("You are in AccessDataFromExcel:: accessDataFromInput =>"+dataTag);
		
	}

}
