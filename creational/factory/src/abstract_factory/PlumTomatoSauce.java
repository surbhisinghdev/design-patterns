package abstract_factory;

public class PlumTomatoSauce implements Sauce{
    @Override
    public String createSauce() {
//        System.out.println("Adding plum tomato sauce...");
        return "Plum tomato sauce";
    }
}
