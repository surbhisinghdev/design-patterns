package abstract_factory;

public class ThickCrust implements Dough{

    @Override
    public String createDough() {
//        System.out.println("Making thick crust...");
        return "Thick Crust";
    }
}
