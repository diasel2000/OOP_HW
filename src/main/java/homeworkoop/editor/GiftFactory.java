package homeworkoop.editor;

import homeworkoop.candies.Candy;

import java.util.ArrayList;
import java.util.List;

public interface GiftFactory {

    public void getFullColection(List<Candy> list);
    public double getFullGiftWeight(List<Candy> list,double sumWeight);
    public double getFullGiftShugar(List<Candy> list, double sumShugar);
    public double getFullGiftPrice(List<Candy> list, double sumPrice);




}
