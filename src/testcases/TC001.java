package testcases;


import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.ConstantValues;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC001 {

	public static void tc001() throws Exception {
		Logging.startTestcase("TC001");
		Reporter.log("-----------------TC001 Execution started---------------");
		Actionkeywords.browserType(ConstantValues.browsertype);
		Actionkeywords.openBrowser(ConstantValues.URL);
		Actionkeywords.handling_click(LocatorValues.membershiplink_login_click1);
		Actionkeywords.handle_sendkey(LocatorValues.membershiplink_emailid_sendkey, ConstantValues.enterEmailid);
		Actionkeywords.handle_sendkey(LocatorValues.membershiplink_password_sendkey, ConstantValues.enterpassword);
		Actionkeywords.handling_click(LocatorValues.membershiplink_login_click2);
		Logging.endTestcase();
		Reporter.log("-----------------TC001 Execution Finished---------------");
	}
}
