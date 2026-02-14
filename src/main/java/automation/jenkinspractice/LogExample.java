package automation.jenkinspractice;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

public class LogExample {
	private static final Logger Logger = LogManager.getLogger(LogExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger.trace("This is trace level log");
		Logger.debug("This is DEBUG level log");
		Logger.info("APPLICATION STARTED");
		Logger.warn("This is trace WARNING msg");
		Logger.error("This is trace ERROR msg");
		Logger.fatal("This is trace FATAL msg");

	
	
	}

}
