package observer;

public class Order implements Observer{
    Topic topic;
    Order(Topic topic) {
        this.topic = topic;
        topic.addObservers(this);
    }
    @Override
    public void update(String message) {
        System.out.println(topic.name+" Received message: "+message);
    }
}
