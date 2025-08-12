package abstract_factory;

public class ReggianoCheese implements Cheese{
    @Override
    public String createCheese() {
//        System.out.println("Adding reggiano cheese...");
        return "Reggiano cheese";
    }
}
