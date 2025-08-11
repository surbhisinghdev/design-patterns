//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStylePizza = new NYStylePizzaFactory();
        PizzaStore chicagoStylePizza = new ChicagoStylePizzaFactory();
        Pizza nyPizza = nyStylePizza.orderPizza("cheese");
        System.out.println("Your "+nyPizza.getName()+" is ready!");
        Pizza chicagoPizza = chicagoStylePizza.orderPizza("cheese");
        System.out.println("Your "+chicagoPizza.getName()+" is ready!");
    }
}