import java.util.LinkedList;
import java.util.List;

public class TwitterFeed
        implements Observable<String> {
    private List<Observer<String>> subscribers =
            new LinkedList<>();
    public void subscribe(
            Observer<String> follower) {
        subscribers.add(follower);
    }
    public void publishTweet(String tweet) {
        for (Observer<String>
                subscriber : subscribers)
            subscriber.notify(tweet);
    }
}