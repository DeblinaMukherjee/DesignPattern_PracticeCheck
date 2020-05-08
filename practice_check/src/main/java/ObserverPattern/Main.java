package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		
		NotificationService service = new NotificationService();
		SteveObserver Steve = new SteveObserver();
		JohnObserver John = new JohnObserver();
		
		service.AddSubscriber(Steve);
		service.AddSubscriber(John);
		service.NotifySubscriber();
		service.RemoveSubscriber(Steve);
		service.NotifySubscriber();

	}

}
