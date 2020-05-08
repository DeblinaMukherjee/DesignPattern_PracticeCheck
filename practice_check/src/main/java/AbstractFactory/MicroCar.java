package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car{

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(MicroCar.class);
	
	public MicroCar(Location location) {
		
		super(CarType.MICRO,location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("start");
		LOGGER.debug("Connecting to Micro car");
		LOGGER.info("end");
	}
}
