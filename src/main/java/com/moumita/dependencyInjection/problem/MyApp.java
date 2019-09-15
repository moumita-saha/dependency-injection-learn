package com.moumita.dependencyInjection.problem;

public class MyApp {
	
	AccessDataFromExcelService accessorDataFromExcelService = new AccessDataFromExcelService();
	
	public void mainProcess(String dataTag) {
		accessorDataFromExcelService.accessDataFromExcel(dataTag);
	}
}
