import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Observer> subscribers = new ArrayList<>();
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void upload(String tittle) {
        this.title = tittle;
        notifySubscribers();
    }
}
