package AbstractFactory;

public class IndiaFactory {

	public static Car getCar(CarType model) {

		if(model==CarType.LUXURY)
		{
			return new LuxuryCar(Location.INDIA);	
		}
		else if(model==CarType.MICRO)
		{
			return new MicroCar(Location.INDIA);	
		}
		return new MiniCar(Location.INDIA);
	}
}
