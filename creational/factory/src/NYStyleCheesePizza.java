import abstract_factory.IngredientsFactory;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(IngredientsFactory ingredientsFactory){
        name = "NY style pizza";
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        toppings.add("Jalapeno");
    }
}
