package Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {

    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void uploadVideo(String video) {
        for (Observer observer : subscribers) {
            observer.update(video);
        }
    }
}
