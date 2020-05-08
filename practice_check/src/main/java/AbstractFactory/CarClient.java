package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarClient {
	
	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(CarClient.class);

	public static void main(String[] args) {
		
		LOGGER.info("start");
		LOGGER.debug("{}",CarFactory.buildCar(CarType.MICRO,Location.USA));
		LOGGER.debug("{}",CarFactory.buildCar(CarType.MINI,Location.INDIA));
		LOGGER.debug("{}",CarFactory.buildCar(CarType.LUXURY,Location.DEFAULT));
		LOGGER.info("end");

	}

}
