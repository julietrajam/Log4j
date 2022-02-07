package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger logger=Logger.getLogger(BasicConfiguratorExample.class);
	
	public static void main(String[] args)
	{
		BasicConfigurator.configure();
		logger.debug("Debug Message");
		logger.info("Info message");
		logger.warn("Warning message");
		logger.error("Error message");
		logger.fatal("Fatal message");
	}

}
