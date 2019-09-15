/**
 * 
 */
package com.moumita.dependencyInjection.solutionOne.application;

import com.moumita.dependencyInjection.solutionOne.service.AccessDataService;

/**
 * @author DELL
 *
 */
public class MyApp{
	
	AccessDataService accessorData ;
	
	public MyApp(AccessDataService accessor) {
		this.accessorData = accessor;
	}
	
	public void mainProcess(String dataTag) {
		System.out.println("You are in Main Application::mainProcess=>"+dataTag);
		accessorData.accessDataFromInput(dataTag);
	}

}
