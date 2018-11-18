package testcases;

import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC005 {
	public static void tc005() throws Exception {
		Logging.startTestcase("TC005");
		Reporter.log("-----------------TC005 Execution started---------------");		
		
		Actionkeywords.handling_click(LocatorValues.profile_navigateto_profile_click);
		Actionkeywords.handling_click(LocatorValues.profile_myprofile_click);
		Actionkeywords.handling_click(LocatorValues.profile_myprofile_edit_click);
		Actionkeywords.handling_click(LocatorValues.profile_profdetails_click);
		Actionkeywords.handle_sendkey(LocatorValues.profile_profdetails_companyname_sendkey, "XYZ");
		Actionkeywords.handle_sendkey(LocatorValues.profile_profdetails_job_sendkey, "ABC");
		Actionkeywords.handle_sendkey(LocatorValues.profile_profdetails_industry_sendkey, "XYZ Ltd");
		Actionkeywords.handle_sendkey(LocatorValues.profile_profdetails_skills_sendkey, "ABC123");
		Actionkeywords.handling_click(LocatorValues.profile_profdetails_upload_click);
		Actionkeywords.RunAutoIt();
		
		Logging.endTestcase();
		Reporter.log("-----------------TC005 Execution Finished---------------");
	}
}
