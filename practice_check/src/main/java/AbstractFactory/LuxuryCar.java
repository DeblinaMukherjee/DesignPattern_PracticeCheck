package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(LuxuryCar.class);
	
	public LuxuryCar(Location location) {
		
		super(CarType.LUXURY,location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("start");
		LOGGER.debug("Connecting to Luxury car");
		LOGGER.info("end");
	}

	
	
}
