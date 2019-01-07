package logAndReports;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggerTest {
	
	public static final Logger log = Logger.getLogger(LoggerTest.class.getName());

	static String configFilename = "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//log4j.properties";

	
	@BeforeTest
	public static void getLogger() {

		PropertyConfigurator.configure(configFilename);

	}
	
	@Test
	public void testLogger() {
		
		log.info("Log Test1");
		log.info("Test2");
		log.info("Test3");
		log.info("Test4");
		
	}

}
