package testcases;

import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.ConstantValues;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC006 {

	public static void tc006() throws Exception {
		Logging.startTestcase("TC006");
		Reporter.log("-----------------TC006 Execution started---------------");		
		
		Actionkeywords.defaultwindowId();
		Actionkeywords.handling_click(LocatorValues.blog_community_click);
		Actionkeywords.handling_click(LocatorValues.blog_blog_click);
		Actionkeywords.handling_windowsIDs();
		
		Actionkeywords.handle_sumbit_sendkey(LocatorValues.blog_blog_search_sendkey_submit, ConstantValues.coursename);
		Actionkeywords.handling_click(LocatorValues.blog_blog_interviewQuestion_click);
		
		Logging.endTestcase();
		Reporter.log("-----------------TC006 Execution Finished---------------");
	}
}
