package utilities;

import org.openqa.selenium.By;

public class Locatorvaluesplit {
	
	public static By loc_Split(String locatorvalue) { //"xpath://*[@id=\"ctl00_topMegaMenu_deskTopMenu\"]/div/ul/li[1]/a"
		String loc_Type = locatorvalue.split(":")[0];
		String loc_value = locatorvalue.split(":")[1]; 
		
		if (loc_Type.equalsIgnoreCase("ID")) {
			return By.id(loc_value);
		} else if (loc_Type.equalsIgnoreCase("NAME")) {
			return By.name(loc_value);
		} else if (loc_Type.equalsIgnoreCase("XPATH")) {
			return By.xpath(loc_value);
		} else if (loc_Type.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(loc_value);
		} else if (loc_Type.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(loc_value);
		} else if (loc_Type.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(loc_value);
		}
		return null;			
	}
}
