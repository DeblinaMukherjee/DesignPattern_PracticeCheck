package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car{

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(MiniCar.class);

	public MiniCar(Location location) {
		
		super(CarType.MINI,location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("start");
		LOGGER.debug("Connecting to Mini car");
		LOGGER.info("end");
	}
}
