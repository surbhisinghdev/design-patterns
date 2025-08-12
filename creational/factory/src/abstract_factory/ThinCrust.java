package abstract_factory;

public class ThinCrust implements Dough{
    @Override
    public String createDough() {
//        System.out.println("Making thin crust...");
        return "Thin Crust";
    }
}
