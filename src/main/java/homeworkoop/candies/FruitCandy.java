package homeworkoop.candies;

public class FruitCandy extends BaseCandy {
    private String fruit;

    public FruitCandy(double weight, double shugar, float price, String name, String fruit) {
        super ( weight, shugar, price, name );
    }

    public String Fruit(){
        return fruit;
    }
}
