public abstract class Beverage {
    public  enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "Unknown Beverage";
    double milkCost = .10;
    double soyCost = .15;
    double mochaCost = .20;
    double whipCost = .10;


    public String getDescription(){
        return description;
    }
    public double cost(){
        double condimentCost = 0.0;
        if(hasMilk()){
            condimentCost += milkCost;
        }
        if(hasSoy()){
            condimentCost += soyCost;
        }
        if(hasMocha()){
            condimentCost += mochaCost;
        }
        if(hasWhip()){
            condimentCost += whipCost;
        }
        return condimentCost;

    }

    private boolean hasWhip() {
        return false;
    }

    private boolean hasMocha() {
        return false;
    }

    private boolean hasSoy() {
        return false;
    }

    private boolean hasMilk() {
        return false;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
   // public abstract double cost();

}
