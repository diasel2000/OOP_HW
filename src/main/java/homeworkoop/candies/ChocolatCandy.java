package homeworkoop.candies;

public class ChocolatCandy extends BaseCandy{
    private String typeChocolat;

    public ChocolatCandy(double weight, double shugar, float price, String name, String typeChocolat) {
        super ( weight, shugar, price, name );
    }

    public String getTypeChocolat(){
        return typeChocolat;
    }
}
