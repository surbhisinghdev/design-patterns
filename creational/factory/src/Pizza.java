import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    String cheese;
    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing "+dough+"dough...");
        System.out.println("Adding "+sauce);
        System.out.println("Adding "+cheese);
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
