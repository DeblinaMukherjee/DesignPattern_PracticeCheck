package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observer = new ArrayList<INotificationObserver>();
	
	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);
	
	public void AddSubscriber(INotificationObserver nObserver) {
		observer.add(nObserver);
		LOGGER.info("start");
		LOGGER.debug("{}",observer);
		LOGGER.info("end");
	}

	public void RemoveSubscriber(INotificationObserver nObserver) {
		observer.remove(nObserver);
		LOGGER.info("start");
		LOGGER.debug("{}",observer);
		LOGGER.info("end");
	}

	public void NotifySubscriber() {
		for(INotificationObserver Nobserver : observer)

		{
			Nobserver.OnServerDown();
		}

	}

}
