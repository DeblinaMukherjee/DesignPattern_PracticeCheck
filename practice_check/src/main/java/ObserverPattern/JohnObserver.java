package ObserverPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnObserver implements INotificationObserver {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);
	
	String name="John";

	public void OnServerDown() {
		LOGGER.info("start");
		LOGGER.debug("Notifaction has been received by :: " + name);
		LOGGER.info("end");
	}


	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

	
}
