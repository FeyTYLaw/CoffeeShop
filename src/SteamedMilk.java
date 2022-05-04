public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
