import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding souce... ");
        System.out.println("Adding toppings... ");
        for(String topping : toppings) {
            System.out.println(" "+topping);
        }
    }

    void bake() {
        System.out.println("Baking...");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }
    void box() {
        System.out.println("Placing the pizza into official boxes");
    }
    String getName(){
        return name;
    }
}
