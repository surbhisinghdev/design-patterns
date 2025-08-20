public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return beverage.cost()+ 1.50;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }
}
