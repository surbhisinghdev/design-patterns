import abstract_factory.*;

public class ChicagoStylePizzaFactory extends PizzaStore{
    Pizza createPizza(String item){
        if (item.equals("cheese")) return new ChicagoStyleCheesePizza(new ChicagoIngredientsFactory(new ThickCrust(), new MarinaraSauce(), new ReggianoCheese()));
        else if (item.equals("pepperoni")) return null;
        else if (item.equals("veggie")) return null;
        else return null;
        //returning null for other types here for demo, can have implementations of other type as well and return them here
    }
}
