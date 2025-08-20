public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return beverage.cost()+ 3.50;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " ,Soy";
    }
}

