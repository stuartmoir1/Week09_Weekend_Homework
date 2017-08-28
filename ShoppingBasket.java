import java.util.*;
import behaviours.*;
import items.*;

public class ShoppingBasket{

  // Properties
  private ArrayList<Sellable> basket;
  private boolean discountApplied;
  private Float discountRate;
  private Float discountThreshold;

  // Constructor
  public ShoppingBasket(boolean discountApplied){
    this.basket = new ArrayList<Sellable>();
    this.discountApplied = discountApplied;
    this.discountRate = 0.02f;
    this.discountThreshold = 20.00f;
  }

  // Methods

  public int getNumItems(){
    return basket.size();
  }

  public void add(Sellable item){
    basket.add(item);
  }

  public void remove(Sellable item){
    basket.remove(item);
  }

  public void clear(){
    basket.clear();
  }

  // public Float getTotalPrice(){
  //   Float total = new Float(0.00);
  //   for (Sellable item : basket){
  //     total += item.getPrice();
  //   }
  //   return total;
  // }

  public Float getTotalPrice(){
    
    Float total = new Float(0.00);
    HashMap<String, Integer> items = new HashMap<String, Integer>();
    
    for (Sellable item : basket){
      // Count instances of items in the basket.
      if (items.containsKey(item) == true){
        items.put(item.getName(), items.get(item) + 1);
      } else {
        items.put(item.getName(), 1);
      }
      if (item.getBogof() == true) {
        // Add item to basket where not bogof and 'one free'.
        int mod20fItems = items.get(item) % 2;
        total += item.getPrice(); if (mod20fItems == 1);
      } else {
        total += item.getPrice();
      }
    }    

    if ((total > discountThreshold) && discountApplied == true){
      return total * discountRate;
    } else {
      return total;
    }
  }
}