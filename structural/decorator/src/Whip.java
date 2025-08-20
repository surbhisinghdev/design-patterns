public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return beverage.cost()+ 2.50;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }
}

