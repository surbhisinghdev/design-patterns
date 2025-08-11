public class ChicagoStylePizzaFactory extends PizzaStore{
    Pizza createPizza(String item){
        if (item.equals("cheese")) return new ChicagoStyleCheesePizza();
        else if (item.equals("pepperoni")) return new ChicagoStyleCheesePizza();
        else if (item.equals("veggie")) return new ChicagoStyleCheesePizza();
        else return null;
        //returning cheese pizza only here for demo, can have implementations of other type as well and return them here
    }
}
