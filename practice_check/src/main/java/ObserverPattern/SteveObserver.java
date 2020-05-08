package ObserverPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);
	
	String name="Steve";;
	
	public void OnServerDown() {
		LOGGER.info("start");
		LOGGER.debug("Notifaction has been received by :: " + name);
		LOGGER.info("end");
	}


	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}
	
	

}
