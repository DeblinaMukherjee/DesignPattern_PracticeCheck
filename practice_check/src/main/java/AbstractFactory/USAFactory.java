package AbstractFactory;

public class USAFactory{

	public static Car getCar(CarType model) {

		if(model==CarType.LUXURY)
		{
			return new LuxuryCar(Location.USA);	
		}
		else if(model==CarType.MICRO)
		{
			return new MicroCar(Location.USA);	
		}
		return new MiniCar(Location.USA);
	}
}