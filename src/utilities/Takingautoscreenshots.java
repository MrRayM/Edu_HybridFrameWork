package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Takingautoscreenshots {

	public static void autoscreenshot(TakesScreenshot ts, String imageName) throws Exception {
		
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("ddMMyy@hhmmss");
		File filedestination = new File("C:\\01Sept2018Batch\\HybridFramework\\Evidences\\" + imageName + sf.format(d)+ ".jpeg");
		File filesrc = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyDirectory(filesrc, filedestination);
	}
}
