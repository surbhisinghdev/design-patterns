package abstract_factory;

public class MarinaraSauce implements Sauce{

    @Override
    public String createSauce() {
//        System.out.println("Adding marinara sauce...");
        return "Marinara sauce";
    }
}
