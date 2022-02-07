package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jXmlConfigurator {
	
static Logger logger=Logger.getLogger(Log4jXmlConfigurator.class);
	
	public static void main(String[] args)
	{
		DOMConfigurator.configure("log4j.xml");
		logger.debug("Debug Message");
		logger.info("Info message");
		logger.warn("Warning message");
		logger.error("Error message");
		logger.fatal("Fatal message");
	}

}
