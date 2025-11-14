package observer;

import java.util.HashMap;
import java.util.Map;

public class SimpleMessageBroker implements MessageBroker{
    private Map<String, Topic> topics = new HashMap<>();
    @Override
    public void addTopic(Topic topic) {
        topics.put(topic.getName(), topic);
    }

    @Override
    public void removeTopic(Topic topic) {
        topics.remove(topic.getName());
    }

    @Override
    public void notifySubscribers(String message,  String topicName) {
        Topic topic = topics.get(topicName);
        if (topic != null) {
            topic.notifyObservers(message);
        } else {
            System.out.println("⚠️ No such topic: " + topicName);
        }
    }
}
