package testcases;

import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC007 {
	public static void tc007() throws Exception {
		Logging.startTestcase("TC007");
		Reporter.log("-----------------TC007 Execution started---------------");		
		
		Actionkeywords.handling_click(LocatorValues.pagelogout_usename_click);
		Actionkeywords.handling_click(LocatorValues.pagelogout_btn_click);
		Actionkeywords.closebrowser();
		Logging.endTestcase();
		Reporter.log("-----------------TC007 Execution Finished---------------");
	}
}
