import java.util.*;
import behaviours.*;
import items.*;

public class ShoppingBasket{

  // Properties
  private ArrayList<Sellable> basket;
  private boolean discountApplied;
  private Float discountRate;

  // Constructor
  public ShoppingBasket(boolean discountApplied){
    this.basket = new ArrayList<Sellable>();
    this.discountApplied = discountApplied;
    this.discountRate = 0.02f;
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

  // public Float getTotalPrice(){
    
    Float total = new Float(0.00);
    HashMap<String, int> items = new HashMap<String, int>();
    
    for (Sellable item : basket){
      // // Count instances of items in the basket.
      // items.containsKey(item) ? items.put(item.getName, items.get(item) + 1) : items.put(item.getName, 1);
      // if (item.bogof) {
      //   // Add item to basket where not bogof and 'one free'.
      //   total += item.getPrice(); if (items.get(item) % 2 = 1) ;
      // } else {
      //   total += item.getPrice();
      // }
    }    

    // ((total > 20) && discountApplied) ? return total : return total;
    return null;
    }
  }
}