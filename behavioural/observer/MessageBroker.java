package observer;

public interface MessageBroker {
    void addTopic(Topic topic);
    void removeTopic(Topic topic);
    void notifySubscribers(String message, String topicName);
}
