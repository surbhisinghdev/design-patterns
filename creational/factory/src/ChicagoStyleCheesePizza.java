import abstract_factory.IngredientsFactory;

public class ChicagoStyleCheesePizza extends Pizza{
    IngredientsFactory ingredientsFactory;
    public ChicagoStyleCheesePizza(IngredientsFactory ingredientsFactory){
        name = "Chicago style pizza";
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        toppings.add("Jalapeno");
        toppings.add("Capsicum");
        toppings.add("Tomato");
    }

    void cut(){
        System.out.println("Cutting pizza into square slices");
    }
}
