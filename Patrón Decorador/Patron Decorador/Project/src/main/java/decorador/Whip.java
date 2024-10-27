package decorador;

public class Whip extends  Condiment{
    Beverage beverage;

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return 0.10 + beverage.cost();
    }
}
