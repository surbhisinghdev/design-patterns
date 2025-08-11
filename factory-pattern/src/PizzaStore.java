public abstract class PizzaStore {
    Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String item);
}
