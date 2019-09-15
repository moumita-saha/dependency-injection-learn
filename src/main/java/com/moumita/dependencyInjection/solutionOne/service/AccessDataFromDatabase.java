/**
 * 
 */
package com.moumita.dependencyInjection.solutionOne.service;

/**
 * @author DELL
 *
 */
public class AccessDataFromDatabase implements AccessDataService {

	public void accessDataFromInput(String dataTag) {
		System.out.println("You are in AccessDataFromDatabase:: accessDataFromInput =>"+dataTag);		
	}

}
