public class Milk extends CondimentDecorator{
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return beverage.cost()+ 4.50;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " ,Milk";
    }
}

