public class NYStylePizzaFactory extends PizzaStore{
    Pizza createPizza(String item){
        if (item.equals("cheese")) return new NYStyleCheesePizza();
        else if (item.equals("pepperoni")) return new NYStyleCheesePizza();
        else if (item.equals("veggie")) return new NYStyleCheesePizza();
        else return null;
        //returning cheese pizza only here for demo, can have implementations of other type as well and return them here
    }
}
