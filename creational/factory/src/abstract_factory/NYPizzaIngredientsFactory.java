package abstract_factory;

public class NYPizzaIngredientsFactory implements IngredientsFactory{
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    public NYPizzaIngredientsFactory(Dough dough, Sauce sauce, Cheese cheese) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    @Override
    public String createDough() {
        return dough.createDough();
    }

    @Override
    public String createSauce() {
        return sauce.createSauce();
    }

    @Override
    public String createCheese() {
        return cheese.createCheese();
    }
}
