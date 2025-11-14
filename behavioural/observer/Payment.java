package observer;

public class Payment implements Observer{

    Topic topic;
    Payment(Topic topic) {
        this.topic = topic;
        topic.addObservers(this);
    }
    @Override
    public void update(String message) {
        System.out.println("Received message: "+message);
    }
}
