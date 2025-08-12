import abstract_factory.*;

public class NYStylePizzaFactory extends PizzaStore{
    Pizza createPizza(String item){
        if (item.equals("cheese")) return new NYStyleCheesePizza(new NYPizzaIngredientsFactory(new ThinCrust(), new PlumTomatoSauce(), new MozarellaCheese()));
        else if (item.equals("pepperoni")) return null;
        else if (item.equals("veggie")) return null;
        else return null;
        //returning cheese pizza only here for demo, can have implementations of other type as well and return them here
    }
}
