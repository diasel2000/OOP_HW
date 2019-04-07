package HW_OOP.editor;

import HW_OOP.candies.Candy;

import java.util.ArrayList;

public interface GiftFactory {

    public void getFullColection(ArrayList<Candy> list);
    public double getFullGiftWeight(ArrayList<Candy> list,double sumWeight);
    public double getFullGiftShugar(ArrayList<Candy> list, double sumShugar);
    public double getFullGiftPrice(ArrayList<Candy> list, double sumPrice);




}
