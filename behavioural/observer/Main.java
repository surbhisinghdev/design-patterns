package observer;

public class Main {
    public static void main(String[] args) {
        Topic order = new Topic();
        order.setName("order");
        Topic payment = new Topic();
        payment.setName("payment");
        MessageBroker simplemb = new SimpleMessageBroker();
        simplemb.addTopic(order);
        simplemb.addTopic(payment);
        Observer orderConsumer1 = new Order(order);
        Observer orderConsumer2 = new Order(order);
        Observer orderConsumer3 = new Order(order);
        Observer orderConsumer4 = new Order(order);
        Observer paymentConsumer1 = new Payment(payment);
        Producer producer = new Producer(simplemb);
        producer.produceMessage("Publishing message",  "order");
        order.removeObservers(orderConsumer3);
        producer.produceMessage("Publishing message",  "order");
        producer.produceMessage("Publishing message",  "payment");
    }
}
