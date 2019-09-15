package com.moumita.dependencyInjection.solutionOneTest;

import com.moumita.dependencyInjection.solutionOne.application.MyApp;
import com.moumita.dependencyInjection.solutionOne.service.AccessDataFromDatabase;
import com.moumita.dependencyInjection.solutionOne.service.AccessDataFromExcel;

public class MyAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyApp app = new MyApp(new AccessDataFromDatabase());
		
		app.mainProcess("Name");
		
		
		MyApp excelApp = new MyApp(new AccessDataFromExcel());
		excelApp.mainProcess("Age");	
		
	}

}
