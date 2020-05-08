package AbstractFactory;

public class CarFactory {

	public static Car buildCar(CarType model, Location location) {

		if (Location.DEFAULT.equals(location)) {

			return DefaultFactory.getCar(model);
		}
		else if (Location.USA.equals(location)) {

			return USAFactory.getCar(model);

		} 
		else {

			return IndiaFactory.getCar(model);

		}

	}

	

}
