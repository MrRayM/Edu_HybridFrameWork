package constantvalues;

import readwrite.ExcelRW;

public class ConstantValues {

	public static final String chromedriverpath = "D:\\Used Jar Files\\WebDriver\\chromedriver.exe";
	public static final String Firefoxdriverpath = "D:\\Used Jar Files\\WebDriver\\geckodriver.exe";
	public static final String excelPath = "D:\\Java Project Files\\HybridFramework\\TestData.xlsx";

	public static final String browsertype = ExcelRW.readValue("TestPointers", 1, 4);
	public static final String URL = ExcelRW.readValue("TestPointers", 2, 4);
	public static final String enterEmailid = ExcelRW.readValue("TestPointers", 3, 4);
	public static final String enterpassword = ExcelRW.readValue("TestPointers", 4, 4);
	public static final String coursename = ExcelRW.readValue("TestPointers", 18, 4);

	
	public static final String testscenariosheet = "TestResult";
	public static final String testdatasheet = "TestPointers";
	public static final int runmodecol = 2;
	public static final int resultcol = 3;
	public static final int outputcol=5;
	
}
