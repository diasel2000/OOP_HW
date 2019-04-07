package HW_OOP.candies;

public class CandyCaramel extends BaseCandy {
    private double count;

    public CandyCaramel(float weight, float shugar, float price, String name, int count) {
        super ( weight, shugar, price, name );
    }

    public double getCount(){

        return count;
    }
}
