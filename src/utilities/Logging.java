package utilities;

import org.apache.log4j.Logger;

public class Logging {
	
	public static Logger Logging = Logger.getLogger(Logging.class.getName());
	
	public static void startTestcase(String message) {
		Logging.info("+++++++++++++++++++++++++");
		Logging.info("+++++++++++++++++++++++++");
		Logging.info("+++++++"+message+"++++++");
		Logging.info("+++++++++++++++++++++++++");
		Logging.info("+++++++++++++++++++++++++");
	}
	
	public static void endTestcase() {
		Logging.info("+++++++++++++++++++++++++");
		Logging.info("+++++++++END OF TEST CASE+++++++");
		Logging.info("+++++++++++++++++++++++++");
	}
	
	public static void info(String message) {
		Logging.info(message);
	}
	
	public static void error(String message) {
		Logging.error(message);
	}

}
