package mainScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import constantvalues.ConstantValues;
import readwrite.ExcelRW;
import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import testcases.TC004;
import testcases.TC005;
import testcases.TC006;
import testcases.TC007;

public class Driverscript {
		public static Boolean bvalue;
//------------------------------------------WORKING WITH REUSEABLE METHODS-----------------------------------------------------
		@BeforeTest
		public static void prerequiste() throws Exception {
			
			ExcelRW.excelPath(ConstantValues.excelPath);
			DOMConfigurator.configure("log4j.xml");
		}
//-----------------------------------------------TC001-------------------------------------------------------------------------		
		@Test(priority=1)
		public static void tc001() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 1, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC001.tc001();	
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 1, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 1, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 1, ConstantValues.resultcol, "SKIP");
			}
		}
//-----------------------------------------------TC002-------------------------------------------------------------------------		
		@Test(priority=2)
		public static void tc002() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 2, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC002.tc002();
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 2, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 2, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 2, ConstantValues.resultcol, "SKIP");
			}
		}
//-----------------------------------------------TC003-------------------------------------------------------------------------			
		@Test(priority=3)
		public static void tc003() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 3, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC003.tc003();		
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 3, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 3, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 3, ConstantValues.resultcol, "SKIP");
			}
		}
//-----------------------------------------------TC004-------------------------------------------------------------------------
		
		@Test(priority=4)
		public static void tc004() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 4, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC004.tc004();		
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 4, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 4, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 4, ConstantValues.resultcol, "SKIP");
			}
		}
		
		//-----------------------------------------------TC005-------------------------------------------------------------------------
		
		@Test(priority=5)
		public static void tc005() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 5, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC005.tc005();		
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 5, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 5, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 5, ConstantValues.resultcol, "SKIP");
			}
		}
		
		//-----------------------------------------------TC006-------------------------------------------------------------------------
		
		@Test(priority=6)
		public static void tc006() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 6, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC006.tc006();		
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 6, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 6, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 6, ConstantValues.resultcol, "SKIP");
			}
		}
		
		//-----------------------------------------------TC007-------------------------------------------------------------------------
		
		@Test(priority=7)
		public static void tc007() throws Exception {
			if (ExcelRW.readValue(ConstantValues.testscenariosheet, 6, ConstantValues.runmodecol).equalsIgnoreCase("Y")) {
				bvalue = true;
				TC007.tc007();		
				if (bvalue == false) {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 6, ConstantValues.resultcol, "FAIL");
				} else {
					ExcelRW.writeValue(ConstantValues.testscenariosheet, 6, ConstantValues.resultcol, "PASS");
				}
			} else {
				ExcelRW.writeValue(ConstantValues.testscenariosheet, 6, ConstantValues.resultcol, "SKIP");
			}
		}
}
