package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {

static Logger logger=Logger.getLogger(PropertyLog4jExample.class);
	
	public static void main(String[] args)
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Debug Message");
		logger.info("Info message");
		logger.warn("Warning message");
		logger.error("Error message");
		logger.fatal("Fatal message");
	}
	
}
