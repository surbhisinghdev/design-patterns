public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago style pizza";
        dough = "Thick crust";
        sauce = "Soy sauce";
        toppings.add("Jalapeno");
        toppings.add("Capsicum");
        toppings.add("Tomato");
    }

    void cut(){
        System.out.println("Cutting pizza into square slices");
    }
}
