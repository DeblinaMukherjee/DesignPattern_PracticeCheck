package ObserverPattern;

public interface INotificationService {

	public void AddSubscriber(INotificationObserver nObserver);

	public void RemoveSubscriber(INotificationObserver nObserver);

	public void NotifySubscriber();
}
