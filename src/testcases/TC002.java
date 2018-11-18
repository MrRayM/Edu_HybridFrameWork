package testcases;

import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC002 {
	
	public static void tc002() throws Exception {
		Logging.startTestcase("TC002");
		Reporter.log("-----------------TC002 Execution started---------------");
		
		Actionkeywords.CourseList(LocatorValues.allcourse_list);
		
		Logging.endTestcase();
		Reporter.log("-----------------TC002 Execution Finished---------------");
	}

}
