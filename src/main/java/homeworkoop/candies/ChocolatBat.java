package homeworkoop.candies;

public class ChocolatBat extends BaseCandy {
    private int size;

    public ChocolatBat(double weight, double shugar, float price, String name, int size) {
        super ( weight, shugar, price, name );
    }

    public float getSize() {
        return size;
    }
}
