package homeworkoop.editor;

import homeworkoop.candies.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftBox implements GiftFactory {


    public ArrayList<Candy> firstColection() {
        ArrayList<Candy> list = new ArrayList<Candy> ();

        CandyCaramel candyCaramel = new CandyCaramel ( 0.05f, 0.01f, 0.58f, "Chups", 1 );

        ChocolatBat chocolatBat = new ChocolatBat ( 0.1f, 0.03f, 4f, "Twix", 2 );
        ChocolatBat chocolatBat2 = new ChocolatBat ( 0.4f, 0.05f, 8f, "Snikers", 1 );

        ChocolatCandy chocolatCandy = new ChocolatCandy ( 0.25f, 0.125f, 1f, "Korona", "Black" );
        ChocolatCandy chocolatCandy2 = new ChocolatCandy ( 0.25f, 0.135f, 3f, "Millenium", "White" );

        FruitCandy fruitCandy = new FruitCandy ( 0.02f, 0.01f, 0.1f, "Dusesh", "Apple" );
        FruitCandy fruitCandy2 = new FruitCandy ( 0.02f, 0.01f, 0.1f, "Harvey", "Blackberry" );

        list.add ( candyCaramel );

        list.add ( chocolatBat );
        list.add ( chocolatBat2 );

        list.add ( chocolatCandy );
        list.add ( chocolatCandy2 );

        list.add ( fruitCandy );
        list.add ( fruitCandy2 );


        return list;
    }

    public static void createBox() {
        GiftBox giftBox = new GiftBox ();
        List<Candy> list = giftBox.firstColection ();

        giftBox.getFullColection ( list );
        double res = giftBox.getFullGiftWeight ( list, 0 );
        double res1 = giftBox.getFullGiftShugar ( list, 0 );
        double res2 = giftBox.getFullGiftPrice ( list, 0 );
        System.out.printf ( "%n Total weight of all items is:  %8.2f%n", res );
        System.out.printf ( "%n Total shugar of all items is: %8.2f%n", res1 );
        System.out.printf ( "%n Total cost of all items is: %8.2f%n", res2 );
        giftBox.findElementByPrice ( list );

    }


    public void getFullColection(List<Candy> list) {
        int i = 1;
        System.out.println ( "ID: " + " NAME:    " + "   COST: " + "   WEIGHT:  " + "   SHUGAR:  " );
        for (Candy vault : list) {
                if (vault.getWeight () <= 0) {
                    System.err.println ( "Weight < 0" );
                }
                if (vault.getShugar () <= 0) {
                    System.err.println ( "Shugar < 0" );
                }
                if (vault.getPrice() <= 0) {
                    System.err.println ( "Price < 0" );
                }
                if (vault.getName ().isEmpty () || vault.getName () == null) {
                    System.err.println ( "Incorrect name" );
                }
            System.out.println ( i + ".   " + vault.getName () + "    " + vault.getPrice () + "       " + vault.getWeight () + "       " + vault.getShugar () );
            i++;
        }
    }

    @Override
    public double getFullGiftWeight(List<Candy> list, double sumWeight) {
        for (Candy vault : list) {
            sumWeight += vault.getWeight ();
        }
        return sumWeight;
    }

    @Override
    public double getFullGiftShugar(List<Candy> list, double sumShugar) {
        for (Candy vault : list) {
            sumShugar += vault.getShugar ();
        }
        return sumShugar;
    }

    @Override
    public double getFullGiftPrice(List<Candy> list, double sumPrice) {
        for (Candy vault : list) {
            sumPrice += vault.getPrice ();
        }
        return sumPrice;
    }

    public StringBuilder findCandyByPrice(double a, double b, List<Candy> list) {
        StringBuilder candy = new StringBuilder ();
        for (Candy vault : list) {
            if ((vault.getPrice () >= a && vault.getPrice () <= b) || (vault.getPrice () >= b && vault.getPrice () <= a)) {
                candy.append ( vault.getName () + "   " );
            }
        }
        return candy;
    }

    public void findElementByPrice(List<Candy> list) {
        System.out.println ( "Enter your cost of candy" );
        Scanner sc = new Scanner ( System.in );
        double a = sc.nextDouble ();
        double b = sc.nextDouble ();
        StringBuilder item = findCandyByPrice ( a, b, list );
        System.out.println ( "Your candies are: " + item );
    }


    public static void main(String[] args) {
        createBox ();
    }

}
