package HW_OOP.candies;


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
        if(weight<=0){
            System.err.println ("Weight < 0");
        }
        return weight;
    }

    @Override
    public float getShugar() {
        if(shugar<=0){
            System.err.println ("Shugar < 0");
        }
        return shugar;
    }

    @Override
    public float getPrice() {
        if(price<=0){
            System.err.println ("Price < 0");
        }
        return price;
    }

    @Override
    public String getName() {
        if(name.isEmpty () || name == null ){
        System.err.println ("Incorrect name");
    }
        return name;
    }

/*
    public enum  candyType {
        FONDANT,
        MILK,
        PRALINE,
        FRUIT,
        JELLY,
        CREAM,
        MARZZIPAN,
        LIQUOR,
        CHOCOLAT
    }

    @Override
    public void select() {
        select = true;
    }

    @Override
    public void unSelect() {
        select = false;
    }

    @Override
    public boolean isSelected() {
        return select;}
 */
}

