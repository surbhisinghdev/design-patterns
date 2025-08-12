package abstract_factory;

public class MozarellaCheese implements Cheese{
    @Override
    public String createCheese() {
//        System.out.println("Adding mozzarella cheese...");
        return "Mozzarella cheese";
    }
}
