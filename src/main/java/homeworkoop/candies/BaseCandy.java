package homeworkoop.candies;


public class BaseCandy implements Candy {
    private float weight;
    private float shugar;
    private float price;
    private String name;

    public BaseCandy(double weight, double shugar, double price, String name) {
        this.weight = (float) weight;
        this.shugar = (float) shugar;
        this.price = (float) price;
        this.name = name;
    }



    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public float getShugar() {
        return shugar;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    void check() {
        if (weight <= 0) {
            System.err.println ( "Weight < 0" );
        }
        if (shugar <= 0) {
            System.err.println ( "Shugar < 0" );
        }
        if (price <= 0) {
            System.err.println ( "Price < 0" );
        }
        if (name.isEmpty () || name == null) {
            System.err.println ( "Incorrect name" );
        }
    }

}

