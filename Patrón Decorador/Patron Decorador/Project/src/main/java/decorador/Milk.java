package decorador;

public class Milk extends Condiment {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost(){
        return 0.10 + beverage.cost();
    }

}
