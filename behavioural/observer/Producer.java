package observer;

public class Producer {
    MessageBroker messageBroker;
    Producer(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }
    void produceMessage(String message, String topicName){
        messageBroker.notifySubscribers(message, topicName);
    }
}
