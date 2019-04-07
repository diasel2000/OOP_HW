package HW_OOP.editor;

import HW_OOP.candies.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GiftBox implements GiftFactory {


    public ArrayList<Candy> firstColection(){
        ArrayList<Candy> list = new ArrayList<Candy>();

        CandyCaramel candyCaramel = new CandyCaramel ( 0.05f,0.01f,0.58f,"Chups",1 );

        ChocolatBat chocolatBat = new ChocolatBat ( 0.1f,0.03f,4f,"Twix",2 );
        ChocolatBat chocolatBat2 = new ChocolatBat ( 0.4f,0.05f,8f,"Snikers",1);

        ChocolatCandy chocolatCandy = new ChocolatCandy ( 0.25f,0.125f,1f,"Korona","Black");
        ChocolatCandy chocolatCandy2 = new ChocolatCandy ( 0.25f,0.135f,3f,"Millenium","White" );

        FruitCandy fruitCandy = new FruitCandy ( 0.02f,0.01f,0.1f,"Dusesh","Apple" );
        FruitCandy fruitCandy2 = new FruitCandy ( 0.02f,0.01f,0.1f,"Harvey","Blackberry");

        list.add (candyCaramel);

        list.add (chocolatBat);
        list.add (chocolatBat2);

        list.add (chocolatCandy);
        list.add (chocolatCandy2);

        list.add (fruitCandy);
        list.add (fruitCandy2);


        return list;
    }
    public static void createBox(){
        GiftBox giftBox=new GiftBox ();
        ArrayList<Candy> list = giftBox.firstColection ();

        giftBox.getFullColection (list);
        double res = giftBox.getFullGiftWeight (list, 0);
        double res1 = giftBox.getFullGiftShugar (list, 0);
        double res2 = giftBox.getFullGiftPrice (list, 0);
        System.out.printf ("%n Total weight of all items is:  %8.2f%n" , res );
        System.out.printf ("%n Total shugar of all items is: %8.2f%n" , res1);
        System.out.printf ("%n Total cost of all items is: %8.2f%n" ,res2 );
        giftBox.findElementByPrice (  list );

    }



    public void getFullColection(ArrayList<Candy> list) {
        int i = 1;
        System.out.println("ID: " + " NAME:    " + "   COST: " + "   WEIGHT:  "+ "   SHUGAR:  " );
        for (Candy vault : list) {
                System.out.println(i + ".   " + vault.getName() + "    " + vault.getPrice () + "       " + vault.getWeight()+"       "+vault.getShugar ());
            i++;
        }
    }

    @Override
    public double getFullGiftWeight(ArrayList<Candy> list, double sumWeight) {
        for (Candy vault : list) {
            sumWeight += vault.getWeight ();
        }
        return sumWeight;
    }

    @Override
    public double getFullGiftShugar(ArrayList<Candy> list, double sumShugar) {
        for (Candy vault : list) {
            sumShugar += vault.getShugar ();
        }
        return sumShugar;
    }

    @Override
    public double getFullGiftPrice(ArrayList<Candy> list, double sumPrice) {
        for (Candy vault : list) {
            sumPrice += vault.getPrice ();
        }
        return sumPrice;
    }

    public StringBuilder findCandyByPrice(double a, double b, ArrayList<Candy> list){
        StringBuilder candy = new StringBuilder (  );
        for(Candy vault : list){
            if((vault.getPrice()>=a && vault.getPrice ()<=b) ||(vault.getPrice ()>=b && vault.getPrice ()<=a)){
                candy.append ( vault.getName ()+"   " );
            }
        }
        return candy;
    }

    public void findElementByPrice(ArrayList<Candy> list){
        System.out.println ("Enter your cost on candy");
        Scanner sc = new Scanner ( System.in );
        double a = sc.nextDouble ();
        double b = sc.nextDouble ();
        StringBuilder item = findCandyByPrice ( a,b,list);
        System.out.println ("Your candies are: "+ item);
    }



}
